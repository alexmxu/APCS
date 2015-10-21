/*** TODO Part (a) ***/
// TODO complete documentation

public class SubstringChecker
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


    public boolean accept( String stringToCheck )
    {

        return stringToCheck.contains( s );
    }
}
