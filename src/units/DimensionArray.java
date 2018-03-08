package units;

public class DimensionArray implements Cloneable {

	public static int LENGTH_INDEX = 0;
	public static int MASS_INDEX = 1;
	public static int TIME_INDEX = 2;
	public static int CURRENT_INDEX = 3;
	public static int TEMP_INDEX = 4;
	public static int AMOUNT_INDEX = 5;
	public static int LUMIN_INDEX = 6;
	
	private int[] dimensions;
	public static int ARRAY_LENGTH = 7;
	
	public DimensionArray() {
		this.dimensions = new int[ARRAY_LENGTH];
	}
	
	public DimensionArray(int index) {
		this();
		this.dimensions[index] = 1;
	}
	
	public DimensionArray(int length, int mass, int time, int current, int temp, int amount, int luminosity) {
		this.dimensions = new int[] { length, mass, time, current, temp, amount, luminosity };
	}
	
	private DimensionArray(int[] dimensions) {
		this.dimensions = dimensions.clone();
	}

	public DimensionArray multiply(DimensionArray array) {
		return this.multiply(array.dimensions, 1);
	}

	public DimensionArray multiply(DimensionArray array, int exponent) {
		return this.multiply(array.dimensions, exponent);
	}

	public DimensionArray divide(DimensionArray array) {
		return this.multiply(array.dimensions, -1);
	}

	public DimensionArray divide(DimensionArray array, int exponent) {
		return this.multiply(array.dimensions, -exponent);
	}

	private DimensionArray multiply(int[] array, int exponent) {
		DimensionArray dimensionArray = (DimensionArray) this.clone();

		for (int i = 0; i < ARRAY_LENGTH; i++)
			dimensionArray.dimensions[i] += array[i] * exponent;

		return dimensionArray;
	}

	public DimensionArray exponentiate(int exponent) {
		DimensionArray dimensionArray = (DimensionArray) this.clone();

		for (int i = 0; i < ARRAY_LENGTH; i++)
			dimensionArray.dimensions[i] *= exponent;

		return dimensionArray;
	}

	public DimensionArray reciprocate() {
		return this.exponentiate(-1);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof DimensionArray)
			return this.dimensions.equals(((DimensionArray) obj).dimensions);
		else if (obj instanceof int[])
			return this.dimensions.equals((int[]) obj);
		return super.equals(obj);
	}
	
	@Override
	public Object clone() {
		return new DimensionArray(this.dimensions);
	}
	
}
