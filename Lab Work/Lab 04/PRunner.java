
public class PRunner {
    public static void main(String[] args) {
        System.out.println("\nUsing Data of Point Class using Object No: 1\n");
        Point obj1 = new Point();
        obj1.setx(10);
        obj1.sety(10);
        obj1.display();
        obj1.move(6, 8);
        obj1.checkOrigin();

        System.out.println("Copying Data of Constructor\n");
        Point obj2 = new Point(obj1);
        obj2.display();

        System.out.println("Value after adding two Points: " +obj2.addTwoPoints(obj1));
        System.out.println("Value after adding three Points: " +obj2.addThreePoints(obj1, 9));
    }
}
