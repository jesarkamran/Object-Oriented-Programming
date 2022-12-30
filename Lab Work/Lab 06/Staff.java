public class Staff extends Employee
{
    private String title;
    Staff()
    {
        super();
    }
    Staff(String a, String b, String c, String d, String e, double f, My_Date g, String h)
    {
        super(a,b,c,d,e,f,g);
        if (h!=null) 
        {
            title = h;
        }
        else
        {
            System.out.println("Can't Initiallize with invalid Values");
        }
    }
    public void setTitle(String title) 
    {
        if (title != null) 
        { 
            this.title = title;
        }
        else
        {
            System.out.println("Can't Initiallize with Invalid Values");
        }
    }
    public String getTitle() 
    {
        return title;
    }
    public void display()
    {
        super.display();
        System.out.println("Title of Employee: "+getTitle());
    }
}
