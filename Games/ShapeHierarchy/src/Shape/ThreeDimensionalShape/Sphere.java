public class Sphere extends ThreeDimensionalShape{

    public Sphere(double x, double y, double dime1, double dime2, double dime3) {
        super(x, y, dime1, dime2, dime3);
    }

    public Sphere(int x, int y, int dime1) {
        super();
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getVolume() {
        return 0;
    }
}