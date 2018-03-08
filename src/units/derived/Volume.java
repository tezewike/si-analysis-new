package units.derived;

import units.DimensionArray;
import units.Unit;
import units.base.Length;

public class Volume extends Unit {
	
	public static DimensionArray DIMENSIONS = new DimensionArray().multiply(Length.DIMENSIONS, 3);

	public final static Volume LITER = new Volume(
			new String[] {"liter", "litre"},
			new String[] {"L", "l"},
			0.001);
	
	private Volume(String[] names, String[] symbols, double magnitude) {
		super(names, symbols, magnitude, DIMENSIONS);
	}

}
