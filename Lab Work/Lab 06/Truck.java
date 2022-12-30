public class Truck extends Vehicle
{
    private double loadCapacity;
    private int towingCapacity;
    Truck()
    {
        super();
    }
    Truck(String a, int b, Person c, double d, int e)
    {
        super(a, b, c);
        if ((d>0)&(e>0)) {
            loadCapacity = d; towingCapacity = e;
        }
    }
    public void display()
    {
        super.display();
        System.out.println("Load Capacity of Truck: "+getLoadCapacity());
        System.out.println("Towing Capacity of Truck: "+getTowingCapacity());
    }public double getLoadCapacity() {
        return loadCapacity;
    }
    public int getTowingCapacity() {
        return towingCapacity;
    }

}
