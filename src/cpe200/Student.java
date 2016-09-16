package cpe200;

public class Student {
    public Student() {
        this("John Doe","560610000",1990,false);
    }
    public Student(String n,String id){
        this.name = n;
        this.id = id;
    }
    public Student(String n, String id,int year,boolean status){
        this.name = !n.equalsIgnoreCase("")?n:"john Doe";
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

    @Override
    public String toString() {
        String tmp;
        if(isActive()==true)
            tmp = "ACTIVE";
        else tmp = "INACTIVE";
        String o = name +" (" + id + ") was born in " + Integer.toString(year) +" is an " + tmp + " student.";
        return o;
    }

    private boolean isValidStudent_id(String id){
        return true;
    }

    private boolean isValidYOB(int yob){
        return true;
    }

    private String name;
    private String id;
    private  int year;
    private boolean status;

}
