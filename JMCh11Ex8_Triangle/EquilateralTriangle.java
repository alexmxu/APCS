/**
    Calculates the area and the perimeter of an equilateral triangle as
    specified by the abstract Triangle superclass.
    
     @author  Alex
    @version 10/12/15
    
    @author  Period: 4
    @author  Assignment - Java Methods Chapter 11, Exercise #8 - Triangle
    
    @author  Sources - Alex Xu
 */
public class EquilateralTriangle extends AbstractTriangle
{
    /**
     * constructor with no parameters
     */
    public EquilateralTriangle()
    {
        // no paramaters
    }


    /**
     * constructor with side parameter
     * 
     * @param side
     *            side of equilateral triangle
     */
    public EquilateralTriangle( double side )
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
        return ( Math.sqrt( 3 ) * side * side ) / 4;
    }


    /**
     * returns perimeter of triangle
     * 
     * @return perimeter
     */
    public double getPerimeter()
    {
        return 3 * side;
    }
}
