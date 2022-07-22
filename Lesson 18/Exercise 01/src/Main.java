import java.time.LocalDate;
import java.util.Scanner;

/**
 * Convert numbers to days (LocalDate)
 */
/*
Write a program that reads a year and three days of this year (by their numbers) from
the standard input and output all dates corresponding to these numbers in the same order.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt(); // 2017
        int FirstDay = scanner.nextInt(); // 11
        int SecondDay = scanner.nextInt(); // 25
        int ThirdDay = scanner.nextInt();

        System.out.println(LocalDate.ofYearDay(year, FirstDay));
        System.out.println(LocalDate.ofYearDay(year, SecondDay));
        System.out.println(LocalDate.ofYearDay(year, ThirdDay));
    }
}