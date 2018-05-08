package units.base;

import units.DimensionArray;
import units.Unit;
import units.UnitType;

public class Current extends Unit {

	public static final DimensionArray DIMENSIONS = new DimensionArray(DimensionArray.Index.CURRENT.ordinal());
	public static final UnitType UNIT_TYPE = new UnitType(Current.class.getSimpleName(), DIMENSIONS);
	
	public final static Current AMPERE = new Current(
			new String[] {"ampere", "amp"},
			new String[] {"A"},
			1.0);
	
	public final static Current ABAMPERE = new Current(
			new String[] {"abampere", "Biot"},
			new String[] {"abA", "Bi"},
			10.0);

	private Current(String[] names, String[] symbols, double magnitude) {
		super(names, symbols, magnitude, UNIT_TYPE);
	}

}
