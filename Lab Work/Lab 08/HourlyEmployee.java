public class HourlyEmployee extends Employee
{
    private double hours, wagePerHour;
    HourlyEmployee()
    {
        super();
    }
    HourlyEmployee(String a, String b, String c, double d, double e)
    {
        super(a,b,c);
        if ((d>0)&(e>0)) 
        {
            hours = d;
            wagePerHour = e;
        }
        else
        {
            System.out.println("Can't Initialize Data with Inavlid Values");
        }
    }

    public void setHours(double hours) 
    {
        this.hours = hours;
    }
    public void setWagePerHour(double wagePerHour) 
    {
        this.wagePerHour = wagePerHour;
    }
    public double getHours() 
    {
        return hours;
    }
    public double getWagePerHour() 
    {
        return wagePerHour;
    }
    public void display()
    {
        System.out.println("Hourly Employee Name: "+super.firstName+" "+super.lastName);
        System.out.println("Hourly Employee SSN: "+super.sSN);
        System.out.println("Hours : "+getHours());
        System.out.println("Wage per Hour: "+getWagePerHour());
    }
    @Override
    public double earnings() {
        if (getHours()<=40) {
            return getWagePerHour()*getHours();
        }
        else
        {
            return (40*getWagePerHour()+(hours-40)*getWagePerHour()*1.5);
        }
    }
}
