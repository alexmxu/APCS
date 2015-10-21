// This applet shows a string of text inside a box.
/**
 *  A program that displays a blue box with the words "Hello World" inside
 *
 *  @author  TODO: Alex Xu
 *  @version TODO: 8/21/2015    
 *  @author  Period: 4
 *  @author  Assignment: JMCh02Exer
 *
 *  @author  Sources: Alex Xu 
 */
import java.awt.*;
import javax.swing.*;

public class HelloApplet extends JApplet
{
  public void init()
  {
    Container c = getContentPane();
    c.setBackground(Color.WHITE);
  }

  public void paint(Graphics g)
  {
    super.paint(g);    // call JApplet's paint method
                       //  to paint the background
    g.setColor(Color.BLUE);
    g.fillRect(25, 40, 150, 45);  // draw a rectangle 150 by 45
    g.setColor(Color.WHITE);
    g.drawString("Hello, Applet!", 60, 65);
  }
}
