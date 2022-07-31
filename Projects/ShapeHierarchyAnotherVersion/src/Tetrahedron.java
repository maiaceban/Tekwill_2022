public class Tetrahedron implements ThreeDimensionalShape {
    private double lenght;

    public Tetrahedron(double lenght) {
        this.lenght = lenght;
    }

    public double getLenght() {
        return lenght;
    }

    @Override
    public double getArea() {
        return Math.sqrt(3) * lenght * lenght;
    }

    @Override
    public double getVolume() {
        return Math.pow(lenght, 3) / (6 * Math.sqrt(2));
    }
}