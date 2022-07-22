import java.util.Scanner;
/**
 * Converting and multiplying (Exception handling)
 */
/*
Your task is to write a program that reads a sequence of strings and converts them
to integer numbers, multiplying by 10. Some input strings may have an invalid format,
for instance: "abc". The sequence’s length may be different. Its ending is indicated by
“0”. Zero serves as a stop character and should not be included in the sequence.
If a string can be converted to an integer number, output the number multiplied by
10. Otherwise, output the string "Invalid user input: X" where X is the input string. To
better understand see examples below.
To implement this logic, use the exception handling mechanism.
Input data format: A sequence of integer numbers and other strings, each in a new
line
Output data format: A sequence of integer numbers and warnings, each in a new line
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();

        while (!input.equals("0")) {
            try {
                int number = Integer.parseInt(input);
                System.out.println(number * 10);
            } catch (NumberFormatException exception) {
                System.out.println("Invalid use input: " + input);
            }
            input = scanner.nextLine().trim();
        }
    }
}