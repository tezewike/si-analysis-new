package units.base;

import units.DimensionArray;
import units.Unit;

public class Mass extends Unit {

	public static DimensionArray DIMENSIONS = new DimensionArray(DimensionArray.Index.MASS.ordinal());

	public final static Mass KILOGRAM = new Mass(
			new String[] {"kilogram", "kilogramme"},
			new String[] {"kg"},
			1.0);
	
	public final static Mass GRAM = new Mass(
			new String[] {"gram", "gramme"},
			new String[] {"g", "gm"},
			0.001);
	
	public final static Mass METRIC_TON = new Mass(
			new String[] {"tonne", "metric ton"},
			new String[] {"t"},
			1000.0);
	
	public final static Mass ATOMIC_MASS_UNIT = new Mass(
			new String[] {"atomic mass unit", "Dalton"},
			new String[] {"amu", "u", "Da"},
			1.66053904E-27);
	
	public final static Mass POUND_MASS = new Mass(
			new String[] {"pound mass"},
			new String[] {"lb_m", "lbm"},
			0.45359237);

	private Mass(String[] names, String[] symbols, double magnitude) {
		super(names, symbols, magnitude, DIMENSIONS);
	}

}
