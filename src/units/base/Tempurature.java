package units.base;

import units.DimensionArray;
import units.Unit;

public class Tempurature extends Unit {

	private static DimensionArray DIMENSIONS = new DimensionArray(DimensionArray.TEMP_INDEX);

	public final static Tempurature KELVIN = new Tempurature(
			new String[] { "kelvin" },
			new String[] { "K" },
			1.0);

	public Tempurature(String[] names, String[] symbols, double magnitude) {
		super(names, symbols, magnitude, DIMENSIONS);
	}

}
