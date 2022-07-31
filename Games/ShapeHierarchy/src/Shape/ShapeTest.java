import Shape.Shape;
import Shape.TwoDimensionalShape.Circle;
import Shape.TwoDimensionalShape.Square;

public class ShapeTest {
    // create Shape.Shape objects and display their information
    public static void main( String args[] )
    {
        Shape shapes[] = new Shape[ 4 ];
        shapes[ 0 ] = new Circle( 22, 88, 4 );
        shapes[ 1 ] = new Square( 71, 96, 10 );
        shapes[ 2 ] = new Sphere( 8, 89, 2 );
        shapes[ 3 ] = new Cube( 79, 61, 8 );
// call method print on all shapes
        for ( Shape currentShape : shapes )
        {
            System.out.printf( "%s: %s",currentShape.getPerimetre(), currentShape );
            if ( currentShape instanceof TwoDimensionalShape )
            {
                TwoDimensionalShape twoDimensionalShape =
                        ( TwoDimensionalShape ) currentShape;
                System.out.printf( "%s's area is %s\n",
                        ((TwoDimensionalShape) currentShape).getArea(), twoDimensionalShape.getArea() );
            } // end if
            if ( currentShape instanceof ThreeDimensionalShape )
            {
                ThreeDimensionalShape threeDimensionalShape =
                        ( ThreeDimensionalShape) currentShape;
                System.out.printf( "%s's area is %s\n",
                        ((ThreeDimensionalShape) currentShape).getArea(), threeDimensionalShape.getArea() );
                System.out.printf( "%s's volume is %s\n",
                        ((ThreeDimensionalShape) currentShape).getArea(),
                        threeDimensionalShape.getVolume() );
            }
            System.out.println();
        }
    }
}