package test;

import calculations.FunctionBuilder;
import units.DimensionArray;
import units.Prefix;
import units.base.*;
import units.derived.*;
import utils.Utils;

public class Tester {

	public static void main(String[] args) {
	//	testBuilder();
		testParser();
	//	testFmt();
		
		System.out.println(new DimensionArray().multiply(Power.DIMENSIONS, 1));
	}

	
	public static void testBuilder() {
		
		FunctionBuilder builder = new FunctionBuilder();
		builder.appendObject(Length.MILE, FunctionBuilder.DENOMINATOR)
				.appendObject(Length.YARD, FunctionBuilder.DENOMINATOR);
		System.out.println(builder.build());
		
		builder = new FunctionBuilder();
		builder.appendObject(Prefix.CENTI, Length.METER, 3, FunctionBuilder.NUMERATOR)
				.appendObject(Prefix.MILLI, Volume.LITER, FunctionBuilder.DENOMINATOR);
		System.out.println(builder.build());
		
		builder = new FunctionBuilder();
		builder.appendObject(Prefix.MILLI, Volume.LITER, FunctionBuilder.NUMERATOR);
		System.out.println(builder.build());
		
	}
	
	public static void testParser() {
		
		FunctionBuilder builder = new FunctionBuilder();
		builder.appendObjectsFromInput("mi yd", FunctionBuilder.DENOMINATOR);
		System.out.println(builder.build());
		
		builder = new FunctionBuilder();
		builder.appendObjectsFromInput("cm^3", FunctionBuilder.NUMERATOR)
				.appendObjectsFromInput("mL", FunctionBuilder.DENOMINATOR);
		System.out.println(builder.build());
		
		builder = new FunctionBuilder();
		builder.appendObjectsFromInput("mL", FunctionBuilder.NUMERATOR);
		System.out.println(builder.build());
		
	}
	
	
	public static void testFmt() {
		System.out.println(Utils.roundDouble(4.3434534535));
		System.out.println(Utils.roundDouble(4.00000000000003));
		System.out.println(Utils.roundDouble(0.12345678));
		System.out.println(Utils.roundDouble(0.012345678));
		System.out.println(Utils.roundDouble(0.0012345678));
		System.out.println(Utils.roundDouble(0.00012345678));
		System.out.println(Utils.roundDouble(0.000012345678));
	}
	
}
