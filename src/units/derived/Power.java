package units.derived;

import units.DimensionArray;
import units.Unit;
import units.base.Time;

public class Power extends Unit {

	public static DimensionArray DIMENSIONS = new DimensionArray()
			.multiply(Energy.DIMENSIONS).multiply(Time.DIMENSIONS, -1);

	public final static Power WATT = new Power(
			new String[] {"watt"},
			new String[] {"W"},
			1.0);
	
	private Power(String[] names, String[] symbols, double magnitude) {
		super(names, symbols, magnitude, DIMENSIONS);
	}
	
}