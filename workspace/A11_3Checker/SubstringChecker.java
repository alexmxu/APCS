/*** Part (a) ***/
/**
 *  tests if a certain string contains a substring
 *
 *  @author  Alex Xu
 *  @version October 21, 2015
 *  @author  Period: 4
 *  @author  Assignment: A2008Q4_Checker
 *
 *  @author  Sources: Alex Xu
 */

public class SubstringChecker implements Checker
{
    private String s;


    /**
     * Constructor for SubstringChecker
     * @param string to find
     */
    public SubstringChecker( String string )
    {
        s = string;
    }

    /**
     *  tests to see if both checkers accept substring
     * @param stringToCheck substring to check
     * @return true if it contains the certain string
     */
    public boolean accept( String stringToCheck )
    {

        return stringToCheck.contains( s );
    }
}
