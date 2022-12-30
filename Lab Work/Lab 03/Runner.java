public class Runner {
    public static void main(String[] args) {
        
        //DATA Which Will display in First Phase
        String[] s = {"Apple", "Banana", "Orange", "Grape"};
        double[] d = {10, 20, 30, 40}; int[] i = {5, 8, 3, 4};
        TuckShop obj1 = new TuckShop();
        obj1.owner = "Kamran";
        System.out.println(obj1.owner);
        TuckShop obj2 = new TuckShop("Kamran", s,d,i);
        System.out.println("\nDISPLAY OF DATA\n");
        obj2.display();
        System.out.println("\nTotal Price: "+obj2.totalPrice());
        System.out.println("Item with minimum Quantity: "+obj2.itemWithMinQuantity());
        System.out.println("Item with minimum Price: "+obj2.itemWithMinPrice());
       
        /*DATA Which Will display in 2ND Phase
        Where New Food Item Will be Added
        */
       
       
        obj2.setFoodItem("Mango");
        obj2.setPrice(15);
        obj2.setQuantity(10);
        System.out.println("\nDISPLAY OF DATA AFTER ADDING NEW FOOD ITEM\n");
        obj2.display();
        System.out.println("\nTotal Price: "+obj2.totalPrice());
        System.out.println("Item with minimum Quantity: "+obj2.itemWithMinQuantity());
        System.out.println("Item with minimum Price: "+obj2.itemWithMinPrice());
       
       
        /*DATA Which Will display in 3rd Phase
        Where  Food Item Will be remove
        */
        
        obj2.buy();
        System.out.println("\nDISPLAY OF DATA AFTER BUYING\n");
        obj2.display();
        System.out.println("\nTotal Price: "+obj2.totalPrice());
        System.out.println("Item with minimum Quantity: "+obj2.itemWithMinQuantity());
        System.out.println("Item with minimum Price: "+obj2.itemWithMinPrice());
    }
}
