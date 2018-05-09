package units;

import units.base.*;
import units.derived.*;

public class UnitCategory {

	public static final Class<?>[] BASE_UNITS = new Class[] { Amount.class, Current.class, Length.class,
			Luminosity.class, Mass.class, Tempurature.class, Time.class };

	public static final Class<?>[] DERIVED_UNITS = new Class[] { Acceleration.class, Area.class, Capacitance.class,
			Charge.class, Energy.class, Force.class, Frequency.class, Inductance.class, MagneticField.class,
			MagneticFlux.class, Potential.class, Power.class, Pressure.class, Resistance.class, Velocity.class,
			Volume.class };

	/*
	public static Class<?>[] spacial = new Class[] { Length.class, Area.class, Volume.class };
	public static Class<?>[] physical;
	public static Class[] rate;
	public static Class[] electrical;
	public static Class[] temporal;
	*/
	
	private UnitCategory() {}
	
}
