public class BasePlusCommEmplyee extends CommEmployee
{
    private double baseSalary;
    BasePlusCommEmplyee(){
        super();
    }
    BasePlusCommEmplyee(String a, String b, int c, double d, double e)
    {
        super(a, b,c,d);
        if (e>0) 
        {
            baseSalary = e;    
        }
        else
        {
            System.out.println("Can't Initialize with invalid type");
        }
    }
    public void display() 
    {
        super.display();
        System.out.println("Base Salary: "+baseSalary);
    }
}