package cpe200;

public class Student {
    private String name;
    private String id;
    private int year;
    private boolean status;
    public Student() {
        name = "John Doe";
        id = "560610000";
        year = 1990;
        status = false;

    }

    // implement all missing constructors here
    public Student(String name,String id){
        this.name = name;
        this.id = id;
    }

    public Student(String name,String id,int year){
        this.name = name;
        this.id = id;
        this.year = year;
    }

    public Student(String name,String id,int year,boolean status){
        this.name = !name.equalsIgnoreCase("")?name:"john Doe";
        this.id = (id.matches("^[5][6-9][0][6][1][0-2][0-9][0-9][0-9]$"))?id:"560610000";
        this.year = (year>1989)?year:1990;
        this.status = status;
    }
    public void setName(String n){
        if(!n.equals("")) name = n;
    }

    public void setStudent_id(String id){
       String check = "^[0-9][6-9][0-9]{3,}[0-2][0-9]{3,}$";
       if(id.matches(check) && id.length() == 9)
           this.id = id;

    }

    public void setYearOfBirth(int year){
        if(year > 1989)
            this.year = year;
    }

    public String getName(){
        return name;
    }

    public String getStudent_id(){
        return id;
    }

    public int getYearOfBirth(){
        return year;
    }

    public boolean isActive(){
        return status;
    }

    // implement all get and set methods here

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
    private String course_name;
    private String course_id;
    private String lecturer;
    private int max_students;
    private int no_students;

}
