public class Triangle extends Polygone {
    public Triangle(Point p1, Point p2, Point p3) {
        vertices = new Point[]{p1, p2, p3};
    }

    @Override
    public void scale(int scale) {
        throw new UnsupportedOperationException("Not yet implemented!");
    }
}