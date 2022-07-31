import java.util.Scanner;

class Driver {
    public static void main(String[] args) {
        Object obj;
        int first;
        int second;
        double r;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter\n1)Two dimensional shape\n2) Three dimensional shape: ");
        first = scanner.nextInt();
        if (first == 1) {
            System.out.print("Enter\n1)Circle\n2)Square\n3)Triangle: ");
            second = scanner.nextInt();
        } else {
            System.out.print("Enter\n1)Sphere\n2)Cube\n3)Tetrahedron: ");
            second = scanner.nextInt();
        }
        int choice = first * 10 + second;
        switch (choice) {
            case 11:
                System.out.print("Enter radius of Circle: ");
                r = scanner.nextDouble();
                obj = new Circle(r);
                System.out.print(obj.toString());
                break;
            case 12:
                System.out.print("Enter side of Square: ");
                r = scanner.nextDouble();
                obj = new Square(r);
                System.out.print(obj.toString());
                break;
            case 13:
                System.out.print("Enter side of Triangle: ");
                double side1 = scanner.nextDouble();
                System.out.print("Enter side of Triangle: ");
                double side2 = scanner.nextDouble();
                System.out.print("Enter side of Triangle: ");
                double side3 = scanner.nextDouble();
                obj = new Triangle(side1, side2, side3);
                System.out.print(obj.toString());
                break;
            case 21:
                System.out.print("Enter radius of Sphere: ");
                r = scanner.nextDouble();
                obj = new Sphere(r);
                System.out.print(obj.toString());
                break;

            case 22:
                System.out.print("Enter side of Cube: ");
                r = scanner.nextDouble();
                obj = new Cube(r);
                System.out.print(obj.toString());
                break;

            case 23:
                System.out.print("Enter side of Tetrahedron: ");
                r = scanner.nextDouble();
                obj = new Tetrahedron(r);
                System.out.print(obj.toString());
                break;
            default:
                System.out.print("NOPE! Don't do it! ");
                break;
        }
    }
}

abstract class Shape extends Object {
}

abstract class TwoDimensionalShape extends Shape {
    public double perimeter() {
        return 0.0;
    }

    public double are() {
        return 0.0;
    }

    public String toString() {
        return String.format("Area: %.2f%nPerimeter: %.2f%n", are(), perimeter());
    }
}

class Circle extends TwoDimensionalShape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double area() {
        return Math.PI * this.r * this.r;
    }

    public double perimeter() {
        return Math.PI * 2 * this.r;
    }
}

class Square extends TwoDimensionalShape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double area() {
        return this.side * this.side;
    }

    public double permeter() {
        return this.side * 4;
    }
}

class Triangle extends TwoDimensionalShape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double perimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    public double area() {
        double half = (this.side1 + this.side2 + this.side3) / 2;
        double calc = Math.sqrt(half * (half - this.side1) * (half - this.side2) * (half - this.side3));
        return calc;
    }
}

class ThreeDimensionaShape extends Shape {
    protected double r;

    public double getVolume() {
        return 0.0;
    }

    public double getSurfaceArea() {
        return 0.0;
    }

    public String toString() {
        return String.format("Surface are:%.2f%nVolume:%.2f%n", getSurfaceArea(), getVolume());
    }
}

class Sphere extends ThreeDimensionaShape {
    private double r;

    public Sphere(double r) {
        this.r = r;
    }

    public double getVolume() {
        return (Math.PI * this.r * this.r * this.r * 4) / 3.0;
    }

    public double getSurfaceArea() {
        return 4 * Math.PI * this.r * this.r;
    }
}

class Cube extends ThreeDimensionaShape {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    public double getVolume() {
        return this.side * this.side * this.side;
    }

    public double getSurfaceArea() {
        return this.side * this.side * 6;
    }
}

class Tetrahedron extends ThreeDimensionaShape {
    private double side;

    public Tetrahedron(double side) {
        this.side = side;
    }

    public double getVolume() {
        return this.side * this.side * this.side / (Math.sqrt(2) * 6);
    }

    public double getSurfaceArea() {
        return this.side * this.side * Math.sqrt(3);
    }
}