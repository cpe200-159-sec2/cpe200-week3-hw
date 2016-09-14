package cpe200;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Course {

    public Course() {

        //this("","","",30);
        this.course_name = "TBA";
        this.course_id = "000000";
        this.lecturer = "TBA";
        this.max_students = 30;
    }

    public Course(String n, String cid) {
        // implement here
        //this(n,cid,"",30);
        setCourse_name(n);
        setCourse_id(cid);
        this.lecturer = "TBA";
        this.max_students = 30;
    }

    public Course(String n, String cid, String l) {
        // implement here
        setCourse_name(n);
        setCourse_id(cid);
        setLecturer(l);
        this.max_students = 30;

    }

    public Course(String n, String cid, String l, int max) {
        this.course_name = !n.equalsIgnoreCase("")?n:"TBA";
        // implement the rest here

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
        // implement here
        return this.lecturer;
    }

    public void setLecturer(String lecturer) {
        // implement here
        if(!"".equals(lecturer))
            this.lecturer = lecturer;
    }

    public int getMax_students() {
        // implement here
        return this.max_students;
    }

    public void setMax_students(int max_students) {
        // implement here
        if(max_students > 0)
            this.max_students = max_students;


    }

    public int getNo_students() {
        // implement here

        return this.no_students;
    }

    public void setNo_students(int no_students) {
        // implement here
        if(no_students <= max_students && no_students >= 0)
            this.no_students = no_students;
    }

    @Override
    public String toString() {
        String tmp;
            if(this.no_students == 0)
                tmp = "NO";
            else if(this.no_students == 1)
                tmp = "ONE";
            else
                tmp = Integer.toString(this.no_students);


        String o = this.course_name + " ("
                + this.course_id + "), Teacher: "
                + this.lecturer + ", has "

        // implement the rest here
                + tmp +
                ((this.no_students > 1 )? " students, " : " student, ")

                + "[maximum: " + this.max_students + "]";

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
