package cpe200;

public class Student {

    // declare your attributes here
    private String student_name;
    private String student_id;
    private int yob;
    private boolean status;

    public Student() {
        // implement here
        this.setName("John Doe");
        this.setStudent_id("560610000");
        this.setYearOfBirth(1990);
        this.setStatus(false);
    }

    // implement all missing constructors here
    public Student(String student_name, String student_id){
        this();
        this.setName(student_name);
        this.setStudent_id(student_id);
    }

    public Student(String student_name, String student_id, int yob){
        this();
        this.setName(student_name);
        this.setStudent_id(student_id);
        this.setYearOfBirth(yob);
    }

    public Student(String student_name, String student_id, int yob, boolean status){
        this();
        this.setName(student_name);
        this.setStudent_id(student_id);
        this.setYearOfBirth(yob);
        this.setStatus(status);
    }

    // implement all get and set methods here
    public void setName(String name){
        this.student_name = !name.equalsIgnoreCase("")?student_name:this.student_name;
    }

    public void setStudent_id(String student_id){
        this.student_id = isValidStudent_id(student_id)?student_id:this.student_id;
    }

    public void setYearOfBirth(int yob){
       this.yob = isValidYOB(yob)?yob:this.yob;
    }

    public void setStatus(boolean status){
        this.status = status;
    }

    public String getName(){
        return this.student_name;
    }

    public String getStudent_id(){
        return this.student_id;
    }

    public int getYearOfBirth(){
        return this.yob;
    }

    public boolean isActive(){
        return this.status;
    }

    @Override
    public String toString() {
        String o = getName() + " (" + getStudent_id() + ") was born in " + getYearOfBirth() + "is an " + (isActive()?"ACTIVE":"INACTIVE") + " student.";
        return o;
    }

    private boolean isValidStudent_id(String id) {
        String a = "[5][6-9][0][6][1][0-2][0-9][0-9][0-9]";
        return (id.matches(a))?true:false;
    }

    private boolean isValidYOB(int yob) {
        return (yob>=1999)?true:false;
    }
}
