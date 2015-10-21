/*** Part (b) ***/
// TODO complete documentation

public class AndChecker
{
    private String s;


    /**
     * Constructor for AndChecker
     * @param string to find
     */
    public AndChecker( String string )
    {
        s = string;
    }


    public boolean accept( String stringToCheck )
    {

        return stringToCheck.contains( s );
    }
}
