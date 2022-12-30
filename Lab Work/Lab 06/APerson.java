public class APerson 
{
    protected String name, address, contactNUm, email;
    APerson()
    {

    }
    APerson(String a, String b, String c, String d)
    {
        if((a!=null)&(b!=null)&(c!=null)&(d!=null))
        {
            name = a; address = b; contactNUm = c; email = d;
        }
        else
        {
            System.out.println("Can't Initialize Values with inavlid Values");
        }
    }
    public void display()
    {
        System.out.println("Person Name: "+name);
        System.out.println("Person Address: "+address);
        System.out.println("Preson Contact No: "+contactNUm);
        System.out.println("Preson Email: "+email);
    }
}
