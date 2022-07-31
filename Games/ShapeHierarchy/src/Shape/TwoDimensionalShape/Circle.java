public class Circle extends TwoDimensionalShape{
    private double radius;

    public Circle(double x, double y, double radius){

        super(x, y, radius, radius);

        if(radius <= 0.0){

            throw new IllegalArgumentException("Radius >= 0.0"); }
        else{

            this.radius = radius;
        }
    }


    public double getRadius(){

        return radius;
    }

    public void setRadius(double newRadius){

        if(radius <= 0.0){

            throw new IllegalArgumentException("Radius >= 0.0"); }
        else{

            radius = radius;
        }
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}
