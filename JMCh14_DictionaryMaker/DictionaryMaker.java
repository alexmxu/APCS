import java.util.Scanner;
import java.io.*;

/**
   TODO Write a one-sentence summary of your class here.
   TODO Follow it with additional details about its purpose, what abstraction
   it represents, and how to use it.

   @author  Alex Xu
   @version 11/15/15

   @author Period - 4
   @author Assignment - JM Ch14 - DictionaryMaker

   @author Sources - Alex Xu
 */
public class DictionaryMaker
{
    private static final int MINLENGTH = 3, MAXLENGTH = 5;
    public static Scanner fileIn;       //public for test purposes
    public static PrintWriter fileOut;  //public for test purposes

    public static void main(String[] args) throws IOException
    {
        Scanner kboard = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter input file name: ");
        String fileName = kboard.next();

        openInputFile(fileName);
        if (fileIn == null)
        {
            System.out.println("*** Can't open " + fileName + " ***");
            return;
        }

        createOutputFile("RamblecsDictionary.java");
        if (fileOut == null)
        {
            fileIn.close();
            System.out.println("*** Can't create RamblecsDictionary.java ***");
            return;
        }

        int count = copyWords();
        System.out.println("Done: " + count + " words.");

        fileIn.close();
        fileOut.close();
    }

    /**
     *  Opens a file fileName (in the current folder)
     *  and places a reference to it into fileIn
     */ 
    public static void openInputFile(String fileName)
    {
        File list = new File( fileName );
        try
        {
            fileIn = new Scanner( list );
        }
        catch ( FileNotFoundException e)
        {
            System.out.print( "error " + fileName );
            System.exit( 1 );
        }
    }

    /**
     *  Creates a new file fileName (in the current folder)
     *  and places a reference to it into fileOut
     */ 
    public static void createOutputFile(String fileName)
    {
        File words = new File( fileName );
        try
        {
            fileOut = new PrintWriter( words );
        }
        catch( FileNotFoundException e )
        {
            System.out.print( "error " + fileName );
            System.exit( 1 );
        }
    }

    /**
     *  Reads all words from fileIn, selects the words that have
     *  from MINLENGTH to MAXLENGTH letters, converts them
     *  into upper case and writes the words into fileOut in
     *  Java syntax
     *  
     *  @return number of words processed
     */ 
    public static int copyWords()
    {
        int counter = 0;
        fileOut.println( "public class RamblecsDictionary" );
        fileOut.println( "{");
        fileOut.println( "    public String words[] =" );
        fileOut.println( "    {" );
        while ( fileIn.hasNext() )
        {
            String string = fileIn.next();
            if ( string.length() >= MINLENGTH && string.length() <= MAXLENGTH)
            {
                fileOut.println("        \"" + string.toUpperCase() + "\"," );
                counter++;
            }
        }
        fileOut.println( "    };");
        fileOut.println( "}");
        
        return counter;
    }
}

