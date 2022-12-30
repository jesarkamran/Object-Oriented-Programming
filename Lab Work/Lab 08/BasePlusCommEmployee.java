public class BasePlusCommEmployee extends CommissionEmployee
{
    private double basicSalary;
    BasePlusCommEmployee()
    {
        super();
    }
    BasePlusCommEmployee(String a, String b, String c, int d, double e, double f)
    {
        super(a,b,c,d,e);
        if (f>0) 
        {
            basicSalary = f;
        }
        else
        {
            System.out.println("Can't Initialize Data with Inavlid Values");
        }
    }

    public void setBasicSalary(double basicSalary) 
    {
        this.basicSalary = basicSalary;
    }
    public double getBasicSalary() {
        return basicSalary;
    }

    public void display()
    {
        System.out.println("Base plus Commission Employee Name: "+super.firstName+" "+super.lastName);
        System.out.println("Base plus Comission Employee SSN: "+super.sSN);
        System.out.println("Gross Sales: "+super.getSales());
        System.out.println("Commission Rate: "+ super.getCommRate());
        System.out.println("Basic Salary of Employee: "+getBasicSalary());
    }
    @Override
    public double earnings() 
    {
        return basicSalary;
    }

}
