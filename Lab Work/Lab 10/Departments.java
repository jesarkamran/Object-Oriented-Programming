import java.io.Serializable;
public class Departments implements Serializable
{
    private String name, location;

    Departments(){}
    Departments(String a, String b)
    {
        if (a!=null&&b!=null) 
        {
            name = a; location = b;
        }
        else
        {
            System.out.println("Can't initialize the data members with invalid values");
        }
    }

    //setters
    public void setLocation(String location) 
    {
        this.location = location;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    //getters
    public String getLocation() 
    {
        return location;
    }
    public String getName() 
    {
        return name;
    }
}
