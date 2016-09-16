package cpe200;

import java.util.IntSummaryStatistics;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Course {

    public Course() {
        this.course_name = "TBA";
        this.course_id = "000000";
        this.lecturer = "TBA";
        this.max_students = 30;
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
        this.course_name = !n.equalsIgnoreCase("") ? n : "TBA";

        String check = "^[0-9]{6,}$";
        if (cid.matches(check)) {
            course_id = cid;
        } else
            course_id = "00000";

        if (!l.equals("")) {
            lecturer = l;
        } else
            lecturer = "TBA";
        max_students = max;
        no_students = 0;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = !course_name.equalsIgnoreCase("") ? course_name : this.course_name;
    }

    public String getCourse_id() {
        return this.course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = isValidCourse_id(course_id) ? course_id : this.course_id;
    }

    public String getLecturer() {
        return this.lecturer;
    }

    public void setLecturer(String lecturer) {
        if (!lecturer.equals(""))
            this.lecturer = lecturer;
    }

    public int getMax_students() {
        return max_students;
    }

    public void setMax_students(int max_students) {
        if (max_students >= 10)
            this.max_students = max_students;
    }

    public int getNo_students() {
        return no_students;
    }

    public void setNo_students(int no_students) {
        if (no_students >= 0 && no_students <= max_students)
            this.no_students = no_students;
    }

    @Override
    public String toString() {
        String hasStudent;
        if (this.no_students == 0) {
            hasStudent = "NO student";
        } else if (this.no_students == 1)
            hasStudent = "ONE student";
        else hasStudent = Integer.toString(this.no_students) + " students";

        String o = this.course_name + " ("
                + this.course_id + "), Teacher: "
                + this.lecturer + ", has "
                + hasStudent + ", [maximum: " + Integer.toString(max_students)
                + "]";

        return o;
    }

    private boolean isValidCourse_id(String id) {
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
