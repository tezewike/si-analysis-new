package units.base;

import units.DimensionArray;
import units.Unit;

public class Length extends Unit {

	public static DimensionArray DIMENSIONS = new DimensionArray(DimensionArray.Index.LENGTH.ordinal());

	public final static Length METER = new Length(
			new String[] {"meter", "metre"},
			new String[] {"m"},
			1.0);
	
	public final static Length CENTIMETER = new Length(
			new String[] {"centimeter", "centimetre"},
			new String[] {"cm"},
			0.01);
	
	public final static Length INCH = new Length(
			new String[] {"inch"},
			new String[] {"in", "inch"},
			0.0254);
	
	public final static Length FOOT = new Length(
			new String[] {"foot"},
			new String[] {"ft", "foot"},
			0.3048);
	
	public final static Length YARD = new Length(
			new String[] {"yard"},
			new String[] {"yd", "yard"},
			0.9144);
	
	public final static Length MILE = new Length(
			new String[] {"mile", "English mile"},
			new String[] {"mi", "mile"},
			1609.344);
	
	public final static Length NAUTICAL_MILE = new Length(
			new String[] {"nautical mile"},
			new String[] {"NM", "nmi"},
			1852.0);

	public final static Length LIGHT_YEAR = new Length(
			new String[] {"light year"},
			new String[] {"ly"},
			9.4607304725808E15);
	
	public final static Length ASTRONOMICAL_UNIT = new Length(
			new String[] {"astronomical unit"},
			new String[] {"AU", "ua"},
			1.495978707E11);
	
	public final static Length PARSEC = new Length(
			new String[] {"parsec"},
			new String[] {"pc"},
			3.085677581E16);
	
	public final static Length ANGSTROM = new Length(
			new String[] {"angstrom"},
			new String[] {"A"},
			1.0E-10);
	
	private Length(String[] names, String[] symbols, double magnitude) {
		super(names, symbols, magnitude, DIMENSIONS);
	}

}
