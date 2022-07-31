public class Triangle extends TwoDimensionalShape{
    private double base;
    private double height;

    public Triangle(double x, double y, double dime1, double dime2) {
        super(x, y, dime1, dime2);
    }

    public Triangle(double x, double y, double dime1, double dime2, double base, double height) {
        super(x, y, dime1, dime2);
        this.base = base;
        this.height = height;
    }

    public void Traingle(double x, double y, double base, double height){

        super(x, y, base, height);

        if(height <= 0.0){

            throw new IllegalArgumentException("Radius >= 0.0"); }
        else{

            this.base = base;
            this.height = height;
        }
    }

    public void setBase(double base){
        if(base <= 0.0)
            throw new IllegalArgumentException("Base length > 0");
        this.base = base;
    }
    public double getBase(){
        return base;
    }

    public void setHieght(double hieght){
        if(hieght <= 0.0)
            throw new IllegalArgumentException("Hieght length > 0");
        this.height = hieght;
    }

    public double getHieght(){
        return height;
    }

    public double getArea(){
        return (getBase()*getHieght()/2);
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public String toString(){
        return String.format("%s = %.2f%n%19s = %.2f%n%17s = %.2f", "Base", getBase(), "Hieght", getHieght(),super.toString(), getArea());
    }
}