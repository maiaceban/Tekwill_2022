import java.util.Scanner;

public class ReplaceA {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String output = input.replace("a", "b");
        System.out.println("Modified string: " + output);
    }
}

