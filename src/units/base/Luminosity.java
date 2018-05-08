package units.base;

import units.DimensionArray;
import units.Unit;
import units.UnitType;

public class Luminosity extends Unit {

	public static final DimensionArray DIMENSIONS = new DimensionArray(DimensionArray.Index.LUMIN.ordinal());
	public static final UnitType UNIT_TYPE = new UnitType(Luminosity.class.getSimpleName(), DIMENSIONS);

	public final static Luminosity CANDELA = new Luminosity(
			new String[] { "candela" },
			new String[] { "cd" },
			1.0);

	private Luminosity(String[] names, String[] symbols, double magnitude) {
		super(names, symbols, magnitude, UNIT_TYPE);
	}

}
