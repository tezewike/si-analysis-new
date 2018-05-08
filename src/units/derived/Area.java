package units.derived;

import units.DimensionArray;
import units.Unit;
import units.UnitType;
import units.base.Length;

public class Area extends Unit {
	
	public static final DimensionArray DIMENSIONS = new DimensionArray().multiply(Length.DIMENSIONS, 2);
	public static final UnitType UNIT_TYPE = new UnitType(Area.class.getSimpleName(), DIMENSIONS);

	private Area(String[] names, String[] symbols, double magnitude) {
		super(names, symbols, magnitude, UNIT_TYPE);
	}
	
}
