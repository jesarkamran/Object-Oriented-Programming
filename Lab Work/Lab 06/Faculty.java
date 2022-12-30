public class Faculty extends Employee
{
    private double officeHours;
    private int rank;
    Faculty()
    {
        super();
    }
    Faculty(String a, String b, String c, String d, String e, double f, My_Date g, double h, int i)
    {
        super(a,b,c,d,e,f,g);
        if ((h>0)&(i>0)) {
            officeHours = h; rank = i;
        }
        else
        {
            System.out.println("Can't  Initiallize Data with Invalid Values");
        }
    }
    public void setOfficeHours(double officeHours) 
    {
        if (officeHours>0) 
        {
            this.officeHours = officeHours;
        }
        else
        {
            System.out.println("Can't  Initiallize Data with Invalid Values");
        }
    }
    public void setRank(int rank) 
    {
        if (rank>0) 
        {
            this.rank = rank;
        }
        else
        {
            System.out.println("Can't  Initiallize Data with Invalid Values");
        }
    }
    public double getOfficeHours() 
    {
        return officeHours;
    }
    public int getRank() 
    {
        return rank;
    }
    public void display()
    {
        super.display();
        System.out.println("Faculty Office Hours: "+getOfficeHours());
        System.out.println("Employee Rank: "+getRank());
    }
    public void display2()
    {
        System.out.println("Emoloyee Name: "+super.name);
        System.out.println("Employee Address: "+super.address);
        System.out.println("Employee Contact No: "+super.contactNUm);
        System.out.println("Employee Email: "+super.email);
        System.out.println("Office Name: "+super.office);
        System.out.println("Salary: "+super.salary);
        System.out.print("Date Of Hiring: ");
        super.date.display(); System.out.println();
        System.out.println("Faculty Office Hours: "+getOfficeHours());
        System.out.println("Employee Rank: "+getRank());
    }
}
