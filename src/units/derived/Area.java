package units.derived;

import units.DimensionArray;
import units.Unit;
import units.base.Length;

public class Area extends Unit {
	
	public static DimensionArray DIMENSIONS = new DimensionArray().multiply(Length.DIMENSIONS, 2);

	private Area(String[] names, String[] symbols, double magnitude) {
		super(names, symbols, magnitude, DIMENSIONS);
	}

}
