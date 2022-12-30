public class Vehicle {
    protected String manufacturerName;
    protected int numOfEngineCylinders;
    protected Person owner;
    Vehicle()
    {
        owner = new Person();
    }
    Vehicle(String a, int b, Person c)
    {
        if ((a!= null)&(b>0)&(c!=null)) 
        {
            manufacturerName = a; numOfEngineCylinders = b;
            owner = c;
        }
        else
        {
            System.out.println("Can't Initialize data with invalid vlues");
        }
    }
    public void display()
    {
        System.out.println("Manufacturer Name: "+manufacturerName);
        System.out.println("Number of Cylinders in Engine: "+numOfEngineCylinders);
        System.out.println("Owner Name: "+owner.getName());
        System.out.println("Owner Age: "+owner.getAge());
    }
}
