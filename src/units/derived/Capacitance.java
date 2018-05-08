package units.derived;

import units.DimensionArray;
import units.Unit;
import units.UnitType;

public class Capacitance extends Unit {

	public static final DimensionArray DIMENSIONS = new DimensionArray()
			.multiply(Charge.DIMENSIONS).multiply(Potential.DIMENSIONS, -1);
	public static final UnitType UNIT_TYPE = new UnitType(Capacitance.class.getSimpleName(), DIMENSIONS);

	public final static Capacitance FARAD = new Capacitance(
			new String[] {"farad"},
			new String[] {"F"},
			1.0);
	
	public final static Capacitance ABFARAD = new Capacitance(
			new String[] {"abfarad"},
			new String[] {"abF"},
			1.0E9);
	
	private Capacitance(String[] names, String[] symbols, double magnitude) {
		super(names, symbols, magnitude, UNIT_TYPE);
	}
	
}
