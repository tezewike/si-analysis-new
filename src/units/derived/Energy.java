package units.derived;

import units.DimensionArray;
import units.Unit;
import units.UnitType;
import units.base.Length;

public class Energy extends Unit {

	public static final DimensionArray DIMENSIONS = new DimensionArray()
			.multiply(Force.DIMENSIONS).multiply(Length.DIMENSIONS);
	public static final UnitType UNIT_TYPE = new UnitType(Energy.class.getSimpleName(), DIMENSIONS);

	public final static Energy JOULE = new Energy(
			new String[] {"joule"},
			new String[] {"J"},
			1.0);
	
	public final static Energy ELECTRONVOLT = new Energy(
			new String[] {"electronvolt"},
			new String[] {"eV"},
			1.6021766209E-19);
	
	public final static Energy ERG = new Energy(
			new String[] {"erg"},
			new String[] {"erg"},
			1.0E-7);
	
	public final static Energy CALORIE = new Energy(
			new String[] {"calorie", "gram calorie", "small calorie"},
			new String[] {"cal"},
			4.184);
	
	public final static Energy KILOWATT_HOUR = new Energy(
			new String[] {"kilowatt hour"},
			new String[] {"kWh"},
			3600000.0);
	
	public final static Energy WATT_HOUR = new Energy(
			new String[] {"watt hour"},
			new String[] {"Wh"},
			3600.0);
	
	private Energy(String[] names, String[] symbols, double magnitude) {
		super(names, symbols, magnitude, UNIT_TYPE);
	}
	
}
