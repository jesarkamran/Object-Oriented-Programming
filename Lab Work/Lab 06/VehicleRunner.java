public class VehicleRunner {
    public static void main(String[] args) {
        System.out.println();
        Person p = new Person("Kamran Jesar", 21);
        Truck objTruck = new Truck("Deepak Kumar", 12, p, 100, 1);
        objTruck.display();
        System.out.println();
    }
}
