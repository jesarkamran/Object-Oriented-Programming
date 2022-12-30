public class WeeklyEmployee extends Employee
{
    private double weeklySalary;

    WeeklyEmployee()
    {
        super();
    }
    WeeklyEmployee(String a, String b, String c, double d)
    {
        super(a,b,c);
        if(d>0)
        {
            weeklySalary = d;
        }
        else
        {
            System.out.println("Can't Initialize Data with Inavlid Values");
        }
    }
    @Override
    public double earnings()
    {
        
        return weeklySalary;
    }
    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }
    public void display()
    {
        System.out.println("Weekly Employee Name: "+super.firstName+" "+super.lastName);
        System.out.println("Weekly Employee SSN: "+super.sSN);
        System.out.println("Weekly Salary of Employee: "+earnings());
    }
}
