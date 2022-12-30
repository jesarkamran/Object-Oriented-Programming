public class PRunner {
    public static void main(String[] args) {
        Point obj1 = new Point(4,5);
        obj1.setx(6);
        obj1.sety(7);
        obj1.display();
        obj1.move(10, 20);
        System.out.println("Points at origin: "+obj1.checkOrigin());

        Point obj = new Point();
        obj.a = obj1.gety();
        
        // Point obj2 = new Point(4,5);
        // obj1.setx(7);
        // obj1.sety(7);
        // obj2.display();
        // obj2.move(0, 0);
        // System.out.println("Points at origin: "+obj2.checkOrigin());
    }
}
