package units.derived;

import units.DimensionArray;
import units.Unit;
import units.base.Current;
import units.base.Length;

public class MagneticField extends Unit {

	public static DimensionArray DIMENSIONS = new DimensionArray()
			.multiply(Current.DIMENSIONS).multiply(Length.DIMENSIONS, -1);

	public final static MagneticField TESLA = new MagneticField(
			new String[] {"tesla"},
			new String[] {"T"},
			1.0);
	
	public final static MagneticField GAUSS = new MagneticField(
			new String[] {"gauss"},
			new String[] {"G", "Gs"},
			1.0E-4);
	
	private MagneticField(String[] names, String[] symbols, double magnitude) {
		super(names, symbols, magnitude, DIMENSIONS);
	}
	
}