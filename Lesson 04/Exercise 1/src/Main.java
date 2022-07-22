import java.util.Scanner;

public class Main {
    /**
     * Reading integer numbers
     */
    public static void main(String[] args) {
        /*
        Write a program that reads four integer numbers from one line and prints them each
        in a new line. In the input line numbers are separated by one or more spaces.
              Sample Input 1: 101 102 103 104
              Sample Output 1:
               101
               102
               103
               104
         */
        Scanner scanner = new Scanner(System.in);  // 101 102 103 104

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
//         System.out.println("Output numbers:" + '\n' + a + '\n' + b + '\n' + c +'\n' + d );
    }
}