package cpe200;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Course {

    public Course() {
        this("TBA","00000","TBA",30);
    }

    public Course(String n, String cid) {
        setCourse_name(n);
        setCourse_id(cid);

    }

    public Course(String n, String cid, String l) {
        setCourse_name(n);
        setCourse_id(cid);
        setLecturer(l);
    }

    public Course(String n, String cid, String l, int max) {
        this.course_name = !n.equalsIgnoreCase("")?n:"TBA";
        String testid = "[0-9]{6,}$" ;
        if(cid.matches(testid)) this.course_id=cid ;
                else this.course_id="000000" ;
        if(!l.equals("")) this.lecturer =l ;
                else this.lecturer = "TBA" ;
        this.max_students = (max>=10)?max:30;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = !course_name.equalsIgnoreCase("")?course_name:this.course_name;
    }

    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = isValidCourse_id(course_id)?course_id:this.course_id;
    }

    // implement the other get and set methods here
    public String getLecturer() {
        return this.lecturer;
    }

    public void setLecturer(String lecturer) {

        if(lecturer!="") this.lecturer = lecturer;
    }

    public int getMax_students() {
        return this.max_students;
    }

    public void setMax_students(int max_students) {
        if (max_students >= 10) this.max_students = max_students;
    }

    public int getNo_students() {
        // implement here
        return no_students;
    }

    public void setNo_students(int no_students) {
        if(no_students<=max_students && no_students>0) this.no_students=no_students ;
    }

    @Override
    public String toString() {
        String n="" ;
        if(this.no_students==0) n = "NO student" ;
        else if(this.no_students==1) n= "ONE student" ;
        else if(this.no_students> 1){
            n=Integer.toString(no_students) + " students" ;
        }
        String o = this.course_name + " ("
                + this.course_id + "), Teacher: "
                + this.lecturer + ", has " + n + ", [maximum: " + String.valueOf(this.max_students) + "]";

        return o;
    }

    private boolean isValidCourse_id(String id) {
        Pattern p = Pattern.compile(idREGEX);
        Matcher m = p.matcher(id);

        if(m.matches()) return  true ;
        else return false ;
    }

    // Regular expression for the Student ID pattern
    private static final String idREGEX = "\\d{6}";

    // all private attributes
    private String course_name;
    private String course_id;
    private String lecturer;
    private int max_students;
    private int no_students;
}
