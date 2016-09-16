package cpe200;

public class Student {

    private String stuname;
    private String stuid;
    private int stub;
    private boolean status;

    public Student() {
        this.stuname="John Doe";
        this.stuid="560610000";
        this.stub=1990;
        this.status=false;
    }

    public Student(String n, String id, int y, boolean tf){
        if(!n.equals("")) {
            this.stuname = n;
        }
        String check = "^[0-9][6-9][0-9]{3}[0-2][0-9]{3}$";
        if(id.matches(check)){
            this.stuid=id;
        }
        else{
            this.stuid="560610000";
        }
        if(y>1989) {
            this.stub = y;
        }
        else{
            this.stub = 1990;
        }
        this.status=tf;
    }

    public String getName(){
        return this.stuname;
    }

    public String getStudent_id(){
        return this.stuid;
    }

    public int getYearOfBirth(){
        return this.stub;
    }

    public boolean isActive(){
        return this.status;
    }

    public void setName(String n){
        if(!n.equals("")){
            this.stuid=n;
        }
    }

    public void setStudent_id(String id){
        String check = "^[0-9][6-9][0-9]{3}[0-2][0-9]{3}$";
        if(id.matches(check)){
            this.stuid=id;
        }
    }

    public void setYearOfBirth(int y){
        if(y>1989) {
            this.stub = y;
        }
    }

    @Override
    public String toString() {
        String active;
        if(this.status==true){
            active="ACTIVE";
        }
        else{
            active="INACTIVE";
        }
        String o = this.stuname + " (" + this.stuid + ") was born in " + this.stub + " is an " + active + " student.";

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
