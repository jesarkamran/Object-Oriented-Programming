public class Publication {
    protected String title;
    protected double priceOfPublications;
    Publication()
    {

    }
    Publication(String a, Double b)
    {
        if((a!=null)&(b >0))    
        {
            title = a; priceOfPublications = b;
        }
        else
        {
            System.out.println("Can't Initialize data with invalid vlues");
        }
    }
    public void display()
    {
        System.out.println("Title of Book: "+ title);   
        System.out.println("Price of Publication: "+ priceOfPublications);   
    }

}
