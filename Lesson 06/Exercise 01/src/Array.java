import java.util.Arrays;

/**
 * Initializing an array of characters
 */
/*
Create an array of chars named characters with four elements 'a', 'z', 'e', 'd' and output it.
 */
public class Array {
    public static void main(String[] args) {
//        char[] characters = {'a', 'z', 'e', 'd'};
//
//        System.out.println(Arrays.toString(characters));
        /**
         * or you can use a for loop to iterate through the array and print
         * each element individually like this:
         */
        char[] characters = {'a', 'z', 'e', 'd'};
        for (int i = 0; i < characters.length; i++) {
            System.out.print(characters[i] + " ");
        }
    }

}