package org.springframework.beans;

public class Main {
    public static void main(String[] args) {
        Shape square = new Square();
        Canvas canvas = new Canvas();

        canvas.draw();
    }
}