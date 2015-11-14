import java.awt.Color;


/**
 * Represents a tile of the specified color (colored block).
 *
 * @author George Peck
 * @version Nov 25, 2007
 *
 * @author Sources: Cay Horstmann
 */
public class Tile
{
    private Color color;


    /**
     * constructor for Tile
     * 
     * @param color
     */
    public Tile( Color color )
    {
        this.color = color;
    }


    /**
     * returns current color
     * 
     * @param color
     */
    public Color getColor()
    {
        return color;
    }


    /**
     * sets a new color
     * 
     * @param color
     */
    public void setColor( Color color )
    {
        this.color = color;
    }

    /**
     * returns text string
     * 
     * @return string
     */
    public String getText()
    {
        return "";
    }
}
