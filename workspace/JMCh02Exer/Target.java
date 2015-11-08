/**
 *  This program makes displays a few gray circles that make the shape of a target.
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


public class Target extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int xCenter = getWidth() / 2;
        int yCenter = getHeight() / 2;
        int r = 50; // initialize radius value

        g.setColor(Color.GRAY);
        g.fillOval(xCenter - (r / 2), yCenter - (r / 2), 50, 50);

        g.setColor(Color.WHITE);
        r = 30;
        g.fillOval(xCenter - (r / 2), yCenter - (r / 2), r, r);

        // create the third and smallest circle
        r = 10;
        g.setColor(Color.GRAY);
        g.fillOval(xCenter - (r / 2), yCenter - (r / 2), r, r);
    }

    public static void main(String[] args) {
        JFrame window = new JFrame("Target");
        window.setBounds(300, 300, 200, 200);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Target panel = new Target();
        panel.setBackground(Color.WHITE);
        Container c = window.getContentPane();
        c.add(panel);
        window.setVisible(true);
    }
}