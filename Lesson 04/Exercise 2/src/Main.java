import java.util.Scanner;

public class Main {
    /**
     * How many nuts each squirrel will get
     */
    public static void main(String[] args) {
        /*
        N squirrels found K nuts and decided to divide them equally. Determine how many
        nuts each squirrel will get. So there are two positive numbers N and K, each of them is
        not greater than 10000.
            Sample Input 1:
            3
            14
            Sample Output 1: 4
         */
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();   // Represent Squirrels
        int n = sc.nextInt();   // Represent Nuts
        System.out.println(n / s);
    }
}