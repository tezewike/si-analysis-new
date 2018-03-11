package test;

import calculations.Builder;
import units.Prefix;
import units.base.Length;
import units.derived.Volume;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testBuilder();
	}

	
	public static void testBuilder() {
		Builder builder = new Builder();
		builder.addUnit(Length.MILE).addUnit(Length.YARD);
		System.out.println(builder);
		
		builder = new Builder();
		builder.addUnit(Prefix.CENTI, Length.METER, 3);
		System.out.println(builder);
		
		builder = new Builder();
		builder.addUnit(Prefix.MILLI, Volume.LITER);
		System.out.println(builder);
		
	}
	
}
