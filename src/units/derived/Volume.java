package units.derived;

import units.DimensionArray;
import units.Unit;
import units.UnitType;
import units.base.Length;

public class Volume extends Unit {
	
	public static final DimensionArray DIMENSIONS = new DimensionArray().multiply(Length.DIMENSIONS, 3);
	public static final UnitType UNIT_TYPE = new UnitType(Volume.class.getSimpleName(), DIMENSIONS);

	public final static Volume LITER = new Volume(
			new String[] {"liter", "litre"},
			new String[] {"L", "l"},
			0.001);
	
	private Volume(String[] names, String[] symbols, double magnitude) {
		super(names, symbols, magnitude, UNIT_TYPE);
	}

}
