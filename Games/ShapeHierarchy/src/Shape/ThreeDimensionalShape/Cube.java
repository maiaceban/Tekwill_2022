public class Cube extends ThreeDimensionalShape{
    public Cube( int x, int y, int side )
    {
        super( x, y, side, side, side );
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getVolume() {
        return 0;
    }

    @Override
    public Object getPerimetre() {
        return null;
    }

    @Override
    public Object2 getAre() {
        return null;
    }

}