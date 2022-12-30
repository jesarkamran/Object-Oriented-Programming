public class Book
{
    private String pulisher;
    private String bookName;
    private Person perObj;
    Book()
    {

    }
    Book(String a, String b, Person p)
    {
        pulisher = a;
        bookName = b;
        perObj = p;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public void setPerObj(Person perObj) {
        this.perObj = perObj;
    }
    public void setPulisher(String pulisher) {
        this.pulisher = pulisher;
    }
    
    public String getBookName() {
        return bookName;
    }
    public Person getPerObj() {
        return perObj;
    }
    public String getPulisher() {
        return pulisher;
    }
    
    public void display()
    {
        System.out.println("Publisher Name: "+ pulisher);
        System.out.println("Book Name: "+bookName);
        perObj.display();
    }
    public void display2()
    {
        System.out.println("Publisher Name: "+ pulisher);
        System.out.println("Book Name: "+bookName);
        System.out.println("Person's First Name: "+perObj.getFirstName());
        System.out.println("Person's Last Name: "+perObj.getLastName());
        System.out.println("House Name: "+perObj.getAddObj().getHome());
        System.out.println("Street No: "+perObj.getAddObj().getStreet());
        System.out.println("City Name: "+perObj.getAddObj().getCity());
    }
    public boolean stCheck()
    {
        if (perObj.getAddObj().getStreet() < 10) {
            return true;
        }
        return false;
    }
}