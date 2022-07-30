public class Square extends TwoDimensionalShape{
    private double side;


    public Square( double x, double y, double side )
    {
        super( x, y, side, side );

        if(side <= 0.0){

            throw new IllegalArgumentException("Side >= 0.0"); }
        else{

            this.side = side;
        }
    }

    public void setSide(double side){
        if(side <= 0.0){

            throw new IllegalArgumentException("Side >= 0.0"); }
        else{

            this.side = side;
        }
    }

    public double getSide(){
        return side;
    }

    public double getArea(){
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}
