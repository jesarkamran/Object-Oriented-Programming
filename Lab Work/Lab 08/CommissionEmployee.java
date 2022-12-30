public class CommissionEmployee extends Employee
{
    private int sales; private double commRate;
    
    CommissionEmployee()
    {
        super();
    }

    CommissionEmployee(String a, String b, String c, int d, double e)
    {
        super(a,b,c);
        if ((d>0)&(e>0)) 
        {
            sales = d;
            commRate = e;
        }
        else
        {
            System.out.println("Can't Initialize Data with Inavlid Values");
        }
    }
    
    public void setCommRate(double commRate) 
    {
        this.commRate = commRate;
    }
    public void setSales(int sales) 
    {
        this.sales = sales;
    }
    public double getCommRate() 
    {
        return commRate;
    }
    public int getSales() 
    {
        return sales;
    }
    public void display()
    {
        System.out.println("Commission Employee Name: "+super.firstName+" "+super.lastName);
        System.out.println("Comission Employee SSN: "+super.sSN);
        System.out.println("Number of Product Sold: "+getSales());
        System.out.println("Comission Rate: "+getCommRate());
    }
    @Override
    public double earnings() 
    {
        return getCommRate()*getSales();
    }
}
