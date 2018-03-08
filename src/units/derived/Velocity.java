package units.derived;

import units.DimensionArray;
import units.Unit;
import units.base.Length;

public class Velocity extends Unit {
	
	public static DimensionArray DIMENSIONS = new DimensionArray().multiply(Length.DIMENSIONS, 3);

	public final static Velocity SPEED_OF_LIGHT = new Velocity(
			new String[] {"speed of light"},
			new String[] {"c"},
			2.99792458E8);
	
	public final static Velocity KILOMETERS_PER_HOUR = new Velocity(
			new String[] {"kilometers per hour"},
			new String[] {"kph","km/h"},
			0.2777777777778);
	
	public final static Velocity MILES_PER_HOUR = new Velocity(
			new String[] {"miles per hour"},
			new String[] {"mph","mi/h"},
			0.44704);
	
	private Velocity(String[] names, String[] symbols, double magnitude) {
		super(names, symbols, magnitude, DIMENSIONS);
	}

}
