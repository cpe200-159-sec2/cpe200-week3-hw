package cpe200;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Course
{

    public Course()
    {
        setCourse_name("TBA");
        setCourse_id("000000");
        setLecturer("TBA");
        setMax_students(30);
        setNo_students(0);
    }

    public Course(String n, String cid) {
        this();
        setCourse_name(n);
        setCourse_id(cid);
    }

    public Course(String n, String cid, String l) {
        this();
        setCourse_name(n);
        setCourse_id(cid);
        setLecturer(l);
    }

    public Course(String n, String cid, String l, int max) {
        this();
        setCourse_name(n);
        setCourse_id(cid);
        setLecturer(l);
        setMax_students(max);
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        if (!course_name.equals(""))
            this.course_name = course_name;
    }

    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        if (isValidCourse_id(course_id))
            this.course_id = course_id;
    }

    public String getLecturer() {
        return lecturer;
    }

    public void setLecturer(String lecturer) {
        if (!lecturer.equals(""))
            this.lecturer = lecturer;
    }

    public int getMax_students() {
        return max_students;
    }

    public void setMax_students(int max_students) {
        if(max_students >= 10)
            this.max_students = max_students;
    }

    public int getNo_students() {
        return no_students;
    }

    public void setNo_students(int no_students) {
        if(no_students >= 0 && no_students <= max_students)
            this.no_students = no_students;
    }

    @Override
    public String toString() {
        String o = this.getCourse_name() + " ("
                + this.getCourse_id() + "), Teacher: "
                + this.getLecturer() + ", has ";

        if(getNo_students() == 0)
            o += "NO student";
        else if(getNo_students() == 1)
            o += "ONE student";
        else
            o += getNo_students() + " students";

        o += ", [maximum: " + getMax_students() + "]";

        return o;
    }

    private boolean isValidCourse_id(String id) {
        return id.matches(idREGEX);
    }

    // Regular expression for the Student ID pattern
    private static final String idREGEX = "[0-9]{6}";

    // all private attributes
    private String course_name;
    private String course_id;
    private String lecturer;
    private int max_students;
    private int no_students;
}
