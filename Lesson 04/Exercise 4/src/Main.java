import java.util.Scanner;

public class Main {
    /**
     * Snail
     */
    public static void main(String[] args) {
        /*
        Snail creeps up the vertical pole of height H feets. Per day it goes A feets up, and per
        night it goes B feets down. On which day the snail will reach the top of the pole? On the
        input the program receives non-negative integers H, A, B, where H > B and A > B. Every
        integer does not exceed 100.
            Sample Input 1:
            10
            3
            2
            Sample Output 1: 8
            Sample Input 2:
            20
            7
            3
            Sample Output 2: 5
         */
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int up = sc.nextInt();
        int down = sc.nextInt();


        // o alta varianta:
        // double heightToClimb = height - down;
        // double climbPerDay = up - down;
        // int result = (int) MAth.ceil(heightToClimb/climbPerDay);

        int heightToClimb = height - down;
        int climbPerDay = up - down;

        // q = (x+y-1)/y;
        int result = (heightToClimb + climbPerDay - 1) / climbPerDay;

        System.out.println(result);
    }
}