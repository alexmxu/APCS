/**
 * person class - representing the object of a person with fields and methods
 * 
 * @author Alex Xu
 * @version 10/11/15
 * 
 * @author Period - 4
 * @author Assignment - Java Methods Ch09 - SnackBar
 * 
 * @author Sources - Alex Xu
 */
public class Person
{
    private String myName; // name of the person

    private int myAge; // person's age

    private String myGender; // 'M' for male, 'F' for female


    /**
     * constructor for person class
     * 
     * @param name
     *            name of person
     * @param age
     *            age of person
     * @param gender
     *            gender of person
     */
    public Person( String name, int age, String gender )
    {
        myName = name;
        myAge = age;
        myGender = gender;
    }


    /**
     * returns name of person
     * 
     * @return name of student
     */
    public String getName()
    {
        return myName;
    }


    /**
     * returns age of person
     * 
     * @return age of student
     */
    public int getAge()
    {
        return myAge;
    }


    /**
     * returns gender of person
     * 
     * @return gender of person
     */
    public String getGender()
    {
        return myGender;
    }


    /**
     * sets new name for student
     * 
     * @param name
     *            new student name
     */
    public void setName( String name )
    {
        myName = name;
    }


    /**
     * sets new age for student
     * 
     * @param age
     *            new student age
     */
    public void setAge( int age )
    {
        myAge = age;
    }


    /**
     * sets new gender for student
     * 
     * @param gender
     *            new student gender
     */
    public void setGender( String gender )
    {
        myGender = gender;
    }


    /**
     * Returns a String representation of this class.
     * 
     * @return private instance data as a String
     */
    public String toString()
    {
        return myName + ", age: " + myAge + ", gender: " + myGender;
    }
}