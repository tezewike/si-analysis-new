package units.base;

import units.DimensionArray;
import units.Unit;

public class Luminosity extends Unit {

	private static DimensionArray DIMENSIONS = new DimensionArray(DimensionArray.LUMIN_INDEX);

	public final static Luminosity CANDELA = new Luminosity(
			new String[] { "candela" },
			new String[] { "cd" },
			1.0);

	public Luminosity(String[] names, String[] symbols, double magnitude) {
		super(names, symbols, magnitude, DIMENSIONS);
	}

}
