package calculations;

import java.util.ArrayList;
import java.util.List;

import units.DimensionArray;
import units.Prefix;
import units.Unit;
import units.UnitSystem;
import utils.Utils;

public class ExpressionBuilder {

	private double magnitude = 1.0;
	private List<UnitObject> list = new ArrayList<>();
	private UnitSystem system = UnitSystem.INTERNATIONAL_SYSTEM;
	
	public ExpressionBuilder() {}
	
	public ExpressionBuilder withMagnitude(double magnitude) {
		this.magnitude = magnitude;
		return this;
	}
	
	public ExpressionBuilder asNumerator() {
		this.setList(false);
		return this;
	}
	
	// Must be called ONLY at the end of the chain
	// TODO - Set boolean so methods decide what to do on output
	public ExpressionBuilder asDenominator() {
		this.setList(true);
		return this;
	}
	
	public ExpressionBuilder add(ExpressionBuilder expressionBuilder) {
		this.list.addAll(expressionBuilder.list);
		return this;
	}
	
	public ExpressionBuilder addUnit(Unit unit) {
		return addUnit(null, unit, 1);
	}
	
	public ExpressionBuilder addUnit(Prefix prefix, Unit unit) {
		return addUnit(prefix, unit, 1);
	}
	
	public ExpressionBuilder addUnit(Unit unit, int exponent) {
		return addUnit(null, unit, exponent);
	}
	
	public ExpressionBuilder addUnit(Prefix prefix, Unit unit, int exponent) {
		this.list.add(new UnitObject(prefix, unit, exponent));
		return this;
	}
	
	private void setList(boolean denominator) {
		for (UnitObject object : list) {
			if (denominator)
				object.asDenominator();
			else
				object.asNumerator();
		}
	}

	public String output() {
		String output = "";
		
		Unit[] units = system.getUnitSystem();
		double outputMagnitude = magnitude;
		DimensionArray dimensions = new DimensionArray();
		
		UnitObject object;
		
		for (int i = 0; i < list.size(); i++) {
			object = list.get(i);
			outputMagnitude *= object.getValue();
			dimensions = dimensions.multiply(object.getDimensions());
		}
		
		output += Utils.roundDouble(outputMagnitude) + " ";
		
		int exponent;
		for (int i = 0; i < units.length; i++) {
			exponent = dimensions.getExponent(i);
			if (exponent != 0) {
				output += units[i].getSymbol() + Utils.toSuperscript(exponent) + " ";
			}
		}
		
		return output.trim();
	}
	
	public String input() {
		String input = "";
		for (UnitObject object : list) {
			input += object.asItem() + " ";
		}
		
		return input;
	}
	
	public String build() {
		return format(magnitude, this.input(), 1, this.output());
	}
	
	private String format(double inputMagnitude, String input, double outputMagnitude, String output) {
		String str = "";
		
		//TODO - format magnitude
		
		if (inputMagnitude != 1.0)
			str += inputMagnitude + " ";
		str += input.trim();
		
		str += " = ";
		
		if (outputMagnitude != 1.0)
			str += outputMagnitude + " ";
		str += output.trim();
		
		return str;
	}
	
	public String toString() {
		return this.build();
	}
	
}
