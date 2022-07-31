public class Cube implements ThreeDimensionalShape {
    private double lenght;

    public Cube(double lenght) {
        this.lenght = lenght;
    }

    public double getLenght() {
        return lenght;
    }

    @Override
    public double getArea() {
        return 6 * lenght * lenght;
    }

    @Override
    public double getVolume() {
        return Math.pow(lenght, 3);
    }
}