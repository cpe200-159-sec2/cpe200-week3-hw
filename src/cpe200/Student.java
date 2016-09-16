package cpe200;

public class Student {

    private String Student_name;
    private String Student_id;
    private int yob;
    private boolean status;
    public static final int DEFA_YOB = 1990;

    public Student() {
        this.setName("John Doe");
        this.setStudent_id("560610000");
        this.setYearOfBirth(DEFA_YOB);
        this.setStatus(false);
    }


    public Student(String student_name,String student_id){
        this();
        this.setName(student_name);
        this.setStudent_id(student_id);

    }

    public Student(String student_name,String student_id,int yob){
        this();
        this.setName(student_name);
        this.setStudent_id(student_id);
        this.setYearOfBirth(yob);
    }

    public Student(String student_name, String student_id, int yob, boolean status) {
        this();
        this.setName(student_name);
        this.setStudent_id(student_id);
        this.setYearOfBirth(yob);
        this.setStatus(status);

    }

    public void setName(String name){
        if(!name.equals("")){
            this.Student_name = name;
        }
    }


    public void setStatus(boolean status){
        this.status = status;
    }


    public void setStudent_id(String id){
        if (isValidStudent_id(id)){
            this.Student_id = id;
        }
    }

    public void setYearOfBirth(int yob){
        if (isValidYOB(yob)){
            this.yob = yob;
        }
    }

    public boolean isActive() {
        return status;
    }

    public String getStudent_id(){
        return Student_id;
    }

    public String getName(){
        return Student_name;
    }

    public int getYearOfBirth(){
        return yob;
    }



    // implement all get and set methods here

    @Override
    public String toString() {
        String o = getName() + " (" + getStudent_id() + ") was born in " + getYearOfBirth() + " is an " +
                (isActive()? "ACTIVE":"INACTIVE") + " student.";
        return o;
    }

    private boolean isValidStudent_id(String id) {
        String A = "^5[6-9]061[0-2][0-9]{3}$";
        if (id.matches(A)){
            Student_id = id;
            return true;
        }
        return false;
    }

    private boolean isValidYOB(int yob) {

        if (yob > 1989){
            this.yob = yob;
            return true;
        }
        return false;
    }
}
