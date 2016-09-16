package cpe200;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Course {

    public Course() {
        course_name = "TBA";
        course_id = "000000";
        lecturer = "TBA";
        max_students = 30;
        no_students = 0;
    }

    public Course(String n, String cid) {
        course_name = "TBA";
        course_id = "000000";
        lecturer = "TBA";
        max_students = 30;
        no_students = 0;
    }

    public Course(String n, String cid, String l) {
        setCourse_name(n);
        setCourse_id(cid);
        setLecturer(l);
        max_students = 30;
        no_students = 0;
    }

    public Course(String n, String cid, String l, int max) {
        setCourse_name(n);
        setCourse_id(cid);
        setLecturer(l);
        setMax_students(max);
        no_students = 0;
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
        this.lecturer = !lecturer.equalsIgnoreCase("")?lecturer:this.lecturer;
    }

    public int getMax_students() {
        return this.max_students;
    }

    public void setMax_students(int max_students) {
        if(max_students>=10)this.max_students=max_students;
    }

    public int getNo_students() {
        return this.no_students;
    }

    public void setNo_students(int no_students) {
        if(no_students>=0&&no_students<=max_students)this.no_students=no_students;
    }

    @Override
    public String toString() {
        String o = this.course_name + " ("
                + this.course_id + "), Teacher: "
                + this.lecturer + ", has "+(no_students==0?"NO student":(no_students==1?"ONE student":(no_students+" students")))+", [maximum: "+ max_students+"]";
        return o;
    }

    private boolean isValidCourse_id(String id) {
        Pattern p = Pattern.compile(idREGEX);
        Matcher m = p.matcher(id);

        if(m.find())return true;
        else  return false;
    }


    private static final String idREGEX = "^[0-9]{6}$";

    private String course_name;
    private String course_id;
    private String lecturer;
    private int max_students;
    private int no_students;
}
