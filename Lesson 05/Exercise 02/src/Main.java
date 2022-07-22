import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        In a computer game, each gamer has an army of units. Write a program that will
        classify the army corresponding to the following rules:
        less than 1: no army
        from 1 to 19: pack
        from 20 to 249: throng
        from 250 to 999: zounds
        1000 and more: legion
        The program should read the number of units and output the corresponding category.
            Sample Input 1: 5
            Sample Output 1: pack
            Sample Input 2: 303
            Sample Output 2: zounds
         */
        Scanner sc = new Scanner(System.in);
        int army = sc.nextInt();

        if (army < 1) {
            System.out.println("No army!");
        } else if (army <= 19) {
            System.out.println("Pack");
        } else if (army <= 249) {
            System.out.println("Throng");
        } else if (army <= 999) {
            System.out.println("Zounds");
        } else {
            System.out.println("Legion");
        }
    }
}