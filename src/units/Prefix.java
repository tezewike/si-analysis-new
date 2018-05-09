package units;

import java.util.Comparator;
import java.util.Hashtable;

public final class Prefix {
	
	private static Hashtable<String, Prefix> map = new Hashtable<>();

	private final String name;
	private final String symbol;
	private final double magnitude;

	public static final Prefix YOTTA = new Prefix("yotta", "Y", 1.0E24);
	public static final Prefix ZETTA = new Prefix("zetta", "Z", 1.0E21);
	public static final Prefix EXA = new Prefix("exa", "E", 1.0E18);
	public static final Prefix PETA = new Prefix("peta", "P", 1.0E15);
	public static final Prefix TERRA = new Prefix("terra", "T", 1.0E12);
	public static final Prefix GIGA = new Prefix("giga", "G", 1.0E9);
	public static final Prefix MEGA = new Prefix("mega", "M", 1000000.0);
	public static final Prefix KILO = new Prefix("kilo", "k", 1000.0);
	public static final Prefix HECTO = new Prefix("hecto", "h", 100.0);
	public static final Prefix DECA = new Prefix("deca", "D", 10.0);
	public static final Prefix DECI = new Prefix("deci", "d", 0.1);
	public static final Prefix CENTI = new Prefix("centi", "c", 0.01);
	public static final Prefix MILLI = new Prefix("milli", "m", 0.001);
	public static final Prefix MICRO = new Prefix("micro", "u", 1.0E-6); // TODO - setAlias()?
	public static final Prefix NANO = new Prefix("nano", "n", 1.0E-9);
	public static final Prefix PICO = new Prefix("pico", "p", 1.0E-12);
	public static final Prefix FEMTO = new Prefix("femto", "f", 1.0E-15);
	public static final Prefix ATTO = new Prefix("atto", "a", 1.0E-18);
	public static final Prefix ZEPTO = new Prefix("zepto", "z", 1.0E-21);
	public static final Prefix YOCTO = new Prefix("yocto", "y", 1.0E-24);

	public Prefix(String name, String symbol, double magnitude) {
		this.name = name;
		this.symbol = symbol;
		this.magnitude = magnitude;
		
		Prefix.map.put(symbol, this);
	}

	public String getName() {
		return this.name;
	}

	public String getSymbol() {
		return this.symbol;
	}

	public double getMagnitude() {
		return this.magnitude;
	}
	
	public static Prefix get(String symbol) {
		return map.get(symbol);
	}

	/**
	 * A comparator class used for sorting Prefixes by the value of their factor.
	 */
	static final class PrefixComparator implements Comparator<Prefix> {

		@Override
		public int compare(Prefix lhs, Prefix rhs) {
			return Double.compare(rhs.getMagnitude(), lhs.getMagnitude());
		}

	}

}
