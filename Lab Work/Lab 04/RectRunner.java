public class RectRunner {
    public static void main(String[] args) {
        System.out.println("Running Rectangle Class Data throung Object No: 1\n");
        Rectangle obj1 = new Rectangle();
        obj1.setLength(9);
        obj1.setwidth(9);
        obj1.display();
        System.out.println("Area of Rectangle is: "+obj1.calculateArea());
        System.out.println("Area of Rectangle is Square: "+obj1.checkSquare());
    
        System.out.println("\nRunning Rectangle Class Data throung Object No: 2\n");
        Rectangle obj2 = new Rectangle(10, 10);
        obj2.display();
        System.out.println("Area of Rectangle is: "+obj2.calculateArea());
        System.out.println("Area of Rectangle is Square: "+obj2.checkSquare());

        System.out.println("\nRunning Rectangle Class Data throung Object No: 3\n");
        Rectangle obj = new Rectangle(10);
        Rectangle obj3 = obj;
        obj3.display();
        System.out.println("Area of Rectangle is: "+obj3.calculateArea());
        System.out.println("Area of Rectangle is Square: "+obj3.checkSquare());
        System.out.println("Object with greater value is: " + obj3.compareArea(obj2).calculateArea());

        System.out.println("\nRunning Rectangle Class Data by using Copy Constructor\n");
        Rectangle obj4 = new Rectangle(obj1);
        
        System.out.println("Showing data of two objects before using equals Method: ");
        obj4.display();
        System.out.println();
        obj.display();

        System.out.println("Two Objests are Equal: "+ obj4.equals(obj));
        
    }
}
