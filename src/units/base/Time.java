package units.base;

import units.DimensionArray;
import units.Unit;

public class Time extends Unit {

	public static DimensionArray DIMENSIONS = new DimensionArray(DimensionArray.TIME_INDEX);

	public final static Time SECOND = new Time(
			new String[] {"second"},
			new String[] {"s", "sec"},
			1.0);
	
	public final static Time MINUTE = new Time(
			new String[] {"minute"},
			new String[] {"min"},
			60.0);
	
	public final static Time HOUR = new Time(
			new String[] {"hour"},
			new String[] {"hr", "h", "hour"},
			3600.0);
	
	public final static Time DAY = new Time(
			new String[] {"day"},
			new String[] {"day", "d"},
			86400.0);
	
	public final static Time WEEK = new Time(
			new String[] {"week"},
			new String[] {"week", "wk"},
			604800.0);
	
	public final static Time YEAR = new Time(
			new String[] {"year", "year (Common)"},
			new String[] {"year", "yr"},
			3.1536E7);
	
	public final static Time JULIAN_YEAR = new Time(
			new String[] {"year", "year (Julian)"},
			new String[] {"a", "yr_J"},
			3.15576E7);

	private Time(String[] names, String[] symbols, double magnitude) {
		super(names, symbols, magnitude, DIMENSIONS);
	}

}
