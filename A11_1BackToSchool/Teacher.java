/**
 * teacher class - representing the object of a teacher with fields and methods
 * 
 * @author Alex Xu
 * @version 10/11/15
 * 
 * @author Period - 4
 * @author Assignment - Java Methods Ch09 - SnackBar
 * 
 * @author Sources - Alex Xu
 */
public class Teacher extends Person
{
    /**
     * subject teacher teaches
     */
    private String subject;

    /**
     * salary of teacher
     */
    public double salary;


    /**
     * constructor for the Teacher class
     * 
     * @param myName
     *            name of teacher
     * @param myAge
     *            age of teacher
     * @param myGender
     *            gender of teacher
     * @param subject
     *            subject teacher teaches
     * @param salary
     *            salary of teacher
     */
    public Teacher(
        String myName,
        int myAge,
        String myGender,
        String subject,
        double salary )
    {
        super( myName, myAge, myGender );
        this.subject = subject;
        this.salary = salary;
    }


    /**
     * returns subject the teacher teaches
     * 
     * @return subject
     */
    public String getSubject()
    {
        return subject;
    }


    /**
     * 
     * sets new subject for teacher
     * 
     * @param sub
     *            new subject
     */
    public void setSubject( String sub )
    {
        subject = sub;
    }


    /**
     * 
     * returns salary of teacher
     * 
     * @return salary of teacher
     */
    public double getSalary()
    {
        return salary;
    }


    /**
     * 
     * sets new salary for teacher
     * 
     * @param sal
     *            new salary
     */
    public void setSalary( double sal )
    {
        salary = sal;
    }


    /**
     * Returns a String representation of this class.
     * 
     * @return private instance data as a String
     */
    public String toString()
    {
        return super.toString() + ", subject: " + subject + ", salary: "
            + salary;
    }
}