package cpe200;

public class Student {

    public Student() {
        this("Jnhn Doe","560610000",1990,false);
    }

    public Student(String name,String id){
        this(name,id,1990,false);
    }

    public Student(String name,String id,int year){
        this(name,id,year,false);
    }

    public Student(String name,String id,int year,boolean stat){
        this.student_name = !name.equalsIgnoreCase("")?name:"John Doe";
        this.student_id = (id.matches("^[5][5-9][0][6][1][0-2][0-9][0-9][0-9]$"))?id:"560610000";
        this.year = (year>1989)?year:1990;
        this.stat = stat;
    }

    public void setName(String name){
        if(name != "")this.student_name = name;
    }

    public void setStudent_name(String id){
        if(id.matches("^[5][6-9][0][6][1][0-2][0-9][0-9][0-9]$"))
            this.student_id = id;
    }

    public void setYearOfBirth(int year){
        if(year>1989)this.year = year;
    }

    public void setStatus(boolean status){
        this.stat = status;
    }

    public String getName(){
        return student_name;
    }

    public  String getStudent_id(){
        return student_id;
    }

    public int getYearOfBirth(){
        return year;
    }

    public  boolean isActive(){
        return stat;
    }

    @Override
    public String toString() {
        String stat;
        if(isActive()==true) stat = "ACTIVE";
        else stat = "INACTIVE";
        String o = student_name + " (" + student_id +") was born in "
                + Integer.toString(year) + " is an "
                + stat + " student.";

        return o;
    }

    private boolean isValidStudent_id(String id) {
        return true;
    }

    private boolean isValidYOB(int yob) {
        return true;
    }

    private String student_name;
    private String student_id;
    private int year;
    private boolean stat;

}
