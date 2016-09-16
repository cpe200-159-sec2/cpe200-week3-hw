package cpe200;

public class Student {
    private String name="John Doe";
    private String id="560610000";
    private int yob=1990;
    private boolean status=false;

    public Student() {
        this("John Doe","560610000",1990,false);
    }

    public Student(String name, String id) {
        setName(name);
        setStudent_id(id);
    }

    public Student(String name, String id, int yob) {
        setName(name);
        setStudent_id(id);
        setYearOfBirth(yob);
    }

    public Student(String name, String id, int yob, boolean status) {
        setName(name);
        setStudent_id(id);
        setYearOfBirth(yob);
        setStatus(status);
    }

    public void setName(String name) {
        if(name != ""){
            this.name = name;
        }
    }

    public void setStudent_id(String id) {
        String check = "^[0-9][6-9][0-9]{3,}[0-2][0-9]{3,}$";
        if (id.matches(check) && id.length() == 9)
            this.id = id;
    }

    public void setYearOfBirth(int yob) {
        if(isValidYOB(yob)){
            this.yob = yob;
        }
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
        return yob;
    }

    public boolean isActive() {
        return status;
    }


    @Override
    public String toString() {
        String o = name+" ("+id+") "+"was born in " +yob+ " is an "+(isActive()?"ACTIVE":"INACTIVE")+" student.";

        return o;
    }



    private boolean isValidYOB(int yob) {
        if (yob > 1989) {
            return true;
        }
        return false;
    }
}
