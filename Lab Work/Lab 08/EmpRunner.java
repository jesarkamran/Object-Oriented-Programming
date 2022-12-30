public class EmpRunner 
{
    public static void main(String[] args) 
    {
        Employee[] e = new Employee[4];
        e[0] = new WeeklyEmployee("Tony", "Stark", "S-01", 4000);
        e[1] = new HourlyEmployee("Thor", "Odin Son", "S-02", 4, 500);
        e[2] = new CommissionEmployee("Captain", "America", "S-03", 60, 10.50);
        e[3] = new BasePlusCommEmployee("Doctor", "Strange", "S-04", 100, 30, 6000);
        
        for (int i = 0; i < e.length; i++) {
            System.out.println();
            if(e[i] instanceof BasePlusCommEmployee)
            {
                BasePlusCommEmployee emp = (BasePlusCommEmployee)e[i];
                emp.setBasicSalary(1.10*emp.getBasicSalary());
                System.out.println("New base salary with 10%% increase is: "+emp.getBasicSalary());
                e[i] = emp;
            }
            e[i].display();
            System.out.println("Total Earning of Employee: "+e[i].earnings());
        }
    }
}
