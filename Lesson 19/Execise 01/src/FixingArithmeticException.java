import java.util.Scanner;
/**
 * Avoid division by zero (What is an exception)
 */
/*
Program reads numbers and performs some calculations. It outputs the result to the
standard output. In some cases, the program will throw an ArithmeticException. Fix
the program, so that it prints "Division by zero!" instead of this exception.
Sample Input 1: 5 2 0 1         Sample Output 1: 2
 */
public class FixingArithmeticException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        if (d == 0) {
            System.out.println("Division by zero!");
            return;
        }
        int intermediate = (b + c) / d;
        if (intermediate == 0) {
            System.out.println("Division by zero!");
            return;
        }
        int result = a / intermediate;

        System.out.println(result);
    }
}