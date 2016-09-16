package cpe200;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Course {

    public Course(){
        this("TBA","000000","TBA",30);
    }

    public Course(String n, String cid) {
        this.course_name = n;
        this.course_id =cid;
        this.lecturer = "TBA";
        this.max_students = 30;
    }

    public Course(String n, String cid, String l){
        this.course_name = n;
        this.course_id = cid;
        this.lecturer = l;
        this.max_students = 30;
    }

    public Course(String n, String cid, String l, int max) {
        this.course_name = !n.equalsIgnoreCase("")?n:"TBA";
        if (cid.matches("^[0-9]{6}$")) this.course_id = cid;
        else this.course_id = "000000";
        this.lecturer = !l.equalsIgnoreCase("")?l:"TBA";
        this.max_students = max;
    }

    public String getCourse_name(){
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = !course_name.equalsIgnoreCase("")?course_name:this.course_name;
    }

    public String getCourse_id(){
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = isValidCourse_id(course_id)?course_id:this.course_id;
    }

    public String getLecturer() {
        return this.lecturer;
    }

    public void setLecturer(String lecturer) {
        if(!lecturer.equals(""))
            this.lecturer = lecturer;
    }

    public int getMax_students() {
        return this.max_students;
    }

    public void setMax_students(int max_students) {
        if(max_students >= 10)
            this.max_students = max_students;
    }

    public int getNo_students() {
        return this.no_students;
    }

    public void setNo_students(int no_students) {
        if(no_students > 0 && no_students < this.max_students)
            this.no_students = no_students;
    }

    @Override
    public String toString() {
        String n = " ",stun = "student,";
        if(no_students == 0)
            n = "NO";
        else if(no_students == 1)
            n = "ONE";
        else if(no_students > 1){
            n = Integer.toString(no_students);
            stun = "students,";
        }
        String o = this.course_name + " ("
                + this.course_id + "), Teacher: "
                + this.lecturer + ", has " + n + " " + stun + " [maximum: " + max_students +"]";
        return o;
    }

    private boolean isValidCourse_id(String id) {
        Pattern p = Pattern.compile(idREGEX);
        Matcher m = p.matcher(id);
        if(m.matches())return true;
        else return false;
    }

    private static final String idREGEX = "\\d{6}";

    private String course_name;
    private String course_id;
    private String lecturer;
    private int max_students;
    private int no_students;
}
