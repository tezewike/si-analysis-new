package units;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public abstract class Unit {

	protected String[] names;
	protected String[] symbols;
	protected DimensionArray dimensions;
	protected double magnitude;	

	protected Unit(String[] names, String[] symbols, double magnitude, DimensionArray dimensions) {
		this.names = names;
		this.symbols = symbols;
		this.magnitude = magnitude;
		this.dimensions = dimensions;
	}

	public double getMagnitude() {
		return magnitude;
	}

	public DimensionArray getDimensions() {
		return (DimensionArray) dimensions.clone();
	}

	public String getName() {
		return names[0];
	}

	public List<String> getNames() {
		return (List<String>) Arrays.asList(names);
	}

	public String getSymbol() {
		return symbols[0];
	}

	public List<String> getSymbols() {
		return (List<String>) Arrays.asList(symbols);
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
