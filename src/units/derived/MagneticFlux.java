package units.derived;

import units.DimensionArray;
import units.Unit;

public class MagneticFlux extends Unit {

	public static DimensionArray DIMENSIONS = new DimensionArray()
			.multiply(MagneticField.DIMENSIONS).multiply(Area.DIMENSIONS, -1);

	public final static MagneticFlux WEBER = new MagneticFlux(
			new String[] {"weber"},
			new String[] {"Wb"},
			1.0);
	
	private MagneticFlux(String[] names, String[] symbols, double magnitude) {
		super(names, symbols, magnitude, DIMENSIONS);
	}
	
}
