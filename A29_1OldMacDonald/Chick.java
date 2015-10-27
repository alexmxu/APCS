/**
 * class that makes a Chick
 * 
 * @author Alex Xu
 * @version 10/26/15
 * 
 * @author Period - 4
 * @author Assignment - A29.1 - Old MacDonald
 * 
 * @author Sources - Alex Xu
 */
class Chick implements Animal
{
    private String myType;

    private String mySound;

    private String mySound2;


    /**
     * Initializes a newly created chick object so that it represents an Animal
     * of the specified type that makes the specified sound.
     * 
     * @param type
     *            the type of Chick
     * @param sound
     *            the sound the Chick makes
     * @param sound2
     *            the second sound the Chick makes
     */
    public Chick( String type, String sound, String sound2 )
    {
        myType = type;
        mySound = sound;
        mySound2 = sound2;
    }


    /**
     * returns one of the two sounds the Chick can make
     * 
     * @return mySound or mySound2
     *
     */
    public String getSound()
    {
        int x = (int)( Math.random() * 2 );
        if ( x == 0 )
        {
            return mySound;
        }
        else
        {
            return mySound2;
        }
    }


    /**
     * return type of animal
     * 
     * @return myType
     */
    public String getType()
    {
        return myType;
    }
}