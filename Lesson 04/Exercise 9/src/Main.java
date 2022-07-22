import java.util.Scanner;

/**
 * Exactly one parameter is positive
 */
public class Main {
    /*
        Write a program that reads three integer numbers and prints true if exactly one
        number is positive (i.e. > 0). Otherwise, it should print false.
            Sample Input 1: 1 1 1
            Sample Output 1: false
            Sample Input 2: 1 0 -1
            Sample Output 2: true
         */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int k = scanner.nextInt();

        boolean onlyFirstIsPositive = i > 0 && j <= 0 && k <= 0; //true
        boolean onlySecondIsPositive = i <= 0 && j > 0 && k <= 0; //false
        boolean onlyThirdIsPositive = i <= 0 && j <= 0 && k > 0;

        boolean exactlyOneIsPositive = onlyFirstIsPositive || onlySecondIsPositive || onlyThirdIsPositive;
        System.out.println(exactlyOneIsPositive);

        // System.out.println((i>0 && j<=0 && k<=0) || (j>0 && i<=0 && k<=0) || (k>0 && j<=0 && i<=0)
    }
}