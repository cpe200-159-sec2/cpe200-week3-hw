package cpe200;

public class Student {

    public Student()
    {
        setName("John Doe");
        setStudent_id("560610000");
        setYearOfBirth(1990);
        setStatus(false);
    }

    public Student(String N,String id)
    {
        this();
        setName(N);
        setStudent_id(id);
    }

    public Student(String N,String id,int yob)
    {
        this();
        setName(N);
        setStudent_id(id);
        setYearOfBirth(yob);
    }

    public Student(String N,String id,int yob,boolean s)
    {
        this();
        setName(N);
        setStudent_id(id);
        setYearOfBirth(yob);
        setStatus(s);
    }

    public void setName(String N)
    {
        if (!N.equals(""))
            Name = N;
    }

    public void setStudent_id(String id)
    {
        if (this.isValidStudent_id(id))
            Student_id = id;
    }

    public void setYearOfBirth(int yob)
    {
        if (isValidYOB(yob))
            Year_of_birth = yob;
    }

    public void setStatus(boolean s)
    {
        Status = s;
    }

    public String getName()
    {
        return Name;
    }

    public String getStudent_id()
    {
        return Student_id;
    }

    public int getYearOfBirth()
    {
        return Year_of_birth;
    }

    public boolean isActive()
    {
        return Status;
    }

    @Override
    public String toString()
    {
        String o;
        if(this.isActive())
            o = "ACTIVE";
        else
            o = "INACTIVE";
        return this.getName() + " (" + this.getStudent_id() + ") was born in " + this.getYearOfBirth() + " is an " + o + " student.";
    }

    private boolean isValidStudent_id(String id)
    {
        if(id.charAt(1) < '6' || id.charAt(1) > '9')
            return false;
        else if (id.charAt(5) < '0' || id.charAt(5) > '2')
            return false;
        else
        {
            for (short i = 6;i<9;i++)
                if (id.charAt(i) < '0' || id.charAt(i) > '9')
                {
                    return false;
                }
        }
        return true;
    }

    private boolean isValidYOB(int yob)
    {
        if (yob <= 1989)
            return false;
        return true;
    }

    String Name ,Student_id;
    int Year_of_birth;
    boolean Status;

}
