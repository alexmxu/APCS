/**
 * TODO Write a one-sentence summary of your class here. TODO Follow it with
 * additional details about its purpose, what abstraction it represents, and how
 * to use it.
 *
 *
 * @author Alex Xu
 * @version Aug 26, 2015
 * @author Period: 4
 * @author Assignment: JMCh03Ex12_Cylinder
 *
 * @author Sources: Alex Xu
 */
public class Cylinder
{
    // TODO implement data fields
    private double radius, height;


    // TODO implement constructor
    /**
     * constructs a cylinder of radius r and height h
     * 
     * @param r
     * @param h
     */
    public Cylinder( double r, double h )
    {
        radius = r;
        height = h;
    }


    // TODO implement methods
    /**
     * calculates volume of cylinder from radius and height
     * 
     * @return volume of the cylinder
     */
    public double getVolume()
    {
        return Math.PI * radius * radius * height;
    }
}
