/**
 *  This is a class that tests the Book class.
 *
 * @author  Alex Xu
 *  @version 8/24/2015
 *  @author  Period: 4
 *  @author  Assignment: JMCh03Ex11_Book
 *
 *  @author  Sources: Alex Xu
 */
public class BookTest
{
    /**
     * The main method in this class checks the Book operations for
     * consistency.
     */
    public static void main( String[] args )
    {
        /* *** TO BE IMPLEMENTED *** */
        Book book = new Book(3);
        System.out.println(book.getNumPages());
        System.out.println(book.getCurrentPage());
        book.nextPage();
        System.out.println(book.getCurrentPage());
        book.nextPage();
        System.out.println(book.getCurrentPage());
        book.nextPage();
        System.out.println(book.getCurrentPage());
        
    }
}
