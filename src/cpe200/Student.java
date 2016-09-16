package cpe200;

public class Student {

    public Student() {
        this("John Doe", "560610000", 1990, false);
    }
    public Student(String name, String id, int birth, boolean stat){
        this.name = !name.equalsIgnoreCase("") ? name:"John Doe";
        this.id = (id.matches("^[5][6-9][0][6][1][0-2][0-9][0-9][0-9]$"))?id:"560610000";
        this.birth = (birth>1989)?birth:1990;
        this.status = stat;
    }
    public void setName(String name){
        if (!name.equals(""))  this.name=name;
    }

    public void setStudent_id(String id) {
        if(id.matches("^[5][6-9][0][6][1][0-2][0-9][0-9][0-9]$")) this.id = id;
    }

    public void setYearOfBirth(int birth) {
        if (birth> 1989) this.birth = birth;
    }

    public void setStatus(boolean status){
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getStudent_id() {
        return id;
    }

    public int getYearOfBirth() {
        return birth;
    }

    public boolean isActive() {
        return status;
    }

    @Override
    public String toString() {
        String sts;
        if(isActive()==true) sts = "ACTIVE";
        else sts="INACTIVE";
        String o = name + " (" + id + ") was born in " + Integer.toString(birth)  + " is an " + sts + " student.";

        return o;
    }

    private boolean isValidStudent_id(String id) {
        return true;
    }

    private String name;
    private String id;
    private int birth;
    private boolean status;

}