package units.base;

import units.DimensionArray;
import units.Unit;

public class Tempurature extends Unit {

	public static DimensionArray DIMENSIONS = new DimensionArray(DimensionArray.Index.TEMP.ordinal());

	public final static Tempurature KELVIN = new Tempurature(
			new String[] {"kelvin"},
			new String[] {"K"},
			1.0);

	private Tempurature(String[] names, String[] symbols, double magnitude) {
		super(names, symbols, magnitude, DIMENSIONS);
	}

}
