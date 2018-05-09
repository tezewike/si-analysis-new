package calculations;

import java.util.List;

import units.DimensionArray;
import units.Unit;
import units.UnitSystem;
import utils.Utils;

public class FunctionGenerator {

	private double numeratorMagnitude;
	private double denominatorMagnitude;
	private List<FunctionObject> numeratorUnits;
	private List<FunctionObject> denominatorUnits;

	private double resultMagnitude = 1.0;
	private DimensionArray resultDimensions;

	public FunctionGenerator(double numerMag, double denomMag, List<FunctionObject> numerUnits,
			List<FunctionObject> denomUnits) {
		this.numeratorMagnitude = numerMag;
		this.denominatorMagnitude = denomMag;
		this.numeratorUnits = numerUnits;
		this.denominatorUnits = denomUnits;

		this.calculate();
	}

	private void calculate() {
		double magnitude = numeratorMagnitude / denominatorMagnitude;
		DimensionArray dimensions = new DimensionArray();

		FunctionObject object;

		// Numerators
		for (int i = 0; i < numeratorUnits.size(); i++) {
			object = numeratorUnits.get(i);
			magnitude *= object.getValue();
			dimensions = dimensions.multiply(object.getDimensions());
		}

		// Denominators
		for (int i = 0; i < denominatorUnits.size(); i++) {
			object = denominatorUnits.get(i);
			magnitude /= object.getValue();
			dimensions = dimensions.divide(object.getDimensions());
		}

		this.resultMagnitude = magnitude;
		this.resultDimensions = dimensions;
	}

	public String toSimpleString() {
		String input = formatInputMagnitudes() + " " + formatInputUnits(false);
		String output = formatOutput(false);

		return input.trim() + " = " + output.trim();
	}

	private String formatOutput(boolean asName) {
		String magnitude = Utils.roundDouble(resultMagnitude);
		if (resultDimensions.isEmpty())
			return "" + magnitude;

		String str = "";
		Unit[] units = UnitSystem.INTERNATIONAL_SYSTEM.getUnitSystem();
		int exponent;

		for (int i = 0; i < units.length; i++) {
			exponent = resultDimensions.getExponent(i);
			if (exponent != 0) {
				if (!asName)
					str += units[i].getSymbol();
				else
					str += units[i].getName();

				if (exponent != 1)
					str += Utils.toSuperscript(exponent);

				str += " ";
			}
		}

		if (magnitude.equals("1"))
			return str;

		return magnitude + " " + str;
	}

	private String formatInputMagnitudes() {
		if (numeratorMagnitude == 1.0 && denominatorMagnitude == 1.0)
			return "";
		else if (denominatorMagnitude == 1.0)
			return Utils.roundDouble(numeratorMagnitude);
		return Utils.roundDouble(numeratorMagnitude) + "/" + Utils.roundDouble(denominatorMagnitude);
	}

	private String formatInputUnits(boolean asName) {
		String numer = formatObjects(numeratorUnits, asName);
		String denom = formatObjects(denominatorUnits, asName);

		if (numer.isEmpty() && denom.isEmpty())
			return "1";
		else if (denom.isEmpty())
			return numer;
		else if (numer.isEmpty())
			return 1 + "/" + denom;

		return numer + "/" + denom;
	}

	private String formatObjects(List<FunctionObject> objects, boolean asName) {
		String str = "";

		int exponent;
		for (FunctionObject object : objects) {
			if (!asName)
				str += object.getSymbol();
			else
				str += object.getName();

			exponent = object.getExponent();
			if (exponent != 1)
				str += Utils.toSuperscript(exponent);

			str += " ";
		}

		return str.trim();
	}

	@Override
	public String toString() {
		return getClass().getName() + "[" + toSimpleString() + "]";
	}

}
