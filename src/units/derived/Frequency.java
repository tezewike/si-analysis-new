package units.derived;

import units.DimensionArray;
import units.Unit;
import units.UnitType;
import units.base.Time;

public class Frequency extends Unit {

	public static final DimensionArray DIMENSIONS = new DimensionArray().multiply(Time.DIMENSIONS, -1);
	public static final UnitType UNIT_TYPE = new UnitType(Frequency.class.getSimpleName(), DIMENSIONS);

	public final static Frequency HERTZ = new Frequency(
			new String[] {"hertz"},
			new String[] {"Hz"},
			0.001);
	
	private Frequency(String[] names, String[] symbols, double magnitude) {
		super(names, symbols, magnitude, UNIT_TYPE);
	}
	
}
