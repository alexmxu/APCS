/**
 * class that makes a NamedCow
 * 
 * @author Alex Xu
 * @version 10/26/15
 * 
 * @author Period - 4
 * @author Assignment - A29.1 - Old MacDonald
 * 
 * @author Sources - Alex Xu
 */
class NamedCow extends Cow
{
    private String myName;


    /**
     * Initializes a newly created NamedCow object so that it represents an
     * Animal of the specified type that makes the specified sound with a name
     * as well.
     * 
     * @param type
     *            the type of Cow
     * @param sound
     *            the sound the Cow makes
     * @param name
     *            the name of the Cow
     */
    public NamedCow( String type, String name, String sound )
    {
        super( type, sound );
        myName = name;
    }


    /**
     * return name of Cow
     * 
     * @return myType
     */
    public String getName()
    {
        return myName;
    }
}
