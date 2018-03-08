package units.derived;

import units.DimensionArray;
import units.Unit;
import units.base.Current;
import units.base.Time;

public class Charge extends Unit {

	public static DimensionArray DIMENSIONS = new DimensionArray()
			.multiply(Current.DIMENSIONS).multiply(Time.DIMENSIONS, -1);

	public final static Charge COULOMB = new Charge(
			new String[] {"coulomb"},
			new String[] {"C"},
			1.0);
	
	public final static Charge ABACOULOMB = new Charge(
			new String[] {"abacoulomb", "emu of charge"},
			new String[] {"abC", "aC"},
			10.0);
	
	private Charge(String[] names, String[] symbols, double magnitude) {
		super(names, symbols, magnitude, DIMENSIONS);
	}
	
	
}
