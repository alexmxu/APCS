import java.awt.*;
import javax.swing.*;


/**
 * This program displays a cool illusion of parallel lines.
 * 
 * @author Alex Xu
 * @version 9/18/15
 * 
 *          Period - 4 Assignment - A12.6 - ParallelLines
 * 
 *          Sources - Alex Xu
 */
public class ParallelLines extends JPanel
{
    /**
     * make background and get width and length and draw it
     * 
     * @param g
     *            graphics object
     */
    public void paintComponent( Graphics g )
    {
        super.paintComponent( g ); // Call JPanel's paintComponent method
                                   // to paint the background

        int width = getWidth();
        int height = getHeight();

        drawIllusion( g, width, height );
    }


    /**
     * draws the illusion of parallel lines
     * 
     * @param g
     *            graphics object
     * @param width
     *            width
     * @param height
     *            height
     */
    public void drawIllusion( Graphics g, int width, int height )
    {
        int width1 = width;
        int height1 = height;
        int offset = 0;

        // calculate the start of the row of squares
        for ( int row = 1; row < 9; row++ )
        {

            // calculate and add a horizontal offset
            if ( row == 1 || row == 5 )
            {
                offset = 0;
            }
            else if ( row == 2 || row == 4 || row == 6 || row == 8 )
            {
                offset = 15;
            }
            else if ( row == 3 || row == 7 )
            {
                offset = 30;
            }
            for ( int column = 0; column < 14; column++ )
            {
                if ( column % 2 == 0 )
                {
                    g.fillRect( column * ( height1 / 9 ) + offset,
                        row * ( width1 / 14 ),
                        ( height1 / 9 ),
                        ( width1 / 14 ) );
                }
            }
            g.drawLine( 0,
                row * ( width1 / 14 ),
                width,
                row * ( width1 / 14 ) );
        }
        g.drawLine( 0, 9 * ( width1 / 14 ), width, 9 * width1 );
    }


    /**
     * main method for implementing draw illusion
     * 
     * @param args
     *            command line argument
     */
    public static void main( String[] args )
    {
        JFrame w = new JFrame( "ParallelLines" );
        w.setBounds( 100, 100, 640, 480 );
        w.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        ParallelLines panel = new ParallelLines();
        panel.setBackground( Color.WHITE );
        Container c = w.getContentPane();
        c.add( panel );
        w.setResizable( true );
        w.setVisible( true );
    }
}
