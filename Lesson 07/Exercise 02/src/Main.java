import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Write a program that reads the name of a city and checks if the name ends with
        "burg". Keep in mind, a city can have a short name. The program should output true or false.
        Sample Input 1: Augsburg                Sample Output 1: true
        Sample Input 2: Saint Petersburg        Sample Output 2: true
        Sample Input 3: Chisinau                Sample Output 3: false
         */
        Scanner sc = new Scanner(System.in);
        String nameOfTheCity = sc.nextLine();

        System.out.println(nameOfTheCity.endsWith("burg"));
    }
}