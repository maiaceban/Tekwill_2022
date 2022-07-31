public class Circle implements TwoDimensionalShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI*Math.pow(radius, 2);
    }
}