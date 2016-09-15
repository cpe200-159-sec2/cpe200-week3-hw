package cpe200;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Course {

    public Course() {
        this("TBA", "000000", "TBA", 30);
    }

    public Course(String n, String cid) {
        setCourse_name(n);
        setCourse_id(cid);
    }

    public Course(String n, String cid, String l) {
        setCourse_id(cid);
        setCourse_name(n);
        setLecturer(l);
    }

    public Course(String n, String cid, String l, int max) {
        setCourse_name(n);
        setCourse_id(cid);
        setLecturer(l);
        setMax_students(max);
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

        return lecturer;
    }

    public void setLecturer(String lecturer) {
        this.lecturer= !lecturer.equalsIgnoreCase("") ?lecturer:this.lecturer;
    }

    public int getMax_students() {
        return this.max_students;
    }

    public void setMax_students(int max_students) {
        if(max_students>=0)
            this.max_students=max_students;
    }

    public int getNo_students() {
        return this.no_students;
    }

    public void setNo_students(int no_students) {
        if(no_students>=0 && no_students<=max_students)
            this.no_students=no_students;
    }

    @Override
    public String toString() {
        String index="",s="student, ";
        if (this.no_students==0) index="NO";
        else if (this.no_students=1) index="ONE";
        else  index= Integer.toString(this.no_students);
        String o = this.course_name + " ("
                + this.course_id + "), Teacher: "
                + this.lecturer + ", has "+index+" "+s+"[maximum: "+this.max_students+ " ]";
        return o;
    }

    private boolean isValidCourse_id(String id) {
        Pattern p = Pattern.compile(idREGEX);
        Matcher m = p.matcher(id);
        return id.matches(idREGEX);
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
