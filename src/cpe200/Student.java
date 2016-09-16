package cpe200;

public class Student {

    public Student() {

        this.name = "John Doe";
        this.id = "560610000";
        this.year = 1990;
        this.status = false;

<<<<<<< HEAD
    }

    public Student(String name, String id) {
        this.name = !name.equalsIgnoreCase("") ? name : DEFAULT_NAME;
        this.id = (isValidStudent_id(id)) ? id : "560610000";
        this.year = 1990;
        this.status = false;
    }

    public Student(String name, String id, int year) {
        this.name = !name.equalsIgnoreCase("") ? name : DEFAULT_NAME;
        this.id = (isValidStudent_id(id)) ? id : "560610000";
        this.year = (year >= 1989) ? year : 1990;
        this.status = false;
    }

    public Student(String name, String id, int year, boolean stat) {
        this.name = !name.equalsIgnoreCase("") ? name : "John Doe";
        this.id = (isValidStudent_id(id)) ? id : "560610000";
        this.year = (year > 1989) ? year : 1990;
        this.status = stat;
    }

    public void setName(String name) {
        if (name != "") this.name = name;
    }

    public void setStudent_id(String id) {
        if (id.matches("^[5][6-9][0][6][1][0-2][0-9]{3}$")) this.id = id;
    }

    public void setYearOfBirth(int year) {
        if (year > 1989) this.year = year;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getStudent_id() {
        return id;
    }

    public int getYearOfBirth() {
        return year;
    }

=======
    }

    public Student(String name, String id) {
        this.name = !name.equalsIgnoreCase("") ? name : "John Doe";
        this.id = (id.matches("^[5][6-9][0][6][1][0-2][0-9][0-9][0-9]$")) ? id : "560610000";
        this.year = 1990;
        this.status = false;
    }

    public Student(String name, String id, int year) {
        this.name = !name.equalsIgnoreCase("") ? name : "John Doe";
        this.id = (id.matches("^[5][6-9][0][6][1][0-2][0-9][0-9][0-9]$")) ? id : "560610000";
        this.year = (year > 1989) ? year : 1990;
        this.status = false;
    }

    public Student(String name, String id, int year, boolean stat) {
        this.name = !name.equalsIgnoreCase("") ? name : "John Doe";
        this.id = (id.matches("^[5][6-9][0][6][1][0-2][0-9][0-9][0-9]$")) ? id : "560610000";
        this.year = (year > 1989) ? year : 1990;
        this.status = stat;
    }

    public void setName(String name) {
        if (name != "") this.name = name;
    }

    public void setStudent_id(String id) {
        if (id.matches("^[5][6-9][0][6][1][0-2][0-9]{3}$")) this.id = id;
    }

    public void setYearOfBirth(int year) {
        if (year > 1989) this.year = year;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getStudent_id() {
        return id;
    }

    public int getYearOfBirth() {
        return year;
    }

>>>>>>> 0f60c458e9fb7f272800336705d6c9be8dea2e7e
    public boolean isActive() {
        return status;
    }

    @Override
    public String toString() {
        String stat;
<<<<<<< HEAD
        if (isActive() == true) {
            stat = "ACTIVE";
        }
        else {
            stat = "INACTIVE";
        }
=======
        if (isActive() == true) stat = "ACTIVE";
        else stat = "INACTIVE";
>>>>>>> 0f60c458e9fb7f272800336705d6c9be8dea2e7e
        String o = name + " (" + id + ") was born in " + String.valueOf(year) + " is an " + stat + " student.";

        return o;
    }

    private boolean isValidStudent_id(String id) {
        return id.matches("^[5][6-9][0][6][1][0-2][0-9][0-9][0-9]$");
        //return true;
    }


    private boolean isValidYOB(int yob) {
        return true;
    }

<<<<<<< HEAD
    public static final String DEFAULT_NAME = "John Doe";


=======
>>>>>>> 0f60c458e9fb7f272800336705d6c9be8dea2e7e
    private String name;
    private String id;
    private int year;
    private boolean status;
}