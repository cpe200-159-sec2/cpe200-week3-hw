package cpe200;

public class Student {

    public Student() {
        this("John Doe", "560610000", 1990, false);
    }

    public Student(String n,String id) {
        this.name = n;
        this.id = id;
    }
    public Student(String n,String id, int birth,boolean status)  {
        this.name = !n.equalsIgnoreCase("") ? n: "John Doe";
        this.id = (id.matches("^[5][6-9][0][6][1][0-2][0-9][0-9][0-9]$"))? id : "560610000";
        this.birth =(birth>1989) ? birth: 1990;
        this.status=status;
    }
    public void setName(String n){
        if (!n.equals(""))  name=n;
    }
    public void setStudent_id(String id) {
        String check = "^[0-9][6-9][0-9]{3,}[0-2][0-9]{3,}$";
        if (id.matches(check) && id.length() == 9) this.id = id;
    }
    public void setYearOfBirth(int birth) {
        if (birth> 1989) this.birth = birth;
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
        String Sts;
        if(status==true) Sts="ACTIVE";
        else Sts="INACTIVE";
        String o = name + " (" + id + ") was born in " + Integer.toString(birth)  + " is an " + Sts + " student.";

        return o;
    }

    private boolean isValidStudent_id(String id) {
        return true;
    }

    private boolean isValidYOB(int YearOfBirth) {
        return true;
    }

    private String name;
    private String id;
    private int birth;
    private boolean status;

}