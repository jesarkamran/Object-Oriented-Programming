public class Book extends Publication{
    private int pageCount;
    Book()
    {
        super();
    }
    Book(String a,  double b, int c)
    {
        super(a,b);
        if (c>0) {
            pageCount = c;
        }
        else
        {
            System.out.println("Can't Initialize data with invalid vlues");
        }
    }
    public void display()
    {
        super.display();
        System.out.println("Number of Pages: "+pageCount);
    }
}
