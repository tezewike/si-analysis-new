package units.base;

import units.DimensionArray;
import units.Unit;

public class Luminosity extends Unit {

	public static DimensionArray DIMENSIONS = new DimensionArray(DimensionArray.Index.LUMIN.ordinal());

	public final static Luminosity CANDELA = new Luminosity(
			new String[] { "candela" },
			new String[] { "cd" },
			1.0);

	private Luminosity(String[] names, String[] symbols, double magnitude) {
		super(names, symbols, magnitude, DIMENSIONS);
	}

}
