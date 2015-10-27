/**
 * class that makes a Pig
 * 
 * @author Alex Xu
 * @version 10/26/15
 * 
 * @author Period - 4
 * @author Assignment - A29.1 - Old MacDonald
 * 
 * @author Sources - Alex Xu
 */
class Pig implements Animal
{
    private String myType;

    private String mySound;


    /**
     * Initializes a newly created Pig object so that it represents an Animal of
     * the specified type that makes the specified sound.
     * 
     * @param type
     *            the type of Pig
     * @param sound
     *            the sound the Pig makes
     */
    public Pig( String type, String sound )
    {
        myType = type;
        mySound = sound;
    }


    /**
     * return mySound
     * 
     * @return mySound
     */
    public String getSound()
    {
        return mySound;
    }


    /**
     * return myType
     * 
     * @return myType
     */
    public String getType()
    {
        return myType;
    }
}