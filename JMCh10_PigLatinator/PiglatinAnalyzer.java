import java.util.Scanner;
import java.util.StringTokenizer;


/**
 * this program analyzes a text and translates back and forth between pig latin
 * and english
 * 
 * @author Alex Xu
 * @version 10/11/15
 * 
 * @author Period - 4
 * @author Assignment - PigLatinator
 * 
 * @author Sources - Alex Xu
 */
public class PiglatinAnalyzer
{
    /**
     * analyzed text
     */
    private String text;

    /**
     * del for token
     */
    private String del = "()_+`-[]\\;'\":,./<>? \t";


    // Constructor: saves the text string
    public PiglatinAnalyzer( String text )
    {
        this.text = text;
    }


    /**
     * Converts a string to it piglatin form according to the following rules:
     * a. If there are no vowels in englishWord, then pigLatinWord is just
     * englishWord + "ay". (There are ten vowels: 'a', 'e', 'i', 'o', and 'u',
     * and their uppercase counterparts.) b. Else, if englishWord begins with a
     * vowel, then pigLatinWord is just englishWord + "yay". c. Otherwise (if
     * englishWord has a vowel in it and yet doesn't start with a vowel), then
     * pigLatinWord is end + start + "ay", where end and start are defined as
     * follows: 1. Let start be all of englishWord up to (but not including) its
     * first vowel. 2. Let end be all of englishWord from its first vowel on. 3.
     * But, if englishWord is capitalized, then capitalize end and
     * "uncapitalize" start.
     *
     * @return piglatin version of text as a String
     */
    public String phraseToPigLatin()
    {
        String piglatin = "";
        StringTokenizer tokenizer = new StringTokenizer( text, del, true );
        String tempString;

        while ( tokenizer.hasMoreTokens() )
        {
            tempString = tokenizer.nextToken();
            if ( tempString.length() >= 2 )
            {
                piglatin += wordToPigLatin( tempString );
            }
            else
            {
                piglatin += tempString;
                if ( tempString.toUpperCase().equals( "A" )
                    || tempString.toUpperCase().equals( "I" ) )
                {
                    piglatin += "yay";
                }
            }
        }

        return piglatin;
    }


    /**
     * Converts an "english" word to its piglatin form
     *
     * @param englishWord
     *            a string representing an english word
     * @return piglatin form of the english word
     */
    public String wordToPigLatin( String englishWord )
    {
        String newPig = "";
        if ( !hasVowel( englishWord ) )
        {
            newPig += englishWord + "ay";
        }
        else if ( vowelLocation( englishWord ) == 0 )
        {
            if ( Character
                .isLetter( englishWord.charAt( englishWord.length() - 1 ) ) )
                newPig += englishWord + "yay";
            else
                newPig += englishWord.substring( 0, englishWord.length() - 2 )
                    + "yay" + englishWord.charAt( englishWord.length() - 1 );
        }
        else
        {
            String start, end;
            start = englishWord.substring( 0, vowelLocation( englishWord ) );
            end = englishWord.substring( vowelLocation( englishWord ) );
            if ( ifCapitalFirst( englishWord ) )
            {
                end = capatalize( end );
                start = uncapatalize( start );
            }
            newPig = end + start + "ay";
        }

        return newPig;
    }

    public String capatalize( String string )
    {
        String s = string.toUpperCase().charAt( 0 ) + string.substring( 1 );
        return s;
    }


    public String uncapatalize( String string )
    {
        String s = string.toLowerCase().charAt( 0 ) + string.substring( 1 );
        return s;
    }


    public boolean hasVowel( String word )
    {
        word = word.toLowerCase();
        return ( word.contains( "a" ) || word.contains( "e" )
            || word.contains( "i" ) || word.contains( "o" )
            || word.contains( "u" ) );
    }


    public int vowelLocation( String word )
    {
        int ans = -1;
        for ( int i = 0; i < word.length(); i++ )
        {
            if ( word.charAt( i ) == 'a' || word.charAt( i ) == 'e'
                || word.charAt( i ) == 'i' || word.charAt( i ) == 'o'
                || word.charAt( i ) == 'u' || word.charAt( i ) == 'A'
                || word.charAt( i ) == 'E' || word.charAt( i ) == 'I'
                || word.charAt( i ) == 'O' || word.charAt( i ) == 'U' )
            {
                ans = i;
                break;
            }
        }
        return ans;
    }


    public boolean ifCapitalFirst( String string )
    {
        if ( string.toUpperCase().charAt( 0 ) == string.charAt( 0 ) )
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
