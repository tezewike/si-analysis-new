package calculations;

import java.util.ArrayList;
import java.util.List;

import units.Prefix;
import units.Unit;

public class FunctionBuilder {

	private double numeratorMagnitude = 1.0;
	private double denominatorMagnitude = 1.0;
	private List<FunctionObject> numeratorUnits = new ArrayList<FunctionObject>();
	private List<FunctionObject> denominatorUnits = new ArrayList<FunctionObject>();

	public FunctionBuilder withMagnitude(double magnitude, boolean denominator) {
		if (!denominator)
			this.numeratorMagnitude = magnitude;
		else
			this.denominatorMagnitude = magnitude;
		return this;
	}

	public FunctionBuilder appendObject(FunctionObject object, boolean denominator) {
		if (!denominator)
			this.numeratorUnits.add(object);
		else
			this.denominatorUnits.add(object);
		return this;
	}
	
	public FunctionBuilder appendObject(Unit unit, boolean denominator) {
		return appendObject(null, unit, 1, denominator);
	}
	
	public FunctionBuilder appendObject(Prefix prefix, Unit unit, boolean denominator) {
		return appendObject(prefix, unit, 1, denominator);
	}
	
	public FunctionBuilder appendObject(Unit unit, int exponent, boolean denominator) {
		return appendObject(null, unit, exponent, denominator);
	}
	
	public FunctionBuilder appendObject(Prefix prefix, Unit unit, int exponent, boolean denominator) {
		FunctionObject object = new FunctionObject(prefix, unit, exponent);
		
		if (!denominator)
			this.numeratorUnits.add(object);
		else
			this.denominatorUnits.add(object);
		return this;
	}

	public FunctionGenerator build() {
		return new FunctionGenerator(numeratorMagnitude, denominatorMagnitude, numeratorUnits, denominatorUnits);
	}

}
