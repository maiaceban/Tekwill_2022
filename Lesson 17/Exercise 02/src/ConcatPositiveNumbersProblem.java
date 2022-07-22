import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Concat positive numbers (ArrayList)
 */
    /*
    Implement a method to concatenate all positive numbers of two input ArrayLists to a
    single resulting list.
    At first, elements from the first ArrayList should go, and then the elements from the
    second ArrayList.
    Sample Input 1:     Sample Output 1:
    8 11 -2 -3 14 15    8 11 14 15 33 12
    -1 33 12 -3 -5
     */
public class ConcatPositiveNumbersProblem {
    public static List<Integer> concatPositiveNumbers(List<Integer> l1, List<Integer> l2) {
        List<Integer> positiveNumbers = new ArrayList<>();
        for (Integer number : l1) {
            if (number > 0) {
                positiveNumbers.add(number);
            }
        }
        for (Integer number : l2) {
            if (number > 0) {
                positiveNumbers.add(number);
            }
        }
        return positiveNumbers;
    }

    /* Do not modify this method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list1 = readArrayList(scanner);
        ArrayList<Integer> list2 = readArrayList(scanner);
        ArrayList<Integer> result = (ArrayList<Integer>) concatPositiveNumbers(list1, list2);

        result.forEach(n -> System.out.print(n + " "));
    }

    /* Do not modify this method */
    private static ArrayList<Integer> readArrayList(Scanner scanner) {
        return Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayList::new));

    }
}
