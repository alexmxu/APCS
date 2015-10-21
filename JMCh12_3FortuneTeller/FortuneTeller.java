import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.AudioClip;

/**
   this class models a fortune teller that tells the user's fortune at random

   @author  Alex Xu
   @version 10/19/15

   @author  Period - 4
   @author  Assignment - Lab 12.3: Fortune Teller

   @author  Sources - Alex Xu
 */
public class FortuneTeller extends JApplet implements ActionListener
{
    // Declare an array of "fortunes" (strings):

    String[] fortunes = {"A smile is your personal welcome mat.",
        "A smooth long journey! Great expectations.",
        "A soft voice may be awfully persuasive.",
        "A truly rich life contains love and art in abundance.",
        "Accept something that you cannot change, and you will feel better.",
        "Adventure can be real happiness.",
       "Advice is like kissing. It costs nothing and is a pleasant thing to do.",
        "Advice, when most needed, is least heeded.",
        "All the effort you are making will ultimately pay off.",
        "All the troubles you have will pass away very quickly"};
    

    private JTextField display;
    private AudioClip ding;

    public void init()
    {
        ding = getAudioClip(getDocumentBase(), "ding.wav");

        display = new JTextField("  Press \"Next\" to see your fortune...", 30);
        display.setBackground(Color.WHITE);
        display.setEditable(false);

        JButton go = new JButton("Next");
        go.addActionListener(this);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(display);
        c.add(go);
    }

    public void actionPerformed(ActionEvent e)
    {
        ding.play();

        // Pick a random fortune:
        int rand = (int)(Math.random()*10);
        display.setText("  " + fortunes[rand] );
    }
}

