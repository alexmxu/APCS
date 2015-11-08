/*** Part (c) ***/
/**
 *  checks if string does not accept the substring
 *
 *  @author  Alex Xu
 *  @version October 21, 2015
 *  @author  Period: 4
 *  @author  Assignment: A2008Q4_Checker
 *
 *  @author  Sources: Alex Xu
 */

public class NotChecker implements Checker
{
    private Checker check1;


    /**
     * Constructor for Not Checker
     * @param c1 first checker
     */
    public NotChecker( Checker c1)
    {
        check1 = c1;
    }

    /**
     *  tests to see checker does not accept substring
     * @param stringToCheck substring to check
     * @return true if it rejects, false if it accepts
     */
    public boolean accept( String stringToCheck )
    {
        
        return !check1.accept( stringToCheck);
    }
}
