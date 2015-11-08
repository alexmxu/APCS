/**
 * student class - representing the object of a student with fields and methods
 * 
 * @author Alex Xu
 * @version 10/11/15
 * 
 * @author Period - 4
 * @author Assignment - Java Methods Ch09 - SnackBar
 * 
 * @author Sources - Alex Xu
 */
public class Student extends Person
{
    private String myIdNum; // Student Id Number

    private double myGPA; // grade point average


    /**
     * constructor for student class
     * 
     * @param name
     *            name of student
     * @param age
     *            age of student
     * @param gender
     *            gender of student
     * @param idNum
     *            ID of student
     * @param gpa
     *            GPA of student
     */
    public Student(
        String name,
        int age,
        String gender,
        String idNum,
        double gpa )
    {
        // use the super class' constructor
        super( name, age, gender );

        // initialize what's new to Student
        myIdNum = idNum;
        myGPA = gpa;
    }


    /**
     * returns ID Number of student
     * 
     * @return ID number
     */
    public String getIdNum()
    {
        return myIdNum;
    }


    /**
     * returns GPA of student
     * 
     * @return GPA
     */
    public double getGPA()
    {
        return myGPA;
    }


    /**
     * sets new ID number
     * 
     * @param id
     *            new ID number
     */

    public void setIdNum( String id )
    {
        myIdNum = id;
    }


    /**
     * sets new GPA
     * 
     * @param gpa
     *            new GPA
     */
    public void setGPA( double gpa )
    {
        myGPA = gpa;
    }


    /**
     * Returns a String representation of this class.
     * 
     * @return private instance data as a String
     */
    public String toString()
    {
        return super.toString() + ", student id: " + myIdNum + ", gpa: "
            + myGPA;
    }
}
