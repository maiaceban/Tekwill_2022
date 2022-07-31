package md.tekwill.beans;

import org.springframework.stereotype.Component;


@Component
public class Circle implements Shape {
    @Override
    public String get() {
        return "⚪";
    }
}
