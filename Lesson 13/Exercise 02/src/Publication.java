public class Publication {
    private String title;

    public Publication(String title) {
        this.title = title;
    }

    public final String getInfo() {
        // write your code here
        return getType() + getDetails() + ": " + title;
    }

    public String getType() {
        return "Publication";
    }

    public String getDetails() {
        return " ";
    }
}