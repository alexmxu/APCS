/**
 * Program that analyzes a text and finds and replaces all instances of a
 * certain character with a different symbol, as well as lists all the words
 * that have been changed.
 * 
 * @author Alex Xu
 * @version 10/5/15
 * 
 * @author Period - 4
 * @author Assignment - JMCh10 Lipogrammer
 * 
 * @author Sources - Alex Xu
 */
public class LipogramAnalyzer
{
    private String text;
    int newPosition;

    /**
     * Constructor: Saves the text string
     * 
     * @param text
     *            String to analyze
     */
    public LipogramAnalyzer( String text )
    {
        this.text = text;
    }


    /**
     * Returns the text string with all characters equal to letter replaced with
     * '#'.
     * 
     * @param letter
     *            character to replace
     * @return text string with all characters equal to letter replaced with '#'
     */
    public String mark( char letter )
    {

        return text.replace( letter, '#' ); // !!!Fix this
    }


    /**
     * Returns a String that concatenates all "offending" words from text that
     * contain letter; the words are separated by '\n' characters; the returned
     * string does not contain duplicate words: each word occurs only once;
     * there are no punctuation or whitespace characters in the returned string.
     * 
     * @param letter
     *            character to find in text
     * @return String containing all words with letter
     */
    public String allWordsWith( char letter )
    {
        int length = text.length();
        String result = "";
        int pos = 0;
        while (pos < text.length()-1)
        {
            pos = text.indexOf( letter,newPosition );
            if (pos == -1)
            {
                break;
            }
            if ( text.charAt( pos ) == letter )
            {
                if ( result.indexOf( "\n" + extractWord(pos) + "\n" ) == -1
                    && !result.startsWith( extractWord( pos ) ) )
                {
                    result += extractWord( pos ) + "\n";
                }
            }
            pos = newPosition;
        }
        return result;
    }


    // made public for test purposes
    /*
     * Returns the word that contains character at pos excluding any punctuation
     * or whitespace.
     * 
     * @param pos location of character
     * 
     * @return word that contains character at pos
     */
    public String extractWord( int pos )
    {
        int temp1, temp2;
        temp1 = pos;
        temp2 = pos;
        String string;
        while ( temp1 >= 0 && Character.isLetter( text.charAt( temp1 ) ) )
        {
            temp1--;
        }
        while ( temp2 < text.length() - 1
            && Character.isLetter( text.charAt( temp2 ) ) )
        {
            temp2++;
        }
        newPosition = temp2;
        return string = text.substring( temp1 + 1, temp2 );
    }
}
