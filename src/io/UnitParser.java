package io;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import calculations.FunctionObject;
import units.Prefix;
import units.Unit;

public class UnitParser {

	// TODO - JSON utils and such

	public static List<FunctionObject> parseInput(String input) {
		List<FunctionObject> objects = new ArrayList<>();
		FunctionObject object = null;
		
		Scanner scanner = new Scanner(input);
		String regex = "[\\w_]+(\\^-?\\d+)?";  // Used to parse space separated values with ^ representing an exponent after
		String item;

		while (scanner.hasNext()) {
			item = scanner.next();
			Matcher matcher = Pattern.compile(regex).matcher(item);

			if (matcher.find())
				item = matcher.group();

			object = parseItem(item);
			if (object != null)
				objects.add(object);
		}

		scanner.close();

		return objects;
	}

	private static FunctionObject parseItem(String text) {
		String[] split = text.split("\\^");
		String unitInput = split[0];

		int exponentInput = 1;
		if (split.length > 1) {
			exponentInput = parseExponent(split[1]);
		}

		Unit unit = Unit.get(unitInput);
		Prefix prefix = null;

		if (unit != null) {
			return new FunctionObject(unit, exponentInput);
		} else if (unitInput.length() > 1) {
			prefix = Prefix.get(unitInput.substring(0, 1));
			unit = Unit.get(unitInput.substring(1));

			if (prefix != null && unit != null)
				return new FunctionObject(prefix, unit, exponentInput);
		}

		return null;
	}

	private static int parseExponent(String text) {
		try {
			return Integer.parseInt(text);
		} catch (NumberFormatException nfe) {
			return 1;
		}
	}

}
