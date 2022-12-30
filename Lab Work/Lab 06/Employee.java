public class Employee extends APerson 
{
    protected String office;
    protected double salary;
    protected My_Date date;

    Employee()
    {
        super();
        date = new My_Date();
    }
    Employee(String a, String b, String c, String d, String e, double f, My_Date g)
    {
        super(a,b,c,d);
        if ((e!=null)&(f>0)&(g!=null)) 
        {
            office = e; salary = f; date = g;
        }
        else
        {
            System.out.println("Can't Initiallize Data with Invalid values");
        }
    }
    public void display()
    {
        System.out.println("Emoloyee Name: "+super.name);
        System.out.println("Employee Address: "+super.address);
        System.out.println("Employee Contact No: "+super.contactNUm);
        System.out.println("Employee Email: "+super.email);
        System.out.println("Office Name: "+office);
        System.out.println("Salary: "+salary);
        System.out.print("Date Of Hiring: ");
        date.display(); System.out.println();
    }
}
