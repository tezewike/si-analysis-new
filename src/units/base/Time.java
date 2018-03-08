package units.base;

import units.DimensionArray;
import units.Unit;

public class Time extends Unit {

	private static DimensionArray DIMENSIONS = new DimensionArray(DimensionArray.TIME_INDEX);

	public final static Time SECOND = new Time(
			new String[] { "second" },
			new String[] { "s" },
			1.0);

	public Time(String[] names, String[] symbols, double magnitude) {
		super(names, symbols, magnitude, DIMENSIONS);
	}

}
