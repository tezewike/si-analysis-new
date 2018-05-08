package units.derived;

import units.DimensionArray;
import units.Unit;
import units.UnitType;

public class MagneticFlux extends Unit {

	public static final DimensionArray DIMENSIONS = new DimensionArray()
			.multiply(MagneticField.DIMENSIONS).multiply(Area.DIMENSIONS, -1);
	public static final UnitType UNIT_TYPE = new UnitType(MagneticFlux.class.getSimpleName(), DIMENSIONS);

	public final static MagneticFlux WEBER = new MagneticFlux(
			new String[] {"weber"},
			new String[] {"Wb"},
			1.0);
	
	private MagneticFlux(String[] names, String[] symbols, double magnitude) {
		super(names, symbols, magnitude, UNIT_TYPE);
	}
	
}
