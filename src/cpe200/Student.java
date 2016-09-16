package cpe200;

import com.sun.xml.internal.bind.v2.model.core.ID;
import com.sun.xml.internal.bind.v2.runtime.Name;

public class Student {

    public String getStudent_id(){
        return ID;
    }

    public String getName(){
        return Name;
    }

    public int getYearOfBirth(){
        return YOB;
    }

    public boolean isActive(){
        return act;
    }

    private String ID;

    private String Name;

    private int YOB;

    private boolean act;

    public Student() {
        this("John Doe","560610000",1990,false);
    }
    public Student(String n, String id, int year, boolean active){
        this.Name =!n.equalsIgnoreCase("")? n :"John Doe";

        String checkID ="^[5][6-9][0-9]{3}[0-2][0-9]{3}$";

        if(id.matches(checkID)){
            ID = id;
        }else ID = "560610000";

        if(year > 1989){
            YOB = year;
        }else YOB = 1990;

        act = active;

    }

    public void setName(String n){
        if(!n.equals("")){
            Name = n;
        }
    }

    public void setStudent_id(String id){
        String checkID ="^[5][6-9][0-9]{3}[0-2][0-9]{3}$";
        if(id.matches(checkID)){
            ID = id;
        }
    }

    public void setYearOfBirth(int year){
        if(year > 1989){
            YOB = year;
        }
    }

    @Override
    public String toString() {
        String tmp;
        if(isActive()==true){
            tmp ="ACTIVE";
        }else tmp = "INACTIVE";
        String o = Name +" (" + ID + ") was born in " + Integer.toString(YOB) + " is an "+ tmp + " student.";
        return o;
    }

    private boolean isValidStudent_id(String id) {
        return true;
    }

    private boolean isValidYOB(int yob) {
        return true;
    }

    // declare your attributes here

}
