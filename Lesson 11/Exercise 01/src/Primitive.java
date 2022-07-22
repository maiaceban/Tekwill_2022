import java.util.Scanner;

/**
 * Only true or false
 */
public class Primitive {
    public static boolean toPrimitive(Boolean b) {
        if (b == null) {
            return false;
        } else if (b != null) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean b = scanner.hasNextBoolean();
        System.out.println(toPrimitive(b));
    }
}