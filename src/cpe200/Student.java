package cpe200;

public class Student {

    public Student() {
        name="John Doe";
        ID="560610000";
        year=1990;
        status=false;
    }

    public Student(String name,String ID){
        this.name=name;
        this.ID=ID;
    }

    public Student(String name,String ID,int year)
    {
        this.name=name;
        this.ID=ID;
        this.year=year;
    }

    public Student(String name,String ID,int year,boolean status)
    {
        this.name=!name.equalsIgnoreCase("")?name:"John Doe";
        this.ID=(ID.matches("^[5][6-9][0][6][1][0-2][0-9][0-9][0-9]$"))?ID:"560610000";
        this.year=(year>1989)?year:1990;
        this.status=status;
    }

    public void setName(String name)
    {
        if(name!="") this.name=name;
    }

    public void setStudent_id(String ID)
    {
        String check="^[5][6-9][0][6][1][0-2][0-9][0-9][0-9]$";
        if(ID.matches(check)) this.ID=ID;
    }

    public void setYearOfBirth(int year)
    {
        if(year>=1989) this.year=year;
    }

    public void setStatus(boolean status)
    {
        this.status=status;
    }

    public String getName()
    {
        return this.name;
    }

    public String getStudent_id()
    {
        return this.ID;
    }

    public int getYearOfBirth()
    {
        return this.year;
    }

    public boolean isActive()
    {
        return this.status;
    }


    @Override
    public String toString() {
        String Status;
        if(isActive()==true) Status="ACTIVE";
        else Status="INACTIVE";
        String form=name + " (" + ID + ") was born in " + Integer.toString(year)  + " is an " + Status + " student.";
        return form;
    }

    private boolean isValidStudent_id(String id) {
        return true;
    }

    private boolean isValidYOB(int yob) {
        return true;
    }

    private String name;
    private String ID;
    private int year;
    private boolean status;

}
