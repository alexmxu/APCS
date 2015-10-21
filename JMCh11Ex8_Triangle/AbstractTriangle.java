/**
 * The abstract class <code>Triangle</code> requires methods for calculating the
 * area and the perimeter as specified the type of triangle. A method to
 * calculate the ratio of the area to the perimeter is provided. The class works
 * for equilateral triangles and for right isosceles triangles; which can be
 * specified with the length of a side.
 * 
 * @author Alex Xu
 * @version 10/12/15
 * 
 * @author Period: 4
 * @author Assignment - Java Methods Chapter 11, Exercise #8 - Triangle
 * 
 * @author Sources - Alex Xu
 */
public abstract class AbstractTriangle
{
    /**
     * one side of triangle
     */
    public double side;


    /**
     * constructor for AbstractTriangle with parameter
     * 
     * @param side
     *            side of triangle
     */
    public AbstractTriangle( double side )
    {
        this.side = side;
    }


    /**
     * constructor with no parameter
     */
    public AbstractTriangle()
    {
        //no parameters
    }


    /**
     * returns perimeter of triangle
     * 
     * @return triangle
     */
    public abstract double getPerimeter();

    /**
     * returns area of triangle
     * 
     * @return area
     */
    public abstract double getArea();

    /**
     * returns ratio of area to perimeter
     * 
     * @return ratio
     */
    public double getRatio()
    {
        return getArea() / getPerimeter();
    }


    /**
     * return side
     * 
     * @return sides
     */
    public double getSide()
    {
        return side;
    }
}
