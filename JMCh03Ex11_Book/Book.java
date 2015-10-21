/**
 * Creates a book class with currPage and numPages, and is able to flip to the next page.
 *
 * @author Alex Xu
 * @version 8/24/2015
 * @author Period: 4
 * @author Assignment: JMCh03Ex11_Book
 *
 * @author Sources: Alex Xu
 */
public class Book
{
    //implement data fields
    private int numPages, currentPage;


    //implement constructor
    /**
     * set currentPage to one and numPages to whatever it was constructed with.
     */
    public Book( int startPages )
    {
        currentPage = 1;
        numPages = startPages;
    }


    // TODO implement methods
    /**
     * Returns currentPage
     */
    public int getCurrentPage()
    {
        return currentPage;
    }


    /**
     * Returns numPages
     */
    public int getNumPages()
    {
        return numPages;
    }


    /**
     * Adds 1 to current page if it's less than numPages
     */
    public void nextPage()
    {
        if ( currentPage < numPages )
        {
            currentPage++;
        }
    }
}
