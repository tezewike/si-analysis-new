package test;

import calculations.ExpressionBuilder;
import units.Prefix;
import units.base.Length;
import units.derived.Volume;
import utils.Utils;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testBuilder();
		testFmt();
	}

	
	public static void testBuilder() {
		
		ExpressionBuilder expressionBuilder = new ExpressionBuilder();
		expressionBuilder.addUnit(Length.MILE).addUnit(Length.YARD).asDenominator();
		System.out.println(expressionBuilder);
		
		expressionBuilder = new ExpressionBuilder();
		expressionBuilder.addUnit(Prefix.CENTI, Length.METER, 3).add(new ExpressionBuilder().addUnit(Prefix.MILLI, Volume.LITER).asDenominator());
		System.out.println(expressionBuilder);
		
		expressionBuilder = new ExpressionBuilder();
		expressionBuilder.addUnit(Prefix.MILLI, Volume.LITER);
		System.out.println(expressionBuilder);
		
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
