public class Main {
    public static void main(String[] args) {
        Shape circle1 = new Circle(10.3);
        Shape circle2 = new Circle(23.3);

        Shape square1 = new Square(3.3);
        Shape square2 = new Square(8.0);

        Shape triangle1 = new Triangle(20, 14, 7);
        Shape triangle2 = new Triangle(8.32, 9.4, 7.6);

        Shape cube1 = new Cube(7.7);
        Shape cube2 = new Cube(10.2);

        Shape sphere1 = new Sphere(20.4);
        Shape sphere2 = new Sphere(19.3);

        Shape tetrahedron1 = new Tetrahedron(7.0);
        Shape tetrahedron2 = new Tetrahedron(12.2);

        Shape[] arr = {circle1, circle2, square1, square2, triangle1, triangle2,
                cube1, cube2, sphere1, sphere2, tetrahedron1, tetrahedron2};

        for (Shape shape : arr) {
            System.out.println(shape.getClass() + "Area is: " + shape.getArea());

        }
    }
}