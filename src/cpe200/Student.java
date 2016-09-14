package cpe200;

public class Student {

    // declare your attributes here
    private String student_name;
    private String student_id;
    private int yob;
    private boolean status;

    public Student() {
        // implement here
       this("John Doe","560610000",1990,false);
    }

    // implement all missing constructors here
    public Student(String student_name, String student_id){
        this(student_name, student_id, 1990, false);
    }

    public Student(String student_name, String student_id, int yob){
        this(student_name, student_id, yob, false);
    }

    public Student(String student_name, String student_id, int yob, boolean status){
        this.student_name = !student_name.equalsIgnoreCase("")?student_name:"John Doe";
        this.student_id = isValidStudent_id(student_id)?student_id:"560610000";
        this.yob = isValidYOB(yob)?yob:1990;
        this.status = status;
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
        String o = getName() + " (" + getStudent_id() + ") was born in " + getYearOfBirth() + " is an " + (isActive()?"ACTIVE":"INACTIVE") + " student.";
        return o;
    }

    private boolean isValidStudent_id(String id) {
        String a = "[5][6-9][0][6][1][0-2][0-9][0-9][0-9]";
        return (id.matches(a))?true:false;
    }

    private boolean isValidYOB(int yob) {
        return (yob>1989)?true:false;
    }
}
