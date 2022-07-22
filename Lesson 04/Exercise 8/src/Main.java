import java.util.Scanner;

/**
 * Check the given numbers are different
 */
public class Main {
    /*
       Write a program that reads three numbers and checks that they all are different, i.e.
       not equal to one another. The output should be true or false.
           Sample Input: 5 5 9
           Sample Output: false
        */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int j = scanner.nextInt();
        int u = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(j != u && j != c && c != u);
    }
}