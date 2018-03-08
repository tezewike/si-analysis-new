package units.base;

import units.DimensionArray;
import units.Unit;

public class Current extends Unit {

	private static DimensionArray DIMENSIONS = new DimensionArray(DimensionArray.CURRENT_INDEX);
	
	public final static Current AMPERE = new Current(
			new String[] { "ampere", "amp" },
			new String[] { "A" },
			1.0);

	public Current(String[] names, String[] symbols, double magnitude) {
		super(names, symbols, magnitude, DIMENSIONS);
	}

}
