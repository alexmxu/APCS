import java.lang.reflect.Field;
import java.util.Scanner;

/**
 * Coins: This class accepts a certain amount of monetary change (in cents).
 * The output is a list of the number of quarters, dimes, nickels, and
 * pennies that will make that amount of change with the least number of
 * coins possible.
 *
 * @author Alex Xu
 * @version Sept 2, 2015
 * @author Period: 4
 * 
 * @author Assignment: Lab Activity 3.2 - Coins
 * 
 * @author Sources: Alex Xu
 */
public class Coins
{
    private int myChange;

    /**
     * constructor for Coins
     * @param change amount of change the user has
     */
    public Coins( int change )
    {
        myChange = change;
    }

    /**
     * calculates the number of coins of each type of coin from given cents
     */
    public void calculate()
    {
        int numberOfCoins;
        System.out.println( myChange + " cents =>");
        numberOfCoins = myChange / 25;
        System.out.println( "Quarter(s)\t" + numberOfCoins );
        myChange -= numberOfCoins * 25;
        numberOfCoins = myChange / 10;
        System.out.println( "Dimes(s)\t" + numberOfCoins );
        myChange -= numberOfCoins * 10;
        numberOfCoins = myChange / 5;
        System.out.println( "Nickel(s)\t" + numberOfCoins );
        myChange -= numberOfCoins * 5;
        numberOfCoins = myChange;
        System.out.println( "Pennie(s)\t" + numberOfCoins );
    }
    
    /**
     * Intended only for debugging.
     * 
     * <p>A generic toString implementation that uses reflection to print
     * names and values of all fields <em>declared in this class</em>.
     * Note that superclass fields are left out of this implementation.</p>
     * 
     * @return a string representation of this Easter.
     */
    public String toString()
    {
        String str = this.getClass().getName() + "[";
        String separator = "";

        Field[] fields = this.getClass().getDeclaredFields();

        for ( Field field : fields )
        {
            try
            {
                str += separator + field.getType().getName() + " "
                    + field.getName() + ":" + field.get( this );
            }
            catch ( IllegalAccessException ex )
            {
                System.out.println( ex );
            }
            separator = ", ";
        }
        return str + "]";
    }

    /**
     * Tester for the Coins class.
     * @param args command line arguments - not used
     */
    public static void main( String[] args )
    {
        Scanner console = new Scanner( System.in );

        System.out.print( "Please enter the number of cents --> " );
        int cents = console.nextInt();

        Coins change = new Coins( cents );
        change.calculate();
    }
}
