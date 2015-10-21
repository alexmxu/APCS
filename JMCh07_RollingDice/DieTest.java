/**
 * tests the Die class
 *
 * @author Alex Xu
 * @version Sept 9, 2015
 * @author Period: 4
 * @author Assignment: JMCh07_RollingDice
 *
 * @author Sources: Alex Xu
 */
public class DieTest
{
    /**
     * test the Die class by rolling and printing number of dots
     * @param args command line argument
     */
    public static void main( String[] args )
    {

        Die die = new Die();
        die.roll();
        System.out.println( die.getNumDots() );
        die.roll();
        System.out.println( die.getNumDots() );
        die.roll();
        System.out.println( die.getNumDots() );
        die.roll();
        System.out.println( die.getNumDots() );
        die.roll();
        System.out.println( die.getNumDots() );
        die.roll();
    }
}