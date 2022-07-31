package md.tekwill.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Canvas {
    //are o dependenta privata, finala de tipul Shape, ca pe
    //viitor sa mai poata lucra si cu alte figuri
    private final Shape shape;
    //injectam
    public Canvas(@Qualifier("circle") Shape shape){  // Shape sa fie de tipul circle
        this.shape = shape;
    }
    // metoda draw, care sa ne afiseze shape-ul in consola
    public void draw(){
        System.out.println(shape.get());
    }
//    public void setShape(Shape shape){
//        this.shape = shape;
//    }
}