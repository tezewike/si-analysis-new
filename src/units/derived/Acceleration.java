package units.derived;

import units.DimensionArray;
import units.Unit;
import units.UnitType;
import units.base.Time;

public class Acceleration extends Unit {

	public static final DimensionArray DIMENSIONS = new DimensionArray()
			.multiply(Velocity.DIMENSIONS).multiply(Time.DIMENSIONS, -1);
	public static final UnitType UNIT_TYPE = new UnitType(Acceleration.class.getSimpleName(), DIMENSIONS);

	public final static Acceleration GALILEO = new Acceleration(
			new String[] {"galileo"},
			new String[] {"Gal"},
			0.01);
	
	public final static Acceleration STANDARD_GRAVITY = new Acceleration(
			new String[] {"standard gravity"},
			new String[] {"g_0"},
			9.80665);
	
	private Acceleration(String[] names, String[] symbols, double magnitude) {
		super(names, symbols, magnitude, UNIT_TYPE);
	}
	
}
