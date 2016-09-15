package cpe200;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Course {

    public Course() {
        setCourse_name("TBA");
        setCourse_id("000000");
        setLecturer("TBA");
        setMax_students(30);
        setNo_students(0);
    }

    public Course(String n, String cid) {
        // implement here
        setCourse_name(n);
        setCourse_id(cid);
        setNo_students(0);
    }

    public Course(String n, String cid, String l) {
        // implement here
        setCourse_name(n);
        setCourse_id(cid);
        setLecturer(l);
        setNo_students(0);
    }

    public Course(String n, String cid, String l, int max) {
        this.course_name = !n.equalsIgnoreCase("")?n:"TBA";
        // implement the rest here
        setCourse_name(n);
        setCourse_id(cid);
        setLecturer(l);
        setMax_students(max);
        setNo_students(0);
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        if(course_name.equals("")) return;
        else this.course_name = course_name ;
    }

    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        if(isValidCourse_id(course_id)) this.course_id = course_id;
        else return;
    }

    // implement the other get and set methods here
    public String getLecturer() {
        // implement here
        return lecturer;
    }

    public void setLecturer(String lecturer) {
        // implement here
        if(lecturer.equals("")) return;
        else this.lecturer = lecturer ;
    }

    public int getMax_students() {
        // implement here
        return max_students;
    }

    public void setMax_students(int max_students) {
        // implement here
        if(max_students >= 10)this.max_students = max_students ;
        else return ;
    }

    public int getNo_students() {
        // implement here
        return no_students;
    }

    public void setNo_students(int no_students) {
        // implement here
        if(no_students < this.max_students && no_students > 0){
            this.no_students = no_students ;
        }
        else return;
    }

    @Override
    public String toString() {
        String o = this.course_name + " ("
                + this.course_id + "), Teacher: "
                + this.lecturer + ", has ";

        // implement the rest here
        String numOfstudent = "";

        if(this.no_students == 1 ){

            numOfstudent = "ONE student, ";
        }
        if(this.no_students == 0 ){

            numOfstudent = "NO student, ";
        }
        else if(no_students >1) numOfstudent = Integer.toString(this.no_students) + " students, ";

        o = o+ numOfstudent + "[maximum: " + this.max_students +"]";
        return o  ;
    }

    private boolean isValidCourse_id(String id) {
        Pattern p = Pattern.compile(idREGEX);
        Matcher m = p.matcher(id);

        // implement the rest here
        if(m.matches()) return true;
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
