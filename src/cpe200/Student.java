package cpe200;

import javax.management.remote.SubjectDelegationPermission;

public class Student {


    public Student() {
        // implement here
        this.setName(DEFAULT_NAME);
        this.setStudent_id(DEFAULT_STUDENT_ID);
        this.setYearOfBirth(DEFAULT_YEAR_OF_BIRTH);
        this.isActive(DEFAULT_STATUS);
    }

    // implement all missing constructors here
    public Student(String name, String studentID) {
        // implement here
        this.setName(name);
        this.setStudent_id(studentID);
        this.setYearOfBirth(DEFAULT_YEAR_OF_BIRTH);
        this.isActive(DEFAULT_STATUS);
    }


    public Student(String name, String studentID, int yearOfBirth) {
        // implement here
        this.setName(name);
        this.setStudent_id(studentID);
        this.setYearOfBirth(yearOfBirth);
        this.isActive(DEFAULT_STATUS);
    }

    public Student(String name, String studentID, int yearOfBirth, boolean status) {
        // implement here

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


    // implement all get and set methods here
    //get methods
    public String getName() {
        return this.name;
    }

    public String getStudent_id() {
        return this.studentID;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }


    //set methods
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

        String tmp;
        if (this.isActive())
            tmp = "ACTIVE";
        else
            tmp = "INACTIVE";

        return this.name + " (" + this.studentID + ") was born in " + this.yearOfBirth
                + " is an " + tmp + " student.";
    }

    private boolean isValidName(String studentName) {
        return !"".equals(studentName);
    }

    private boolean isValidStudent_id(String id) {
        return id.matches(VALID_STUDENT_ID);
    }

    private boolean isValidYOB(int yob) {
        return yob > 1989;
    }

    // declare your attributes here
    //Defaluts
    private String DEFAULT_NAME = "John Doe";
    private String DEFAULT_STUDENT_ID = "560610000";
    private int DEFAULT_YEAR_OF_BIRTH = 1990;
    private boolean DEFAULT_STATUS = false;

    //Validity
    private String VALID_STUDENT_ID = "^5[6-9]061[0-2][0-9]{3}$";

    //Variables
    private String name;
    private String studentID;
    private int yearOfBirth;
    private boolean status;
}


