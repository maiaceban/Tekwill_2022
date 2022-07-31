public class Square implements TwoDimensionalShape {
    private double lenght;

    public Square(double lenght) {
        this.lenght = lenght;
    }

    public double getLenght() {
        return lenght;
    }

    @Override
    public double getArea() {
        return Math.pow(lenght, 2);
    }

    @Override
    public double getPerimeter() {
        return 4 * lenght;
    }
}