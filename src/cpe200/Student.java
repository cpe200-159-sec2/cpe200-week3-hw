package cpe200;

public class Student {

    public Student() {
        this("John Doe", "560610000", 1990, false);
    }
    public Student(String name , String id ){

        this(name,id,1990,false);
    }
    public  Student(String name,String id,int year ,boolean stat ){
        this.name = !name.equalsIgnoreCase("")?name:"John Doe";
        this.id = (id.matches("^[5][6-9][0][6][1][0-2][0-9][0-9][0-9]$"))?id:"560610000";
        this.year = (year>1989)?year:1990;
        this.status = stat;
    }
    public void setName(String name){
        if(name!="") this.name = name;
    }
    public void setStudent_id(String id){
        if(id.matches("^[5][6-9][0][6][1][0-2][0-9][0-9][0-9]$")) this.id = id;
    }
    public void setYearOfBirth(int year){
        if (year> 1989) this.year = year;
    }
    public void setStatus(boolean status){
        this.status=status ;
    }
    public String getName(){

        return name ;
    }
    public String getStudent_id(){

        return id ;
    }
    public int getYearOfBirth(){

        return year ;
    }
    public boolean isActive(){

        return status ;
    }
    @Override
    public String toString() {
        String check ;
        if(isActive()==true) check="ACTIVE";
        else check="INACTIVE" ;

        String o = name + " (" + id + ") was born in " + Integer.toString(year)  + " is an " + check + " student.";

        return o;
    }
    private String name;
    private String id;
    private int year;
    private boolean status;

    private boolean isValidStudent_id(String id) {
        return true;
    }

    private boolean isValidYOB(int yob) {
        return true;
    }

    // declare your attributes here

}
