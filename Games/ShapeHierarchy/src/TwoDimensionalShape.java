public abstract class TwoDimensionalShape implements Shape {
    //Two private instance variables Dimension1 and Dimension2
    private double Dimension1, Dimension2;

    public TwoDimensionalShape(double x, double y, double dime1, double dime2) {

        super(x, y);
        Dimension1 = dime1;
        Dimension2 = dime2;
    }


    public void setDimension1(double dime1) {

        this.Dimension1 = dime1;
    }


    public double getDimension1() {
        return Dimension1;
    }


    public void setDimension2(double dime2) {

        this.Dimension2 = dime2;
    }


    public double getDimension2() {
        return Dimension2;
    }


    public abstract double getArea();
    public abstract double getPerimeter();
}