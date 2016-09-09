package cpe200;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Course {

    // CONSTRUCTORS
    public Course() {
        this(DEFAULT_COURSE_NAME, DEFAULT_COURSE_ID, DEFAULT_LECTURER_NAME, DEFAULT_MAX_STUDENTS);
    }

    public Course(String courseName, String courseId) {
        this(courseName, courseId, DEFAULT_LECTURER_NAME, DEFAULT_MAX_STUDENTS);
    }

    public Course(String courseName, String courseId, String lecturerName) {
        this(courseName, courseId, lecturerName, DEFAULT_MAX_STUDENTS);
    }

    public Course(String courseName, String courseId, String lecturerName, int maxStudents) {
        if (!setCourseName(courseName)) {
            setCourseName(DEFAULT_COURSE_NAME);
        }
        if (!setCourseId(courseId)) {
            setCourseId(DEFAULT_COURSE_ID);
        }
        if (!setLecturerName(lecturerName)) {
            setLecturerName(DEFAULT_LECTURER_NAME);
        }
        if (!setMaxStudents(maxStudents)) {
            setMaxStudents(DEFAULT_MAX_STUDENTS);
        }
        setCurrentStudents(DEFAULT_CURRENT_STUDENTS);
    }

    // SETTERS
    public boolean setCourseName(String courseName) {
        if (isValidCourseName(courseName)) {
            this.courseName = courseName;
            return true;
        }
        return false;
    }
    public boolean setCourseId(String courseId) {
        if (isValidCourseId(courseId)) {
            this.courseId = courseId;
            return true;
        }
        return false;
    }
    public boolean setLecturerName(String lecturerName) {
        if (isValidLecturerName(lecturerName)) {
            this.lecturerName = lecturerName;
            return true;
        }
        return false;
    }
    public boolean setMaxStudents(int maxStudents) {
        if (isValidMaxStudents(maxStudents)) {
            this.maxStudents = maxStudents;
            return true;
        }
        return false;
    }
    public boolean setCurrentStudents(int currentStudents) {
        if (isValidCurrentStudents(currentStudents)) {
            this.currentStudents = currentStudents;
            return true;
        }
        return false;
    }

    // GETTERS
    public String getCourseName() {
        return courseName;
    }
    public String getCourseId() {
        return courseId;
    }
    public String getLecturerName() {
        return lecturerName;
    }
    public int getMaxStudents() {
        return maxStudents;
    }
    public int getCurrentStudents() {
        return currentStudents;
    }
    public String getCurrentStudentsWordly() {
        int currentStudents = getCurrentStudents();
        switch(currentStudents) {
            case 0: return "NO student";
            case 1: return "ONE student";
            default: return new StringBuilder()
                    .append(currentStudents)
                    .append(" students")
                    .toString();
        }
    }

    // These are required because I refused to follow the naming convention used in the test
    // You know I could have changed the naming in the test file but decided I shouldn't go that far
    public boolean setCourse_name(String courseName) {
        return setCourseName(courseName);
    }
    public boolean setCourse_id(String courseId) {
        return setCourseId(courseId);
    }
    public boolean setLecturer(String lecturerName) {
        return setLecturerName(lecturerName);
    }
    public boolean setMax_students(int maxStudents) {
        return setMaxStudents(maxStudents);
    }
    public boolean setNo_students(int currentStudents) {
        return setCurrentStudents(currentStudents);
    }
    public String getCourse_name() {
        return getCourseName();
    }
    public String getCourse_id() {
        return getCourseId();
    }
    public String getLecturer() {
        return getLecturerName();
    }
    public int getMax_students() {
        return getMaxStudents();
    }
    public int getNo_students() {
        return getCurrentStudents();
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(courseName)
                .append(" (")
                .append(courseId)
                .append("), Teacher: ")
                .append(lecturerName)
                .append(", has ")
                .append(getCurrentStudentsWordly())
                .append(", [maximum: ")
                .append(getMaxStudents())
                .append("]")
                .toString();
    }

    // Validity tests
    private boolean isValidCourseName(String courseName) {
        return !"".equals(courseName);
    }
    private boolean isValidCourseId(String courseId) {
        return courseId.matches(COURSE_ID_PATTERN);
    }
    private boolean isValidLecturerName(String lecturerName) {
        return !"".equals(lecturerName);
    }
    private boolean isValidMaxStudents(int maxStudents) {
        return maxStudents >= 10;
    }
    private boolean isValidCurrentStudents(int currentStudents) {
        return 0 <= currentStudents && currentStudents <= maxStudents;
    }

    // RegEx
    private static final String COURSE_ID_PATTERN = "[0-9]{6}";

    // Defaults
    private static final String DEFAULT_COURSE_NAME = "TBA";
    private static final String DEFAULT_COURSE_ID = "000000";
    private static final String DEFAULT_LECTURER_NAME = "TBA";
    private static final int DEFAULT_MAX_STUDENTS = 30;
    private static final int DEFAULT_CURRENT_STUDENTS = 0;

    // Privates
    private String courseName;
    private String courseId;
    private String lecturerName;
    private int maxStudents;
    private int currentStudents;
}
