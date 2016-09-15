package cpe200;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {

    public Student() {
        // implement here
        setName("John Doe");
        setStudent_id("560610000");
        setYearOfBirth(1990);
        this.status = false ;
    }

    public Student(String name , String studentID , int yearOfBirth , boolean status) {
        // implement here
        setName(name);
        setStudent_id(studentID);
        if(this.studentID == null) this.studentID = "560610000" ;
        setYearOfBirth(yearOfBirth);
        if(this.yearOfBirth < 1990 ) this.yearOfBirth = 1990 ;
        this.status = status ;
    }

    // implement all missing constructors here

    public void setName(String name ){
        if(name.equals("") ){
            System.out.println("ERROR");
            return;
        }
        else this.name = name ;
    }

    public void setStudent_id(String studentId){


        if (isValidStudent_id(studentId)) {
            this.studentID = studentId;
        }


    }

    public void setYearOfBirth(int year){
        if(isValidYOB(year)) this.yearOfBirth = year ;
    }


    // implement all get and set methods here
    public String getName(){
        return name;
    }

    public String getStudent_id(){
        return studentID;
    }

    public int getYearOfBirth(){
        return yearOfBirth;
    }

    public boolean isActive(){
        return this.status ;
    }

    @Override
    public String toString() {
        String isActive ;
        if(isActive()) isActive = "ACTIVE" ;
        else isActive = "INACTIVE";
        String o = name + " (" + studentID + ")" + " was born in " + yearOfBirth + " is an " + isActive + " student." ;

        return o;
    }

    private boolean isValidStudent_id(String id) {
        return id.matches(pattern);
    }

    private boolean isValidYOB(int yob) {
        return yob > 1989;
    }

    // declare your attributes here
    private String pattern = "^5[6-9]061[0-2][0-9]{3}$";
    private String name ;
    private String studentID ;
    private int yearOfBirth ;
    private boolean status ;

}
