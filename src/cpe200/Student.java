package cpe200;

public class Student {

    public Student() {
        this("John Doe", "560610000", 1990, false);
    }

    public Student(String n, String id, int year, boolean act) {
        this.name = !n.equalsIgnoreCase("") ? n : "John Doe";
        String checkID = "^[0-9][6-9][0-9]{3,}[0-2][0-9]{3,}$";
        if (id.matches(checkID) && id.length() == 9) ID = id;
        else ID = "560610000";
        if (year > 1989) bd = year;
        else bd = 1990;
        active = act;
    }

    public void setName(String n) {
        if (!n.equals("")) name = n;
    }

    public void setStudent_id(String id) {
        String checkID = "^[0-9][6-9][0-9]{3,}[0-2][0-9]{3,}$";
        if (id.matches(checkID) && id.length() == 9) ID = id;
    }

    public void setYearOfBirth(int year) {
        if (year > 1989) bd = year;
    }

    public String getName() {
        return name;
    }

    public String getStudent_id() {
        return ID;
    }

    public int getYearOfBirth() {
        return bd;
    }

    public boolean isActive() {
        return active;
    }

    @Override
    public String toString() {
        String act;
        if (active == false) act = "an INACTIVE student.";
        else act = "an ACTIVE student.";
        String o = name + " (" + ID + ") was born in " + bd + " is " + act;
        return o;
    }

    private boolean isValidStudent_id(String id) {
        return true;
    }

    private boolean isValidYOB(int yob) {
        return true;
    }

    private String name;

    private String ID;

    private int bd;

    private boolean active;

}
