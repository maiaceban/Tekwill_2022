import java.time.LocalDate;
import java.util.Scanner;

/**
 * Print dates of a year with an offset (LocalDate)
 */
/*
Write a program that prints all dates of the given year with a specified offset applied.
It should read a starting date and a value of an offset (in days).
In the output, dates should be printed in ascending order with the starting date
included. Do not output the dates from the next year.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine().trim();
        int days = scanner.nextInt();
        LocalDate date = LocalDate.parse(string);

        int year = date.getYear();

        while (date.getYear() == year) {
            System.out.println(date);
            date = date.plusDays(days);
        }
    }
}