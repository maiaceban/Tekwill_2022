public class Main {
    public static void main(String[] args) {
        Addition addition = new Addition(26, 28);
        Multiplication multiplication = new Multiplication(26, 28);

        perform(addition);
        perform(multiplication);
    }

    public static void perform(IntBinaryOperation obj) {
        System.out.println(obj.perform());

    }
}