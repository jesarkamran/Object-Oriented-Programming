import java.io.Serializable;
public class Person implements Serializable
{
    private String name, phone, gender;
    private Departments dept;

    Person(){}
    Person(String a, String b, String c, Departments d)
    {
        if (a!=null&&b!=null&&c!=null&&d!=null) 
        {
            name = a; phone = b; gender = c;
            dept = d;
        }
        else
        {
            System.out.println("Can't initialize the data members with invalid values");
        }
    }

    //setters
    public void setName(String name) 
    {
        this.name = name;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }
    public void setGender(String gender) 
    {
        this.gender = gender;
    }
    public void setDept(Departments dept) 
    {
        this.dept = dept;
    }

    //getters
    public String getName() 
    {
        return name;
    }
    public String getPhone() 
    {
        return phone;
    }
    public String getGender() 
    {
        return gender;
    }
    public Departments getDept() 
    {
        return dept;
    }
}