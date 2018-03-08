package units.base;

import units.DimensionArray;
import units.Unit;

public class Mass extends Unit {

	private static DimensionArray DIMENSIONS = new DimensionArray(DimensionArray.MASS_INDEX);

	public final static Mass KILOGRAM = new Mass(
			new String[] { "kilogram" },
			new String[] { "kg" },
			1.0);

	public Mass(String[] names, String[] symbols, double magnitude) {
		super(names, symbols, magnitude, DIMENSIONS);
	}

}
