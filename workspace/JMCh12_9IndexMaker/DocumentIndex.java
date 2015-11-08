import java.util.ArrayList;

public class DocumentIndex extends ArrayList<IndexEntry>
{
    //  Creates an empty DocumentIndex with the default
    // initial capacity.
    public DocumentIndex()
    {
        super();
    }

    //  Creates an empty DocumentIndex with a given
    //  initial capacity.
    public DocumentIndex(int initialCapacity)
    {
        super( initialCapacity );
    }

    //  If word is not yet in this DocumentIndex,
    //  creates a new IndexEntry for word, and inserts
    //  it into this list in alphabetical order;
    //  adds num to this word's IndexEntry by calling
    //  its add(num) method.
    public void addWord(String word, int num)
    {
        get( foundOrInserted( word ) ).add( num );
    }

    //  For each word in str, calls addWord(word, num).
    public void addAllWords(String str, int num)
    {
        String[] words = str.split( "\\W+" );
        for ( String word : words )
        {
            if ( word.length() > 0 && Character.isLetter( word.charAt( 0 ) ) )
            {
                this.addWord( word, num );
            }
        }

    }

    // Tries to find an EndexEntry with a given word in this
    // DocumentIndex.  If not found, inserts a new EndexEntry for
    // word at the appropriate place (in lexicographical order).
    // Returns the index of the found or inserted IndexEntry
    private int foundOrInserted(String word)
    {
        int x;
        for ( x = 0; x < size(); x++ )
        {
            int test = get( x ).getWord().compareToIgnoreCase( word );
            if( test == 0 )
            {
                return x;
            }
            else if ( test > 0 )
            {
                break;
            }
        }
        add( x, new IndexEntry( word ) );
        return x;

    }
}
