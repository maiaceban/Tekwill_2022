/**
 * String to double conversion (Exception handling)
 */
/*
Consider a method that takes a string and converts it to a double. If the input string
happens to be null or of an unsuitable format, a runtime exception occurs and the
program fails.
Fix the method, so it would catch any exceptions and return the default value 0 (zero) if an exception occurred.
Sample Input 1: 123.0       Sample Output 1: 123.0
Sample Input 2: 15.5        Sample Output 2: 15.5
 */
public class Converter {
    /**
     * It returns a double value or 0 if an exception occurred
     */
    public static double convertStringToDouble(String input) {
        if (input == null) {
            return 0;
        }
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}