/**
 * Represents a complex number of the form a + bi. Provides methods for
 * adding, multiplying and calculating the absolute value.
 *
 *  @author  Alex Xu
 *  @version 9/30/15
 *  @author  Period: 4
 *  @author  Assignment: JMCh09Ex17_Complex 
 *
 *  @author  Sources: Alex Xu
 */
public class Complex
{
    double a;
    double b;
    /**
     * constructor for complex when both a and b are given
     * @param num1 a
     * @param num2 b
     */
    public Complex (double num1, double num2)
    {
        a = num1;
        b = num2;
    }
    /**
     * constructor for complex when b is 0
     * @param num1 a
     */
    public Complex (double num1){
        a = num1;
        b = 0.0;
    }
    /**
     * calculates the absolute value of a complex number
     * @return absolute value of complex number
     */
    public double abs(){
        double absVal = Math.sqrt(Math.pow( a, 2 ) + Math.pow( b, 2 ));
        return absVal;
    }
    /**
     * adds complex number to a real number
     * @param real number being added to this complex number
     * @return new complex sum
     */
    public Complex add(double num){
        return new Complex(a+num, b);
    }
    /**
     * adds complex number to another complex number
     * @param other complex number being added to this complex number
     * @return new complex sum
     */
    public Complex add(Complex other){
        double sumA = a + other.a;
        double sumB = b + other.b;
        return new Complex(sumA, sumB);
    }
    /**
     * multiples complex number by another complex number
     * @param other complex number
     * @return new complex product
     */
    public Complex multiply(Complex other){
        double prodA = a * other.a - b * other.b;
        double prodB = a * other.b + b * other.a;
        return new Complex(prodA, prodB);
    }
    /**
     * multiplies complex number by a double
     * @param num double being multiplied
     * @return new complex product
     */
    public Complex multiply(double num){
        return new Complex(a*num, b*num);
    }
    public String toString()
    {
        return a + " + " + b + "i";
    }
}
