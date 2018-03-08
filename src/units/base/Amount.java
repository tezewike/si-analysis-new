package units.base;

import units.DimensionArray;
import units.Unit;

public class Amount extends Unit {

	public static DimensionArray DIMENSIONS = new DimensionArray(DimensionArray.AMOUNT_INDEX);

	public final static Amount MOLE = new Amount(
			new String[] { "mole" },
			new String[] { "mol" },
			1.0);

	private Amount(String[] names, String[] symbols, double magnitude) {
		super(names, symbols, magnitude, DIMENSIONS);
	}

}
