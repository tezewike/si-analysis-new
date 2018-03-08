package units.derived;

import units.DimensionArray;
import units.Unit;

public class Potential extends Unit {

	public static DimensionArray DIMENSIONS = new DimensionArray()
			.multiply(Energy.DIMENSIONS).multiply(Charge.DIMENSIONS, -1);

	public final static Potential VOLT = new Potential(
			new String[] {"volt"},
			new String[] {"V"},
			1.0);
	
	public final static Potential ABVOLT = new Potential(
			new String[] {"abvolt"},
			new String[] {"abV"},
			1.0E-8);
	
	private Potential(String[] names, String[] symbols, double magnitude) {
		super(names, symbols, magnitude, DIMENSIONS);
	}
	
}