package cpe200;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Course {

    public Course() {
        this.course_name = "TBA";
        this.course_id = "000000";
        this.lecturer = "TBA";
        this.max_students = 30;
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
        this.course_name = !course_name.equalsIgnoreCase("") ? course_name : this.course_name;
    }

    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = isValidCourse_id(course_id) ? course_id : this.course_id;
    }

    public String getLecturer() {
        return this.lecturer;
    }

    public void setLecturer(String lecturer) {
        if (lecturer != "") {
            this.lecturer = lecturer;
        }
    }

    public int getMax_students() {
        return this.max_students;
    }

    public void setMax_students(int max_students) {
        if (max_students > 0) {
            this.max_students = max_students;
        }
    }

    public int getNo_students() {
        return this.no_students;
    }

    public void setNo_students(int no_students) {
        if (no_students <= max_students && no_students >= 0) {
            this.no_students = no_students;
        }
    }

    @Override
    public String toString() {
        String index;
        String a;
        if (this.no_students == 0) {
            index = "NO";
            a = "student";
        } else if (this.no_students == 1) {
            index = "ONE";
            a = "student";
        } else {
            index = Integer.toString(this.no_students);
            a = "students";
        }
        String o = this.course_name + " ("
                + this.course_id + "), Teacher: "
                + this.lecturer + ", has " + index + " " + a + ", "
                + "[maximum: " + this.max_students + "]";
        return o;
    }

    private boolean isValidCourse_id(String id) {
        Pattern p = Pattern.compile(idREGEX);
        Matcher m = p.matcher(id);

        return id.matches(idREGEX);
    }

    private static final String idREGEX = "\\d{6}";
    private String course_name;
    private String course_id;
    private String lecturer;
    private int max_students;
    private int no_students;
}
