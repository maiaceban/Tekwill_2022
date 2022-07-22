import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Throw a checked exception (Throwing exceptions)
 */
/*
Modify the given method. It should throw a checked exception.
 */
public class Main {
    public static void method() throws FileNotFoundException {// write your code here}
        Scanner scanner = new Scanner(new File("file.txt"));
        scanner.nextLine();
    }


    /* Do not change code below */
    public static void main(String[] args) {
        try {
            method();
        } catch (RuntimeException e) {
            System.out.println("RuntimeException");
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}