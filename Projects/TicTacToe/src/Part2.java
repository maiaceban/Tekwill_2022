import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) {
        System.out.print("Enter cells: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();//OXO__X_OX

        char[][] chars = toMulti(input);
        print(chars);
    }

    private static void print(char[][] chars) {
        System.out.println("---------");
        for (char[] aChar : chars) {
            System.out.print("| ");
            for (char c : aChar) {
                System.out.print(c + " ");
            }
            System.out.println("|");
        }
        System.out.println("---------");
    }


    private static char[][] toMulti(String input) {
        return new char[][]{
                {input.charAt(0), input.charAt(1), input.charAt(2)},
                {input.charAt(3), input.charAt(4), input.charAt(5)},
                {input.charAt(6), input.charAt(7), input.charAt(8)}
        };
    }
}