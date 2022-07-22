import java.util.Scanner;

/**
 * Days of the week (Throwing exceptions)
 */
/*
Your task is to implement the getDayOfWeekName method that converts the number
of the day of the week to its short name. If the given number is incorrect, the method
should throw an IllegalArgumentException.
● 1 → "Mon";
● 2 → "Tue";
● 3 → "Wed";
● 4 → "Thu";
● 5 → "Fri";
● 6 → "Sat";
● 7 → "Sun".
 */
public class Main {
    public static String getDayOfWeekName(int number) {
        // write your code here
        return switch (number) {
            case 1 -> "Mon";
            case 2 -> "Tue";
            case 3 -> "Wed";
            case 4 -> "Thu";
            case 5 -> "Fri";
            case 6 -> "Sat";
            case 7 -> "Sun";
            default -> throw new IllegalArgumentException("Invalid day of the week");
        };
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayNumber = scanner.nextInt();
        try {
            System.out.println(getDayOfWeekName(dayNumber));
        } catch (Exception e) {
            System.out.println(e.getClass().getName());
        }
    }
}