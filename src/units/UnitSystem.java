package units;

import units.base.Amount;
import units.base.Current;
import units.base.Length;
import units.base.Luminosity;
import units.base.Mass;
import units.base.Tempurature;
import units.base.Time;

public class UnitSystem {

	private Unit[] systemArray;
	
	public static int LENGTH_INDEX = 0;
	public static int MASS_INDEX = 1;
	public static int TIME_INDEX = 2;
	public static int CURRENT_INDEX = 3;
	public static int TEMP_INDEX = 4;
	public static int AMOUNT_INDEX = 5;
	public static int LUMIN_INDEX = 6;
	
	public static final UnitSystem NONE = null;
	
	public static final UnitSystem INTERNATIONAL_SYSTEM = new UnitSystem(Length.METER, Mass.KILOGRAM, Time.SECOND,
			Current.AMPERE, Tempurature.KELVIN, Amount.MOLE, Luminosity.CANDELA);
	
	public static final UnitSystem CENTIMETER_GRAM_SECOND = new UnitSystem(Length.CENTIMETER, Mass.GRAM, Time.SECOND,
			Current.AMPERE, Tempurature.KELVIN, Amount.MOLE, Luminosity.CANDELA);
	
	
	private UnitSystem(Length length, Mass mass, Time time, Current current, Tempurature temp, Amount amount, Luminosity luminosity) {
		this.systemArray = new Unit[] { length, mass, time, current, temp, amount, luminosity };
	}
	
	public Unit[] getUnitSystem() {
		return systemArray.clone();
	}
	
}
