import java.util.*;


/**
 * Class that replicates a farm with animals and sounds
 * 
 * @author Alex Xu
 * @version 10/26/15
 * 
 *          Period - 4 Assignment - A29.1 Old MacDonald
 * 
 *          Sources - Alex Xu
 */
public class Farm
{
    private Animal[] a = new Animal[3];


    public Farm()
    {
        // a[0] = new Cow("cow","moo moo");
        a[0] = new NamedCow( "cow", "Elsie", "moo" );
        // a[1] = new Chick("chick","cluck cluck");
        a[1] = new Chick( "chick", "cluckity cluck", "cheep" );
        a[2] = new Pig( "pig", "oink oink" );
    }


    public void animalSounds()
    {
        for ( int i = 0; i < a.length; i++ )
        {
            System.out.println( a[i].getType() + " goes " + a[i].getSound() );
        }
        System.out.println(
            a[0].getType() + " is named " + ( (NamedCow)a[0] ).getName() );
    }
}
