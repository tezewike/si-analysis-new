package units.derived;

import units.DimensionArray;
import units.Unit;
import units.UnitType;
import units.base.Mass;

public class Force extends Unit {

	public static final DimensionArray DIMENSIONS = new DimensionArray()
			.multiply(Mass.DIMENSIONS).multiply(Acceleration.DIMENSIONS);
	public static final UnitType UNIT_TYPE = new UnitType(Force.class.getSimpleName(), DIMENSIONS);
	
	public final static Force NEWTON = new Force(
			new String[] {"newton"},
			new String[] {"N"},
			1.0);

	public final static Force DYNE = new Force(
			new String[] {"dyne"},
			new String[] {"dyn", "dyne"},
			1.0E-5);

	public final static Force KILOGRAM_FORCE = new Force(
			new String[] {"kilogram force", "kilogram (weight)", "kilopond"},
			new String[] {"kg_F", "kgf", "kp"},
			9.80665);

	public final static Force GRAM_FORCE = new Force(
			new String[] {"gram force", "gram (weight)"},
			new String[] {"g_F"},
			0.00980665);
	
	public final static Force POUND = new Force(
			new String[] {"pound", "pound force"},
			new String[] {"lb", "lb_F", "lbf"},
			4.4482216152605);
	
	private Force(String[] names, String[] symbols, double magnitude) {
		super(names, symbols, magnitude, UNIT_TYPE);
	}
	
}
