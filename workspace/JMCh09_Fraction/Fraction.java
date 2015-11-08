/**
 * Represents a fraction with an int numerator and int denominator
 * and provides methods for adding and multiplying fractions.
 *
 *  @author  George Peck
 *  @version Sep 29, 2009
 *  @author  Period: 1-7
 *  @author  Assignment: JMCh09_Fraction
 *
 *  @author  Sources: Gary & Maria Litvin
 */
public class Fraction
{
    // *** instance variables ***
    private int num;
    private int denom;


    // *** Constructors ***

    public Fraction() // no-args constructor
    {
        num = 0;
        denom = 1;
    }

    public Fraction( int n )
    {
        num = n;
        denom = 1;
    }

    public Fraction( int n, int d )
    {
        if ( d != 0 )
        {
            num = n;
            denom = d;
            reduce();
        }
        else
        {
            throw new IllegalArgumentException( "Fraction construction error: denominator is 0" );
        }
    }

    public Fraction( Fraction other ) // copy constructor
    {
        num = other.num;
        denom = other.denom;
    }

    // *** public methods ***

    /**
     * Add this fraction to another fraction
     * 
     * @param other fraction to add to this fraction
     * @return the sum of this fraction and other
     */
    public Fraction add( Fraction other )
    {
        int newNum = num * other.denom + denom * other.num;
        int newDenom = denom * other.denom;
        return new Fraction( newNum, newDenom );
    }

    /**
     * Add this fraction to an integer
     * 
     * @param m integer to add to this fraction
     * @return the sum of this fraction and m
     */
    public Fraction add( int m )
    {
        return new Fraction( num + m * denom, denom );
    }

    /**
     * Mutiply this fraction with another fraction
     * 
     * @param other fraction to mutiply with this fraction
     * @return the product of this fraction and other
     */
    public Fraction multiply( Fraction other )
    {
        int newNum = num * other.num;
        int newDenom = denom * other.denom;
        return new Fraction( newNum, newDenom );
    }

    /**
     * Mutiply this fraction with an integer
     * 
     * @param m integer to mutiply with this fraction
     * @return the product of this fraction and m
     */
    public Fraction multiply( int m )
    {
        return new Fraction( num * m, denom );
    }

    /**
     * Returns the value of this fraction as a double
     * 
     * @return the value of this fraction as a double
     */
    public double getValue()
    {
        return (double)num / (double)denom;
    }

    /**
     * Returns a string representation of this fraction
     * 
     * @return a string representation of this fraction
     */
    public String toString()
    {
        return num + "/" + denom;
    }

    // *** private methods ***
    
    /*
     * Reduces this fraction by the gcf and makes denom > 0
     */
    private void reduce()
    {
        if ( num == 0 )
        {
            denom = 1;
            return;
        }

        if ( denom < 0 )
        {
            num = -num;
            denom = -denom;
        }

        int q = gcf( Math.abs( num ), denom );
        num /= q;
        denom /= q;
    }

    /*
     * Returns the greatest common factor of two positive integers
     */
    private int gcf( int n, int d )
    {
        if ( n <= 0 || d <= 0 )
        {
            throw new IllegalArgumentException( "gcf precondition failed: " + n
                + ", " + d );
        }

        if ( n % d == 0 )
            return d;
        else if ( d % n == 0 )
            return n;
        else
            return gcf( n % d, d % n );
    }
}
