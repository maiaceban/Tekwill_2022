public class Announcement extends Publication {
    private int daysToExpire;

    public Announcement(String title, int daysToExpire) {
        super(title);
        this.daysToExpire = daysToExpire;

    }

    // write your code here
    @Override
    public String getType() {
        return "Announcement";
    }

    @Override
    public String getDetails() {
        return "(days to expire - " + daysToExpire + ")";
    }
}