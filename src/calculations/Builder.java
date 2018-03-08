package calculations;

import units.DimensionArray;

public class Builder {

	private double magnitude = 1;
	private DimensionArray dimensions = new DimensionArray();
	
	public Builder() {}
	
	public Builder withMagnitude(double magnitude) {
		this.magnitude = magnitude;
		return this;
	}
	
	public Builder asNumerator() {
		return this;
	}
	
	// Must be called ONLY at the end of the chain
	public Builder asDenominator() {
		this.magnitude = 1.0 / this.magnitude;
		this.dimensions.reciprocate();
		return this;
	}
	
}
