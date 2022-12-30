public class Person {
    private String firstName;
    private String LastName;
    private Address addObj;

    Person()
    {
        addObj = new Address();
    }

    Person(String a, String b, Address o1)
    {
        if ((a != null)&(b != null)&(o1 != null)) {
            firstName = a;
            LastName = b;
            addObj = o1;
        }
        else
        {
            System.out.println("Cant initialize data with invalid values");
        }
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setLastName(String lastName) {
        LastName = lastName;
    }
    public String getLastName() {
        return LastName;
    }
    public void setAddObj(Address addObj) {
        this.addObj = addObj;
    }
    public Address getAddObj() {
        return addObj;
    }
    public void display()
    {
        System.out.println("Person's First Name: "+firstName);
        System.out.println("Person's Last Name: "+LastName);
        addObj.display();
    }
    public void display2()
    {
        System.out.println("Person's First Name: "+firstName);
        System.out.println("Person's Last Name: "+LastName);
        System.out.println("House Name: "+addObj.getHome());
        System.out.println("Street No: "+addObj.getStreet());
        System.out.println("City Name: "+addObj.getCity());
    }
    public boolean check()
    {
        if (addObj.getCity().equals( "Islamabad")) {
            return true;
        }
        return false;
    }
}
