package cpe200;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Course {

    public Course() {
        this("TBA","000000","TBA",30);
    }

    public Course(String n, String cid) {
        // implement here
        this(n, cid, "TBA", 30);
    }

    public Course(String n, String cid, String l) {
        // implement here
        this(n,cid,l,30);
    }

    public Course(String n, String cid, String l, int max) {
        this.course_name = !n.equalsIgnoreCase("")?n:"TBA";
        // implement the rest here
        this.course_id = !cid.matches("0[0-9]{6}$")?cid:"000000";
        this.lecturer = !l.equalsIgnoreCase("")?l:"TBA";
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
        // implement here
        return this.lecturer;
    }

    public void setLecturer(String lecturer) {
        // implement here
        this.lecturer = !lecturer.equalsIgnoreCase("")?lecturer:this.lecturer;
    }

    public int getMax_students() {
        // implement here
        return this.max_students;
    }

    public void setMax_students(int max_students) {
        // implement here
        if(max_students>=10){
            this.max_students = max_students;
        }
    }

    public int getNo_students() {
        // implement here
        return this.no_students;
    }

    public void setNo_students(int no_students) {
        // implement here
        if(no_students>0&&no_students<this.max_students){
            this.no_students = no_students;
        }
    }

    @Override
    public String toString() {
        String check;
        if(this.no_students==0){
            check = "NO student";
        }else if(this.no_students==1){
            check = "ONE student";
        }else{
            check = String.valueOf(this.no_students) + " students";
        }

        String o = this.course_name + " ("
                + this.course_id + "), Teacher: "
                + this.lecturer + ", has "

        // implement the rest here
                + check + ", [maximum: " + String.valueOf(this.max_students) + "]";

        return o;
    }

    private boolean isValidCourse_id(String id) {
        Pattern p = Pattern.compile(idREGEX);
        Matcher m = p.matcher(id);

        // implement the rest here

        return (m.matches())? true:false;
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
