package cpe200;
import javax.management.remote.SubjectDelegationPermission;
public class Student {

    public Student() {
        this.setName(DEFAULT_NAME);
        this.setStudent_id(DEFAULT_STUDENT_ID);
        this.setYearOfBirth(DEFAULT_YEAR_OF_BIRTH);
        this.isActive(DEFAULT_STATUS);
    }

    public Student(String name, String studentID) {

        this.setName(name);
        this.setStudent_id(studentID);
        this.setYearOfBirth(DEFAULT_YEAR_OF_BIRTH);
        this.isActive(DEFAULT_STATUS);
    }
    public Student(String name, String studentID, int yearOfBirth) {

        this.setName(name);
        this.setStudent_id(studentID);
        this.setYearOfBirth(yearOfBirth);
        this.isActive(DEFAULT_STATUS);
    }

    public Student(String name, String studentID, int yearOfBirth, boolean status) {


        if (!setName(name)) {
            setName(DEFAULT_NAME);
        }
        if (!setStudent_id(studentID)) {
            setStudent_id(DEFAULT_STUDENT_ID);
        }
        if (!setYearOfBirth(yearOfBirth)) {
            setYearOfBirth(DEFAULT_YEAR_OF_BIRTH);
        }
        if (!isActive(status)) {
            isActive(DEFAULT_STATUS);
        }

    }

    public String getName() {
        return this.name;
    }

    public String getStudent_id() {
        return this.studentID;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public  boolean getStatus() { return  isActive();}


    public boolean setName(String name) {
        if (isValidName(name)){
            this.name = name;
            return true;
        }
        return false;

    }

    public boolean setStudent_id(String studentID) {
        if (isValidStudent_id(studentID)) {
            this.studentID = studentID;
            return true;
        }
        return false;
    }


    public boolean setYearOfBirth(int yearOfBirth) {
        if (isValidYOB(yearOfBirth)) {
            this.yearOfBirth = yearOfBirth;
            return true;
        }
        return false;
    }

    public boolean isActive() {
        return this.status;
    }

    public boolean isActive(boolean status) {
        this.status = status;
        return this.status;
    }
    @Override
    public String toString() {
        String stat;
        if(isActive()==true) stat = "ACTIVE";
        else stat = "INACTIVE";
        String o = name + " (" + id + ") was born in " + Integer.toString(year)  +" is an " + stat + " student.";
        return o;
    }



    private boolean isValidStudent_id(String id) {
        return true;
    }

    private boolean isValidYOB(int yob) {
        return true;
    }

    private String name;
    private String id;
    private int year;
    private boolean status;


}
