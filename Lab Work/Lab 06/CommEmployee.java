public class CommEmployee
{
    protected String fname, lname;
    protected int glassSales; protected double commRates;
    CommEmployee(){}
    CommEmployee(String a, String b, int c, double d)
    {
        if((a!=null)&(b != null)&(c >0)&(d>0))
        {
            fname = a; lname = b;  glassSales = c; commRates = d;
        }
        else
        {
            System.out.println("Can't Initialize data with invalid types");
        }
    }
    public void display()
    {
        System.out.println("Employee Name: "+fname+" "+lname);
        System.out.println("Number of glass sold: "+glassSales);
        System.out.println("Commission Rate: "+commRates+"%");
    }
}
