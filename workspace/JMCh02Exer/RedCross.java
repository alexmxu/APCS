// Question 2-13-a

import java.awt.*;
import javax.swing.*;

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
public class RedCross extends JPanel
{
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);  // Call JPanel's paintComponent method
                              //   to paint the background
    int xCenter = getWidth() / 2;
    int yCenter = getHeight() / 2;
    g.setColor(Color.RED);
    // horizontal
    g.fillRect(xCenter- 35, yCenter, 80, 10 );
    // vertical
    g.fillRect(xCenter, yCenter- 35, 10, 80);
  }

  public static void main(String[] args)
  {
    JFrame window = new JFrame("Red Cross");
    window.setBounds(300, 300, 200, 200);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    RedCross panel = new RedCross();
    panel.setBackground(Color.WHITE);
    Container c = window.getContentPane();
    c.add(panel);
    window.setVisible(true);
  }
}

