package org.springframework.beans;


public class Square implements Shape {

    public Square() {
        Canvas canvas = new Canvas();
    }

    @Override
    public String get() {
        return "⬜";
    }
}


