import java.util.Scanner;

public class Main {
    /**
     * The sum of digits
     */
    public static void main(String[] args) {
        /*
        Given a three-digit integer (i.e. an integer from 100 to 999). Find the sum of its digits.
            Sample Input 1: 476
            Sample Output 1: 17
         */
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();  // i = 476

        int i1 = i / 100;  // 4
        int i2 = (i % 100) / 10;
        int i3 = i % 10;
        int result = i1 + i2 + i3;
        System.out.println(result);
    }
}
