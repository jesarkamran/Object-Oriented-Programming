public class PizzaRunner {
    public static void main(String[] args) {
        Pizza p1 = new Pizza("Small", 5, 3,3);
        Pizza p2 = new Pizza("Large", 8, 6,3);

        System.out.println("\nDisplaying Pizza 1 Description\n"+p1.getdescription()+"\n");

        System.out.println("\nDisplaying Pizza 2 Description\n"+p2.getdescription()+"\n");

        PizzaOrder po1 = new PizzaOrder(p1,p2);
        System.out.println("\nTotal Cost of Order is: "+po1.calTotal());
    }
}
