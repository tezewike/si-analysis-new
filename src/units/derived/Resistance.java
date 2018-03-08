package units.derived;

import units.DimensionArray;
import units.Unit;
import units.base.Current;

public class Resistance extends Unit {

	public static DimensionArray DIMENSIONS = new DimensionArray()
			.multiply(Potential.DIMENSIONS).multiply(Current.DIMENSIONS, -1);

	public final static Resistance OHM = new Resistance(
			new String[] {"ohm"},
			new String[] {"\u03A9", "ohm", "Ohm"},
			1.0);
	
	public final static Resistance ABOHM = new Resistance(
			new String[] {"ohm"},
			new String[] {"ab\u03A9", "aohm", "aOhm"},
			1.0E-9);
	
	private Resistance(String[] names, String[] symbols, double magnitude) {
		super(names, symbols, magnitude, DIMENSIONS);
	}
	
}
