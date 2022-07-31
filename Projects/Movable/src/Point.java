public class Point {
    private int x;
    private int y;

    public Point() {
        this(0, 0);
    }

    public Point(int n) {
        this(n, n);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void display() {
        System.out.println(this);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void moveRight(int distance) {
        x += distance;
    }

    public void moveUp(int distance) {
        y += distance;
    }

    public void moveLeft(int distance) {
        x -= distance;
    }

    public void moveDown(int distance) {
        y -= distance;
    }

    @Override
    public String toString() {
        return "<" + x + ":" + y + ">";
    }
}