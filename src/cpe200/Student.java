package cpe200;

public class Student {
    private String Name,ID;
    private int YoB;
    private boolean status;
    public Student() {
        Name = "John Doe";
        ID = "560610000";
        YoB = 1990;
        status = false;
    }
    public Student(String name,String id){
        Name = name;
        if(isValidStudent_id(id)){
            ID = id;
        }
        else ID = "560610000";
        YoB = 1990;
        status = false;
    }
    public Student(String name,String id,int year){
        Name = name;
        if(isValidStudent_id(id))ID=id;
        else ID = "560610000";
        if(isValidYOB(year))YoB=year;
        else YoB = 1990;
        status = false;
    }
    public Student(String name,String id,int year,boolean sta){
        Name = name;
        if(isValidStudent_id(id))ID = id;
        else ID = "560610000";
        if(isValidYOB(year))YoB = year;
        else YoB = 1990;
        status = sta;
    }
    public void setName(String name){
        if(!name.equals(""))Name=name;
    }
    public void setStudent_id(String id){
        if(isValidStudent_id(id))ID=id;
    }
    public void setYearOfBirth(int year){
        if(isValidYOB(year))YoB=year;
    }
    public void setActive(boolean sta){
        status = sta;
    }
    public String getName(){
        return Name;
    }
    public String getStudent_id(){
        return ID;
    }
    public int getYearOfBirth(){
        return YoB;
    }
    public boolean isActive(){
        return status;
    }
    @Override
    public String toString() {
        String o = Name+" ("+ID+") was born in "+YoB+" is an "+(status?"ACTIVE":"INACTIVE")+" student.";

        return o;
    }

    private boolean isValidStudent_id(String id) {
        if(id.matches("^5[6-9]061[0-2][0-9]{3}$")) return true;
        else return false;
    }

    private boolean isValidYOB(int yob) {
        if(yob>1989)return true;
        else return false;
    }

    // declare your attributes here

}
