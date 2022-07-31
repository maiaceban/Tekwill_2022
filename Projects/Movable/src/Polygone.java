public abstract class Polygone implements Movable, Scalable {
    protected Point[] vertices;

    @Override
    public void moveUp(int distance) {
        for (Point vertex : vertices) {
            vertex.moveUp(distance);
        }
    }

    @Override
    public void moveDown(int distance) {
        for (Point vertex : vertices) {
            vertex.moveDown(distance);
        }
    }

    @Override
    public void moveLeft(int distance) {
        for (Point vertex : vertices) {
            vertex.moveLeft(distance);
        }
    }

    @Override
    public void moveRight(int distance) {
        for (Point vertex : vertices) {
            vertex.moveRight(distance);
        }
    }
}