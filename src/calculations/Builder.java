package calculations;

import units.DimensionArray;
import units.Prefix;
import units.Unit;
import units.UnitSystem;
import utils.Utils;

public class Builder {

	private double magnitude = 1.0;
	private DimensionArray dimensions = new DimensionArray();
	private String input = "";
	
	public Builder() {}
	
	public Builder withMagnitude(double magnitude) {
		this.magnitude = magnitude;
		return this;
	}
	
	public Builder asNumerator() {
		return this;
	}
	
	// Must be called ONLY at the end of the chain
	// TODO - Set boolean so methods decide what to do on output
	public Builder asDenominator() {
		this.magnitude = 1.0 / magnitude;
		this.dimensions = dimensions.reciprocate();
		return this;
	}
	
	public Builder addUnit(Unit unit) {
		return addUnit(null, unit, 1);
	}
	
	public Builder addUnit(Prefix prefix, Unit unit) {
		return addUnit(prefix, unit, 1);
	}
	
	public Builder addUnit(Unit unit, int exponent) {
		return addUnit(null, unit, exponent);
	}
	
	public Builder addUnit(Prefix prefix, Unit unit, int exponent) {
		double unitValue = unit.getMagnitude();
		
		if (prefix != null) {
			unitValue *= prefix.getMagnitude();
		}
		
		this.magnitude *= Math.pow(unitValue, exponent);
		this.dimensions = dimensions.multiply(unit.getDimensions(), exponent);
		
		this.input += unitString(prefix, unit, exponent) + " ";
		
		return this;
	}
	
	private String unitString(Prefix prefix, Unit unit, int exponent) {
		String str = "";

		if (prefix != null) {
			str = prefix.getName();
		}
		
		str += unit.getName();
		
		if (exponent != 0 && exponent != 1) {
			str += Utils.toSuperscript(exponent);
		}
		
		return str;		
	}
	
	public String asString() {
		return asString(UnitSystem.INTERNATIONAL_SYSTEM);
	}
	
	public String asString(UnitSystem system) {
		Unit[] unitSystem = system.getUnitSystem();
		double outputMagnitude = magnitude;
		String output = "";
		
		int exponent = 1;
		
		for (int i = 0; i < unitSystem.length; i++) {
			exponent = dimensions.getExponent(i);
			
			if (exponent != 0) {
				outputMagnitude *= Math.pow(unitSystem[i].getMagnitude(), exponent);
				output += unitSystem[i].getSymbol() + Utils.toSuperscript(exponent) + " ";
			}
                
		}
		
		return input + "= " + outputMagnitude + " " + output;
	}
	
	@Override
	public String toString() {
		return asString();
	}
	
}
