package units.base;

import units.DimensionArray;
import units.Unit;
import units.UnitType;

public class Amount extends Unit {

	public static final DimensionArray DIMENSIONS = new DimensionArray(DimensionArray.Index.AMOUNT.ordinal());
	public static final UnitType UNIT_TYPE = new UnitType(Amount.class.getSimpleName(), DIMENSIONS);

	public final static Amount MOLE = new Amount(
			new String[] { "mole" },
			new String[] { "mol" },
			1.0);

	private Amount(String[] names, String[] symbols, double magnitude) {
		super(names, symbols, magnitude, UNIT_TYPE);
	}

}
