package calculations;

import units.DimensionArray;
import units.Prefix;
import units.Unit;

public class FunctionObject {

	private final Prefix prefix;
	private final Unit unit;
	private final int exponent;
	
	public FunctionObject(Prefix prefix, Unit unit, int exponent) {
		this.prefix = prefix;
		this.unit = unit;
		this.exponent = exponent;
	}
	
	public DimensionArray getDimensions() {
		return unit.getDimensions().exponentiate(exponent);
	}
	
	public String getName() {
		String name = "";
		
		if (prefix != null)
			name += prefix.getName();
		if (unit != null)
			name += unit.getName();
		
		return name;
	}

	public String getSymbol() {
		String symbol = "";
		
		if (prefix != null)
			symbol += prefix.getSymbol();
		if (unit != null)
			symbol += unit.getSymbol();
		
		return symbol;
	}
	
	public int getExponent() {
		return exponent;
	}
	
	public double getValue() {
		double value = 1.0;
		if (prefix != null)
			value *= prefix.getMagnitude();
		value *= unit.getMagnitude();

		return Math.pow(value, exponent);
	} 

}
