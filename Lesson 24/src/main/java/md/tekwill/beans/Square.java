package md.tekwill.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class Square implements Shape{

    @Override
    public String get() {
        return "⬜";
    }
}
//care implementeaza interfata Shape
//trebuie sa facem overite la metodele abstracte, in cazul nostru este doar una
// returnam squarul nostru