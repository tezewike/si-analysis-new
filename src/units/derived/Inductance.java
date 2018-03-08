package units.derived;

import units.DimensionArray;
import units.Unit;
import units.base.Current;

public class Inductance extends Unit {

	public static DimensionArray DIMENSIONS = new DimensionArray()
			.multiply(Energy.DIMENSIONS).multiply(Current.DIMENSIONS, -2);

	public final static Inductance HENRY = new Inductance(
			new String[] {"henry"},
			new String[] {"H"},
			1.0);
	
	public final static Inductance MAXWELL = new Inductance(
			new String[] {"maxwell"},
			new String[] {"Mx"},
			1.0E-8);
	
	private Inductance(String[] names, String[] symbols, double magnitude) {
		super(names, symbols, magnitude, DIMENSIONS);
	}
	
}
