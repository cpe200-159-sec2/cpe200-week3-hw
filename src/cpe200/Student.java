package cpe200;


public class Student {

    public Student() {
        this.setName("John Doe");
        this.setStudent_id("580610000");
        this.setYearOfBirth(1990);
        this.status=false;
    }

    public Student(String name,String studentid,int year,boolean status){
        setName(name);
        setStudent_id(studentid);
        setYearOfBirth(year);
        if(this.yearofBirth<1990)this.yearofBirth=1990;
        this.status = status;
    }

    public void setName(String name){
        if (name != ""){
            this.name=name;
        }
    }

    public void setStudent_id(String studentId){
        if(isValidStudent_id(studentId))
            this.studentid=studentId;
    }

    public void setYearOfBirth(int year){
        if(isValidYOB(year)) this.yearofBirth = year ;
    }

    public String getName(){
        return name;
    }

    public String getStudent_id(){
        return studentid;
    }

    public int getYearOfBirth(){
        return yearofBirth;
    }

    public boolean isActive(){
        return this.status;
    }


    @Override
    public String toString() {
        String a;
        if(this.isActive())
            a="ACTIVE";
        else
            a="INACTIVE";

        String o = name + " (" + studentid + ")" + " was born in " + yearofBirth + " is an " + a + " student." ;

        return o;
    }

    private boolean isValidStudent_id(String id) {
        return id.matches("^5[6-9]061[0-2][0-9]{3}$");
    }

    private boolean isValidYOB(int yob) {
        return yob > 1989;
    }

    private String name;
    private String studentid;
    private int yearofBirth;
    private boolean status;

}
