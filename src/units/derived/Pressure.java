package units.derived;

import units.DimensionArray;
import units.Unit;

public class Pressure extends Unit {

	public static DimensionArray DIMENSIONS = new DimensionArray()
			.multiply(Force.DIMENSIONS).multiply(Area.DIMENSIONS, -1);

	public final static Pressure PASCAL = new Pressure(
			new String[] {"pascal"},
			new String[] {"Pa"},
			1.0);
	
	public final static Pressure STABDARD_ATMOSPHERE = new Pressure(
			new String[] {"standard atmosphere"},
			new String[] {"atm"},
			101325.0);
	
	public final static Pressure BARYE = new Pressure(
			new String[] {"barye", "barad", "bary", "barrie", "baryd"},
			new String[] {"Ba"},
			0.1);
	
	public final static Pressure BAR = new Pressure(
			new String[] {"bar"},
			new String[] {"bar"},
			100000.0);
	
	public final static Pressure PIEZE = new Pressure(
			new String[] {"pieze"},
			new String[] {"pz"},
			1000.0);
	
	public final static Pressure MILLIMETER_OF_MERCURY = new Pressure(
			new String[] {"millimeter of mercury"},
			new String[] {"mmHg"},
			133.322387415);
	
	public final static Pressure POUND_PER_SQAURE_INCH = new Pressure(
			new String[] {"pound per sq. in"},
			new String[] {"psi"},
			6894.757);
	
	private Pressure(String[] names, String[] symbols, double magnitude) {
		super(names, symbols, magnitude, DIMENSIONS);
	}
	
}
