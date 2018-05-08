package units.base;

import units.DimensionArray;
import units.Unit;
import units.UnitType;

public class Tempurature extends Unit {

	public static final DimensionArray DIMENSIONS = new DimensionArray(DimensionArray.Index.TEMP.ordinal());
	public static final UnitType UNIT_TYPE = new UnitType(Tempurature.class.getSimpleName(), DIMENSIONS);

	public final static Tempurature KELVIN = new Tempurature(
			new String[] {"kelvin"},
			new String[] {"K"},
			1.0);

	private Tempurature(String[] names, String[] symbols, double magnitude) {
		super(names, symbols, magnitude, UNIT_TYPE);
	}

}
