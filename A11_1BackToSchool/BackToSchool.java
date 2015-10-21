/**
 * class that tests implementation of other back to school classes
 * 
 * @author Alex Xu
 * @version 10/11/15
 * 
 * @author Period - 4
 * @author Assignment - Java Methods Ch09 - SnackBar
 * 
 * @author Sources - Alex Xu
 */
public class BackToSchool
{
    /**
     * main method for this class
     * 
     * @param args
     *            command line argument
     */
    public static void main( String[] args )
    {
        Person bob = new Person( "Coach Bob", 27, "M" );
        System.out.println( bob );

        Student lynne = new Student( "Lynne Brooke", 16, "F", "HS95129", 3.5 );
        System.out.println( lynne );

        Teacher mrJava = new Teacher( "Duke Java",
            34,
            "M",
            "Computer Science",
            50000 );
        System.out.println( mrJava );

        CollegeStudent ima = new CollegeStudent( "Ima Frosh",
            18,
            "F",
            "UCB123",
            4.0,
            1,
            "English" );
        System.out.println( ima );
    }
}
