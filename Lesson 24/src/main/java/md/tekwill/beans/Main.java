package md.tekwill.beans;

public class Main {
    public static void main(String[] args) {
        // ii transmitem constructorului un parametru
        Shape square = new Square();
        Shape circle = new Circle();
        Canvas canvas = new Canvas(circle);


//        Canvas canvas = new Canvas();
//        canvas.setShape(square);

        canvas.draw();
    }
}