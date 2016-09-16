package cpe200;

import com.sun.xml.internal.bind.v2.model.core.ID;

public class Student {

    public Student() {
        // implement here
        this("John Doe","560610000",1990,false);
    }
    public Student(String n, String id, int year , boolean act){
        this.name = !n.equalsIgnoreCase("")?n :"John Doe";
        String checkID = "^[0-9][6-9][0-9]{3,0}[0-2][0-9]{3,0}$";
        if(id.matches(checkID)&&id.length()==9) ID =id;
        else ID = "560610100";
        if(year >1989) bd = year;
        else bd = 1990;
        active = act;
    }
    public void setName(String n){
        if (!n.equals(""))name =n;
    }
    public  void setStudent_id(String id){
        String checkID = "^[0-9][6-9][0-9]{3,0}[0-2][0-9]{3,0}$";
        if(id.matches(checkID)&&id.length()==9)ID = id;
    }
    public  void setYearofBirth(int year){
        if(year >1989)bd =year;
    }
    public String getName(){
        return  name;
    }
    public String getStudent_id(){
        return ID;
    }
    public int getYearOfBirth(){
        return bd;
    }
    public  boolean isActive(){
        return  active;
    }
    // implement all missing constructors here

    // implement all get and set methods here

    @Override
    public String toString() {
        String act;
        if(active == false) act= "an INACTIVE student.";
        else act = "an ACTIVE student.";
        String o = name + " ("+ID+")was born in "+bd+"is"+act;
        return o;
    }

    private boolean isValidStudent_id(String id) {
        return true;
    }

    private boolean isValidYOB(int yob) {
        return true;
    }

    // declare your attributes here
    private String name;
    private String ID;
    private int bd;
    private boolean active;


}
