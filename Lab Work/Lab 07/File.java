public class File extends Document
{
    private String pathname;
    File()
    {
        super();
    }
    File(String a, String b)
    {
        super(a);
        if (b!=null) 
        {
            pathname = b;
        }
        else
        {
            System.out.println("Can't Initialize data with invalid values");
        }
    }
    public void setPathname(String pathname)
    {
        this.pathname = pathname;
    }
    public String getPathname() 
    {
        return pathname;
    }
    public void display()
    {
        System.out.println("Path Name: "+getPathname());
    }
    @Override
    public void setText(String text) 
    {
        super.setText(text);;
    }
    @Override
    public String toString() 
    {
        return text + pathname;
    }
}
