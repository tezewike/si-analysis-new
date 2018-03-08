package units.base;

import units.DimensionArray;
import units.Unit;

public class Length extends Unit {

	private static DimensionArray DIMENSIONS = new DimensionArray(DimensionArray.LENGTH_INDEX);

	public final static Length METER = new Length(
			new String[] { "meter" },
			new String[] { "m" },
			1.0);

	public Length(String[] names, String[] symbols, double magnitude) {
		super(names, symbols, magnitude, DIMENSIONS);
	}

}
