/**
    Calculates the area and the perimeter of a right triangle as
    specified by the abstract Triangle superclass.

    @author  Alex Xu
    @version 10/12/15
    
    @author  Period: 4
    @author  Assignment - Java Methods Chapter 11, Exercise #8 - Triangle
    
    @author  Sources - Alex Xu
 */
public class RightTriangle extends AbstractTriangle
{
    /**
     * constructor with no parameters
     */
    public RightTriangle()
    {
        // no parameters
    }


    /**
     * constructor with side parameter
     * 
     * @param side
     *            side of right triangle
     */
    public RightTriangle( double side )
    {
        super( side );
    }


    /**
     * returns area of triangle
     * 
     * @return area
     */
    public double getArea()
    {
        return ( side * side ) / 2;
    }


    /**
     * returns perimeter of triangle
     * 
     * @return perimeter
     */
    public double getPerimeter()
    {
        return (side + side + (side * Math.sqrt( 2 )));
    }
}

