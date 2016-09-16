package cpe200;

public class Student {
    private String name, id;
    private int year;
    private boolean status;

    public Student() {
        this.setName("John Doe");
        this.setStudent_id("560610000");
        this.setYearOfBirth(1990);
        this.setStatus(false);
    }

    public Student(String name, String id, int year, boolean status) {

        if (!setName(name)) {
            setName("John Doe");
        }
        if (!setStudent_id(id)) {
            setStudent_id("560610000");
        }
        if (!setYearOfBirth(year)) {
            setYearOfBirth(1990);
        }
        if (!setStatus(status)) {
            setStatus(false);
        }
    }

    public boolean setName(String name) {
        if (name != "") {
            this.name = name;
            return true;
        }
        return false;
    }

    public boolean setStudent_id(String id) {
        if (isValidStudent_id(id)) {
            this.id = id;
            return true;
        }
        return false;
    }

    public boolean setYearOfBirth(int year) {
        if (isValidYOB(year)) {
            this.year = year;
            return true;
        }
        return false;
    }

    public boolean setStatus(boolean status) {
        this.status = status;
        return status;
    }

    public boolean isValidStudent_id(String id){
        if(id.matches("^[5][6-9][0][6][1][0-2][0-9][0-9][0-9]$")){
            this.id = id;
            return true;
        }
        return false;
    }

    public boolean isValidYOB(int year){
        if(year>1989){
            this.year = year;
            return true;
        }return false;
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

    public boolean isActive() {
        return status;
    }

    @Override
    public String toString() {
        String index;
        if (this.isActive() == true) {
            index = "ACTIVE";
        } else {
            index = "INACTIVE";
        }
        String o = this.name + " (" + this.id + ") was born in " + this.year +
                " is an " + index + " student.";
        return o;
    }
}
