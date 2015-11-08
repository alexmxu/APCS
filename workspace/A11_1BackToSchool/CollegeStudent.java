/**
 * college student - representing the object of a college student with fields
 * and methods
 * 
 * @author Alex Xu
 * @version 10/11/15
 * 
 * @author Period - 4
 * @author Assignment - Java Methods Ch09 - SnackBar
 * 
 * @author Sources - Alex Xu
 */
public class CollegeStudent extends Student
{
    /**
     * major of student
     */
    private String major;

    /**
     * year of student
     */
    private int year;


    /**
     * constructor for the College Student class
     * 
     * @param myName
     *            name of student
     * @param myAge
     *            age of student
     * @param myGender
     *            gender of student
     * @param myIdNum
     *            ID of student
     * @param myGPA
     *            GPA of student
     * @param year
     *            year of student
     * @param major
     *            major of student
     */
    public CollegeStudent(
        String myName,
        int myAge,
        String myGender,
        String myIdNum,
        double myGPA,
        int year,
        String major )
    {
        super( myName, myAge, myGender, myIdNum, myGPA );
        this.year = year;
        this.major = major;
    }


    /**
     * return major of student
     * 
     * @return major
     */
    public String getMajor()
    {
        return major;
    }


    /**
     * sets new major of student
     * 
     * @param m
     *            new major
     */
    public void setMajor( String m )
    {
        major = m;
    }


    /**
     * 
     * returns year of student
     * 
     * @return student's year
     */
    public int getYear()
    {
        return year;
    }


    /**
     * 
     * sets new year of student
     * 
     * @param y
     *            student's new year
     */
    public void setYear( int y )
    {
        year = y;
    }


    /**
     * Returns a String representation of this class.
     * 
     * @return private instance data as a String
     */
    public String toString()
    {
        return super.toString() + ", year: " + year + ", major: " + major;
    }
}
