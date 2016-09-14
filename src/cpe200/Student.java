package cpe200;

public class Student {
    // declare your attributes here
    private String student_name;
    private String student_id;
    private int yearBirth;
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

    public Student(String student_name, String student_id, int yearBirth){
        this();
        this.setName(student_name);
        this.setStudent_id(student_id);
        this.setYearOfBirth(yearBirth);
    }

    public Student(String student_name, String student_id, int yearBirth, boolean status){
        this();
        this.setName(student_name);
        this.setStudent_id(student_id);
        this.setYearOfBirth(yearBirth);
        this.setStatus(status);
    }

    // implement all get and set methods here
    public void setName(String name){
        if(student_name.length()!=0){
            this.student_name = name;
        }else{
            System.out.print("ERROR");
        }
    }

    public void setStudent_id(String id){
        if(isValidStudent_id(student_id)){
            this.student_id = student_id;
        }
    }

    public void setYearOfBirth(int yearBirth){
        if(isValidYOB(yearBirth)){
            this.yearBirth = yearBirth;
        }
    }

    public void setStatus(boolean status){
        this.status = status;
    }

    public String getName(){
        return student_name;
    }

    public String getStudent_id(){
        return student_id;
    }

    public int getYearOfBirth(){
        return yearBirth;
    }

    public boolean isActive(){
        return status;
    }

    @Override
    public String toString() {
        String o = "Something";

        return o;
    }

    private boolean isValidStudent_id(String id) {
        return true;
    }

    private boolean isValidYOB(int yob) {
        return true;
    }
}
