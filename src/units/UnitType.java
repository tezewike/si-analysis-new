package units;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnitType {
	
	private final String name;
	private final DimensionArray dimensions;
	private final List<Unit> unitList = new ArrayList<>();
	
	public UnitType(String name, DimensionArray dimensions) {
		this.name = name;
		this.dimensions = dimensions;
	}
	
	public DimensionArray getDimensions() {
		return this.dimensions;
	}
	
	public List<Unit> getUnits() {
		ArrayList<Unit> newList = new ArrayList<Unit> (unitList.size());
		Collections.copy(newList, unitList);
		return newList;
	}
	
	protected void addUnit(Unit unit) {
		this.unitList.add(unit);
	}
	
	@Override
	public String toString() {
		return name;
	}

}
