import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Stage 2/5: Flexible mines
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many mines do you want on the field? ");
        int nrOfMines = scanner.nextInt();

        char[][] matrix = fillMatrixWithDots('.', 9);

        generateNMines(matrix, nrOfMines);

        printMatrix(matrix);
    }

    public static void printMatrix(char[][] matrix) {
        //display the game
        for (char[] chars : matrix) {
            for (char aChar : chars) {
                System.out.print(aChar);
            }
            System.out.println();
        }
    }

    public static char[][] fillMatrixWithDots(char theChar, int n) {
        //filling array with dots
        char[][] matrix = new char[n][n];
        for (char[] value : matrix) {
            Arrays.fill(value, theChar);
        }
        return matrix;
    }

    public static void generateNMines(char[][] matrix, int nrOfMines) {
        //generating mines
        Random random = new Random();
        int count = 0;
        while (count < nrOfMines) {
            int i = random.nextInt(9);
            int j = random.nextInt(9);
            if (matrix[i][j] != 'X') {
                matrix[i][j] = 'X';
                count++;
            }
        }
    }
}