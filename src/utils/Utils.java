package utils;

import java.text.DecimalFormat;

public class Utils {

    public static String toSuperscript(int num) {
        char SUPER = '\u2070';
        char MINUS = '\u207B';
        
        String number = String.valueOf(num);
        String output = "";
        char script = 0;
        char digit;
        
        for (int i = 0; i < number.length(); i++) {
            digit = number.charAt(i);
            
            if (digit == '-') {
                script = MINUS;
            } else if (digit >= '4' && digit <= '9' || digit == '0') {
                script = (char) (SUPER + Integer.valueOf(String.valueOf(digit)));
            } else if (digit == '1'){
                script = '\u00B9';
            } else if (digit == '2') {
                script = '\u00B2';
            } else if (digit == '3') {
                script = '\u00B3';
            }
            
            output += script;
        }
        
        return output;
    }
    
    public static String roundDouble(double num) {
    	DecimalFormat normalNotation = new DecimalFormat("#0.######");
    	DecimalFormat scientificNotation = new DecimalFormat("0.#####E0");
    	
    	if (num >= 1e6 || num < 1e-2)
    		return scientificNotation.format(num);
    	return normalNotation.format(num);
    }

}
