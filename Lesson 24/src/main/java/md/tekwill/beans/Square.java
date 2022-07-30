package md.tekwill.beans;

public class Square implements Shape{

    @Override
    public String get() {
        return "⬜";
    }
}
//care implementeaza interfata Shape
//trebuie sa facem overite la metodele abstracte, in cazul nostru este doar una
// returnam squarul nostru