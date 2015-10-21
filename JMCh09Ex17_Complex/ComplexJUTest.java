import org.junit.*;

import static org.junit.Assert.*;
import junit.framework.JUnit4TestAdapter;

/**
 *  Test for the complex number class.
 *  
 *  testConstructor1Param - test the 1 parameter constructor
 *  testConstructor2Param - test the 2 parameter constructor
 *  testAddRealAndComplexNum - addition of a complex number 
 *     with a real number
 *  testAdd2ComplexNums - addition of two complex numbers
 *  testMultiply2ComplexNums - multiplication of two complex numbers
 *  testMultiplyRealAndComplexNum - multiplication of a complex number
 *     with a real number
 *  testAbsoluteValue - absolute value of a complex number
 *
 *  @author  Alex Xu
 *  @version 10/2/2015
 *  @author  Period: 4
 *  @author  Assignment: JMCh09Ex17_Complex 
 *
 *  @author  Sources: Alex Xu
 */
public class ComplexJUTest //extends junit.framework.TestCase
{
    @Test
    public void testConstructor1Param()
    {
        Complex other = new Complex(3);
        assertEquals(3.0, other.a, 0);
        assertEquals(0.0, other.b, 0);
    }

    @Test
    public void testConstructor2Param()
    {
        Complex other = new Complex(3, 4);
        assertEquals(3.0, other.a, 0);
        assertEquals(4.0, other.b, 0);
    }

    @Test
    public void testAddRealAndComplexNum()
    {
        Complex other =  new Complex(3,4);
        assertEquals("5.0 + 4.0i", other.add( 2 ).toString());
    }
    
    @Test
    public void testAdd2ComplexNums()
    {
        Complex other = new Complex(3,4);
        Complex other2 = new Complex(1,1);
        assertEquals("4.0 + 5.0i", other.add( other2 ).toString());
    }

    @Test
    public void testMultiply2ComplexNums()
    {
        Complex other = new Complex(3,4);
        Complex other2 = new Complex(2,2);
        assertEquals("-2.0 + 14.0i", other.multiply( other2 ).toString());
    }

    @Test
    public void testMultiplyRealAndComplexNum()
    {
        Complex other = new Complex(3,4);
        assertEquals("6.0 + 8.0i", other.multiply( 2 ).toString());
    }

    @Test
    public void testAbsoluteValue()
    {
        Complex other = new Complex(3,4);
        assertEquals(5.0, other.abs(), 0.0);
    }
    
//    public static junit.framework.Test suite()
//    {
//        return new JUnit4TestAdapter( ComplexJUTest.class );
//    }
//
//    public static void main( String args[] )
//    {
//        org.junit.runner.JUnitCore.main( "ComplexJUTest" );
//    }
}
