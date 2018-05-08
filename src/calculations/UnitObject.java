package calculations;

import units.DimensionArray;
import units.Prefix;
import units.Unit;
import utils.Utils;

public class UnitObject {
	
	private final Prefix prefix;
	private final Unit unit;
	private final int exponent;
	private boolean denominator = false;
	
	public UnitObject(Prefix prefix, Unit unit, int exponent) {
		this.prefix = prefix;
		this.unit = unit;
		this.exponent = exponent;
	}
	
	public double getValue() {
		double value = 1.0;
		
		if (prefix != null)
			value *= prefix.getMagnitude();
		value *= unit.getMagnitude();

		if (denominator)
			return Math.pow(value, -exponent);
		return Math.pow(value, exponent);
	}
	
	public DimensionArray getDimensions() {
		return this.unit.getDimensions().exponentiate(this.getExponent());
	}
	
	public UnitObject asNumerator() {
		this.denominator = false;
		return this;
	}
	
	public UnitObject asDenominator() {
		this.denominator = true;
		return this;
	}

	public int getExponent() {
		if (denominator)
			return -exponent;
		return exponent;
	}
	
	private String exponentAsSuperscript() {
		int exp = this.getExponent();
		
		if (exp == 1)
			return "";
		return Utils.toSuperscript(exp);
	}
	
	public String getName() {
		String name = "";
		
		if (prefix != null)
			name += prefix.getName();
		name += unit.getName();
		
		return name;
	}

	public String getSymbol() {
		String symbol = "";
		
		if (prefix != null)
			symbol += prefix.getSymbol();
		symbol += unit.getSymbol();
		
		return symbol;
	}

	public String asItem() {	
		return this.getSymbol() + this.exponentAsSuperscript();
	}
	
	public String asNameItem() {
		return this.getName() + this.exponentAsSuperscript();
	}
	
}
