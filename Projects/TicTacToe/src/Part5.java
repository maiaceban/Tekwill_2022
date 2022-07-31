import java.util.Arrays;
import java.util.Scanner;

public class Part5 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        char[][] game = init();
        print(game);

        char player = 'X';
        boolean finish = false;
        while (!finish) {
            getUserInput(game, player);
            print(game);
            finish = gameFinished(game);
            player = player == 'X' ? 'O' : 'X';
        }

    }

    public static boolean hasWon(char[][] multi, char ch) {
        return checkColumns(multi, ch) || checkRows(multi, ch) || checkDiagonals(multi, ch);
    }

    public static boolean checkRows(char[][] multi, char ch) {
        for (char[] chars : multi) {
            if (chars[0] == ch && chars[1] == ch && chars[2] == ch) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkColumns(char[][] multi, char ch) {
        for (int i = 0; i < 3; i++) {
            if (multi[0][i] == ch && multi[1][i] == ch && multi[2][i] == ch) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkDiagonals(char[][] multi, char ch) {
        return multi[0][0] == ch && multi[1][1] == ch && multi[2][2] == ch ||
                multi[0][2] == ch && multi[1][1] == ch && multi[2][0] == ch;
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

    private static void getUserInput(char[][] game, char ch) {
        while (true) {
            System.out.print(ch + " enter your coordinates: ");
            String input = SCANNER.nextLine();//2 2
            String[] in = input.split(" ");//["2", "2"]

            if (in.length != 2) {
                System.out.println("You should input two numbers!");
                continue;
            }

            if (!isNumeric(in[0]) || !isNumeric(in[1])) {
                System.out.println("You should input numbers!");
                continue;
            }

            int i1 = Integer.parseInt(in[0]) - 1;//1
            int i2 = Integer.parseInt(in[1]) - 1;//1

            if (i1 < 0 || i1 > 2 || i2 < 0 || i2 > 2) {
                System.out.println("Coordinates should be from 1 to 3!");
                continue;
            }

            if (game[i1][i2] != '_') {
                System.out.println("This cell is occupied! Choose another one!");
                continue;
            }

            game[i1][i2] = ch;
            break;
        }
    }

    private static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    private static char[][] init() {
        char[][] gameBoard = new char[3][3];
        for (char[] gameLine : gameBoard) {
            Arrays.fill(gameLine, '_');
        }
        return gameBoard;
    }

    private static boolean areFreeSpaces(char[][] game) {
        for (char[] chars : game) {
            for (char aChar : chars) {
                if (aChar == '_') {
                    return true;
                }
            }
        }
        return false;
    }


    private static boolean gameFinished(char[][] game) {
        boolean xHasWon = hasWon(game, 'X');
        boolean oHasWon = hasWon(game, 'O');

        if (xHasWon) {
            System.out.println("X wins");
            return true;
        } else if (oHasWon) {
            System.out.println("O wins");
            return true;
        } else if (!areFreeSpaces(game)) {
            System.out.println("Draw");
            return true;
        }
        return false;
    }
}