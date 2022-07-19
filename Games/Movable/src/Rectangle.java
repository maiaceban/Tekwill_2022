public class Rectangle extends Polygone {
    public Rectangle(Point topRightCorner, int width, int height) {
        int x2 = topRightCorner.getX() - width;
        int y2 = topRightCorner.getY() - height;
        Point bottomRightCorner = new Point(topRightCorner.getX(), y2);
        Point bottomLeftCorner = new Point(x2, y2);
        Point topLeftCorner = new Point(x2, topRightCorner.getY());

        vertices = new Point[]{topLeftCorner, topRightCorner, bottomRightCorner, bottomLeftCorner};
    }

    @Override
    public void scale(int scale) {
        int height = vertices[0].getY() - vertices[3].getY();
        int height2 = height * scale;
        int h2 = (height2 - height) / 2;

        int width = vertices[0].getX() - vertices[1].getX();
        int width2 = width * scale;
        int w2 = (width2 - width) / 2;

        vertices[0].moveUp(h2);
        vertices[0].moveLeft(w2);

        vertices[1].moveUp(h2);
        vertices[1].moveRight(w2);

        vertices[2].moveDown(h2);
        vertices[2].moveRight(w2);

        vertices[3].moveDown(h2);
        vertices[3].moveLeft(w2);
    }
}