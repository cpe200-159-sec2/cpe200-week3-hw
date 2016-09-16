package cpe200;

public class Student {

    // CONSTRUCTORS
    public Student() {
        setStudentName(DEFAULT_STUDENT_NAME);
        setStudentId(DEFAULT_STUDENT_ID);
        setYearOfBirth(DEFAULT_YEAR_OF_BIRTH);
        setStatus(DEFAULT_STATUS);
    }

    public Student(String studentName, String studentId) {
        this();
        setStudentName(studentName);
        setStudentId(studentId);
    }

    public Student(String studentName, String studentId, int yearOfBirth) {
        this(studentName, studentId);
        setYearOfBirth(yearOfBirth);
    }

    public Student(String studentName, String studentId, int yearOfBirth, boolean status) {
        this(studentName, studentId, yearOfBirth);
        setStatus(status);
    }

    // SETTERS
    public boolean setStudentName(String studentName) {
        if (isValidName(studentName)) {
            this.studentName = studentName;
            return true;
        }
        return false;
    }
    public boolean setStudentId(String studentId) {
        if (isValidStudentId(studentId)) {
            this.studentId = studentId;
            return true;
        }
        return false;
    }
    public boolean setYearOfBirth(int yearOfBirth) {
        if (isValidYearOfBirth(yearOfBirth)) {
            this.yearOfBirth = yearOfBirth;
            return true;
        }
        return false;
    }
    public boolean setStatus(boolean status) {
        if (isValidStatus(status)) {
            this.status = status;
            return true;
        }
        return false;
    }

    // GETTERS
    public String getStudentName() {
        return studentName;
    }
    public String getStudentId() {
        return studentId;
    }
    public int getYearOfBirth() {
        return yearOfBirth;
    }
    public boolean getStatus() {
        return status;
    }
    public String getStatusWordly() {
        if (getStatus()) {
            return "ACTIVE";
        }
        return "INACTIVE";
    }

    // Required for the compromise between the elves and the orcs
    public boolean setName(String studentName) {
        return setStudentName(studentName);
    }
    public boolean setStudent_id(String studentId) {
        return setStudentId(studentId);
    }
    public String getName() {
        return getStudentName();
    }
    public String getStudent_id() {
        return getStudentId();
    }
    public boolean isActive() {
        return getStatus();
    }

    @Override
    public String toString() {
        return String.format("%s (%s) was born in %d is an %s student.",
                getStudentName(),
                getStudentId(),
                getYearOfBirth(),
                getStatusWordly());
    }

    // Validity tests
    private boolean isValidName(String studentName) {
        return false == "".equals(studentName);
    }
    private boolean isValidStudentId(String id) {
        return id.matches(STUDENT_ID_PATTERN);
    }
    private boolean isValidYearOfBirth(int yearOfBirth) {
        return yearOfBirth > 1989;
    }
    private boolean isValidStatus(boolean status) {
        return true;
    }

    // RegEx
    private static final String STUDENT_ID_PATTERN = "^5[6-9]061[0-2][0-9]{3}$";

    // Defaults
    private static final String DEFAULT_STUDENT_NAME = "John Doe";
    private static final String DEFAULT_STUDENT_ID = "560610000";
    private static final int DEFAULT_YEAR_OF_BIRTH = 1990;
    private static final boolean DEFAULT_STATUS = false;

    // Privates
    private String studentName;
    private String studentId;
    private int yearOfBirth;
    private boolean status;

}
