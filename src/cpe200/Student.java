package cpe200;

public class Student {
    // declare your attributes here
    private String student_name;
    private String student_id;
    private int yob;
    private boolean status;

    public Student() {
        // implement here
    }

    // implement all missing constructors here
    public Student(){

    }

    // implement all get and set methods here
    public void setName(String name){
        if(student_name.length()!=0){
            this.student_name = name;
        }else{
            System.out.print("ERROR");
        }
    }

    public String setStudent_id(String id){
    }
    public int setYearOfBirth(){

    }

    public String getName(){
        return student_name;
    }

    public String getStudent_id(){
        return student_id;
    }

    public int getYearOfBirth(){
        return yob;
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
