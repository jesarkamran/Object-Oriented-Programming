public class SalariedEmployee extends Employee
{
    private double weeklySalary;

    SalariedEmployee()
    {
        super();
    }
    SalariedEmployee(String a, String b, String c, double d)
    {
        super(a,b,c);
        weeklySalary = d;
    }

    //Setter
    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    public String getFirstName() {
        // TODO Auto-generated method stub
        return super.getFirstName();
    }

    @Override
    public String getLastName() {
        // TODO Auto-generated method stub
        return super.getLastName();
    }
    @Override
    public String getSocialSecuritNumber() {
        // TODO Auto-generated method stub
        return super.getSocialSecuritNumber();
    }

    @Override
    public double getPaymentAmount() {
        // TODO Auto-generated method stub
        return weeklySalary;
    }
}
