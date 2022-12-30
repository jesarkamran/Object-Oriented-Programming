import java.io.Serializable;
public class Student extends Person implements Serializable
{
    private double gpa;
    private int semester;
    private String section;

    Student(){super();}
    Student(String a, String b, String c, Departments d, double e, int f, String g)
    {
        super(a,b,c,d);
        if (e>0&&f>0&&g!=null) 
        {
            gpa = e; semester = f; section = g;
        }
        else
        {
            System.out.println("Can't initialize the data members with invalid values");
        }
    }

    //setters
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public void setSemester(int semester) {
        this.semester = semester;
    }
    public void setSection(String section) {
        this.section = section;
    }


    //getters
    public double getGpa() {
        return gpa;
    }
    public int getSemester() {
        return semester;
    }
    public String getSection() {
        return section;
    }

    @Override
    public String toString() {
        
        return ("{Name: "+getName() +
        ", Gender: "+getGender()+
        ", Phone: "+getPhone()+
        ", Gpa: "+getGpa()+
        ", Semester and Section: "+getSemester()+"-"+getSection()+"}"+
        "\n{Dpartment: "+getDept().getName()+
        ", Location: "+getDept().getLocation()+"}\n");
    }
}
