package test;

import calculations.FunctionBuilder;
import units.Prefix;
import units.base.Length;
import units.derived.Volume;
import utils.Utils;

public class Tester {

	public static void main(String[] args) {
		testBuilder();
	//	testFmt();
	}

	
	public static void testBuilder() {
		
		FunctionBuilder builder = new FunctionBuilder();
		builder.appendObject(Length.MILE, true).appendObject(Length.YARD, true);
		System.out.println(builder.build().toSimpleString());
		
		builder = new FunctionBuilder();
		builder.appendObject(Prefix.CENTI, Length.METER, 3, false).appendObject(Prefix.MILLI, Volume.LITER, true);
		System.out.println(builder.build().toSimpleString());
		
		builder = new FunctionBuilder();
		builder.appendObject(Prefix.MILLI, Volume.LITER, false);
		System.out.println(builder.build().toSimpleString());
		
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
