package md.tekwill;

public class User {
    private long id;
    private String name;
    private  boolean isVip;

    public User() {
    }

    public User(long id, String name, boolean isVip) {
        this.id = id;
        this.name = name;
        this.isVip = isVip;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVip() {
        return isVip;
    }

    public void setVip(boolean vip) {
        isVip = vip;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isVip=" + isVip +
                '}';
    }
}
