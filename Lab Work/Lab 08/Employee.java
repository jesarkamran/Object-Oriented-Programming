public abstract class Employee 
{
    protected String firstName, lastName, sSN;
    Employee()
    {

    }
    Employee(String a, String b, String c)
    {
        if((a!=null)&(b!=null)&(c!=null))
        {
            firstName = a; lastName = b;
            sSN = c;
        }
        else
        {
            System.out.println("Can't Initialize Data with Inavlid Values");
        }
    }
    public  void display()
    {
        System.out.println("Employee Name: "+firstName+lastName);
        System.out.println("Employee SSN: "+sSN);
    }
    public abstract double earnings();
}
