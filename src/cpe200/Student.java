package cpe200;


public class Student {

    public static final String DEFAULT_ID = "560610000";

    public Student() {
        this("John Doe",DEFAULT_ID,1990,false);
    }

    public Student(String n, String id){
        setName(n);
        setStudent_id(id);
    }

    public Student(String n, String id, int yob){
        setName(n);
        setStudent_id(id);
        setYearOfBirth(yob);
    }

    public Student(String n, String id, int yob, boolean status) {

        setName(n);
        setStudent_id(id);
        setYearOfBirth(yob);
        setStatus(status);
    }


    public String getName() {
        return this.name;
    }

    public String getStudent_id() {
        return this.studentId;
    }

    public int getYearOfBirth() {
        return this.yearOfBirth;
    }

    public boolean isActive() {
        return this.status;
    }


    public void setName(String n) {
        if (!n.equals(""))
            this.name = n;
    }

    public void setStudent_id(String i_d) {
        if (isValidStudent_id(i_d)) {
            this.studentId = i_d;
        }
    }

    public void setYearOfBirth(int year) {
        if (isValidYOB(year)) {
            this.yearOfBirth = year;
        } else
            this.yearOfBirth = 1990;
    }

    public void setStatus(boolean status){
        this.status = status;
    }


    @Override
    public String toString() {
        String isActive;
        if (isActive()) isActive = "ACTIVE";
        else isActive = "INACTIVE";
        String o = name + " (" + studentId + ")" + " was born in " + yearOfBirth + " is an " + isActive + " student.";

        return o;
    }

    private boolean isValidStudent_id(String id) {
        String check = "^[0-9][6-9][0-9]{3,}[0-2][0-9]{3,}$";
        if (id.matches(check) && id.length() == 9) {
            return true;
        }
        return false;
    }

    private boolean isValidYOB(int yob) {
        if (yob > 1989) {
            return true;
        } else {
            return false;
        }


    }

    // declare your attributes here

    private String name="John Doe";
    private String studentId=DEFAULT_ID;
    private int yearOfBirth=1990;
    private boolean status=false;

}
