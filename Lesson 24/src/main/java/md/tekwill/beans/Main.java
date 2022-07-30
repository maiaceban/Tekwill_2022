package md.tekwill.beans;

public class Main {
    public static void main(String[] args) {
        // ii transmitem lui constructor un parametru
        Shape square = new Square();
        Canvas canvas = new Canvas(square);

//        Canvas canvas = new Canvas();
//        canvas.setShape(square);

        canvas.draw();
    }
}