import java.util.function.IntBinaryOperator;

/**
 * Max of two integers
 */
/*
 * Write a lambda expression that accepts two integers arguments and returns max of them.
 * Try not to use the Math library.
 * (x, y) -> x + y; (x) -> { return x; };
 */
public class Operator {
    public static IntBinaryOperator binaryOperator = (x, y) -> x > y ? x : y;// Write your code here
}