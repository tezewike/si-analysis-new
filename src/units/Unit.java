package units;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.List;

public abstract class Unit {
	
	private static Hashtable<String, Unit> map = new Hashtable<>();

	private final String[] names;
	private final String[] symbols;
	private final double magnitude;
	private final UnitType unitType;

	protected Unit(String[] names, String[] symbols, double magnitude, UnitType type) {
		this.names = names;
		this.symbols = symbols;
		this.magnitude = magnitude;
		this.unitType = type;
		
		// TODO - Throw exception if getSymbol() is already in hashmap of units
		for (String symbol : this.symbols) {
			Unit.map.put(symbol, this);
		}
		
		this.unitType.addUnit(this);
	}

	public double getMagnitude() {
		return this.magnitude;
	}

	public DimensionArray getDimensions() {
		return (DimensionArray) this.unitType.getDimensions();
	}

	public String getName() {
		return this.names[0];
	}

	public List<String> getNames() {
		return (List<String>) Arrays.asList(this.names);
	}

	public String getSymbol() {
		return this.symbols[0];
	}

	public List<String> getSymbols() {
		return (List<String>) Arrays.asList(this.symbols);
	}

	public List<Unit> getSimilarUnits() {
		List<Unit> newList = this.unitType.getUnits();
		newList.remove(this);
		return newList;
	}
	
	public static Unit getUnit(String symbol) {
		return Unit.map.get(symbol);
	}
	
	/**
	 * A comparator class used for sorting Units by name.
	 */
	static final class UnitComparator implements Comparator<Unit> {

		@Override
		public int compare(Unit lhs, Unit rhs) {
			return lhs.getName().compareTo(rhs.getName());
		}

	}

}
