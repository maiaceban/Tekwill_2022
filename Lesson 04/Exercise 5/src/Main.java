import java.util.Scanner;

/**
 * Distance
 */
public class Main {
    /*
       Write a program that reads the distance between the two cities in km and the travel
       time by bus in hours, and outputs the average speed of the bus.
           Sample Input 1:
           100
           2
           Sample Output 1: 50.0
        */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float distance = sc.nextFloat();
        float time = sc.nextFloat();
        ;
        System.out.println("The average speed of the bus is: " + distance / time);
    }
}