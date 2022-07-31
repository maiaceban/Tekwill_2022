package md.tekwill.config;

import md.tekwill.beans.Canvas;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // prin metoda Spring

        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Canvas canvas = context.getBean(Canvas.class);

        //apelam metoda draw
        canvas.draw();
    }
}
