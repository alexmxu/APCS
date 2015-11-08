/*** Part (b) ***/
/**
 *  Checks if both checkers accept the substring
 *
 *  @author  Alex Xu
 *  @version October 21, 2015
 *  @author  Period: 4
 *  @author  Assignment: A2008Q4_Checker
 *
 *  @author  Sources: Alex Xu
 */

public class AndChecker implements Checker
{
    private Checker check1;
    private Checker check2;


    /**
     * Constructor for AndChecker
     * @param c1 first checker
     * @param c2 second checker
     */
    public AndChecker( Checker c1, Checker c2 )
    {
        check1 = c1;
        check2 = c2;
    }


    /**
     *  tests to see if both checkers accept substring
     * @param stringToCheck substring to check
     * @return true if both accept, false if one or both don't accept
     */
    public boolean accept( String stringToCheck )
    {

        return check1.accept( stringToCheck) && check2.accept( stringToCheck );
    }
}
