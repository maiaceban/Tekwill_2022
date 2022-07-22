import java.util.function.DoubleUnaryOperator;

/**
 * Expression closure (Lambda expressions)
 */
/*
 * Using closure write a lambda expression that calculates a × x2 + b × x + c where
 * a, b, c are context final variables. Note, the result is double. Solution format. Submit your
 * lambda expression in any valid format with ; on the end.
 * Examples: (x, y) -> x + y; (x, y) -> { return x + y; }
 */
public class Operator {
    public static int a = 10;
    public static int b = 20;
    public static int c = 30;
    public static DoubleUnaryOperator unaryOperator = x -> a * x * x + b * x + c;
}