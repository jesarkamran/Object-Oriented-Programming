public class RectRunner {
    public static void main(String[] args) {
        Rectangle obj1 = new Rectangle(2, 2);
        obj1.setlength(4);
        obj1.setwidth(4);
        obj1.display();
        System.out.println("Area of Rectangle: " + obj1.calculateAreaOfRectangle());
        System.out.println("Area is Square: "+obj1.checkSquare());

        Rectangle obj2 = new Rectangle(6, 2);
        obj2.setlength(7);
        obj2.setwidth(6);
        obj2.display();
        System.out.println("Area of Rectangle: " + obj2.calculateAreaOfRectangle());
        System.out.println("Area is Square: "+obj2.checkSquare());

        int len1 = obj1.getlength();
        int len2 = obj2.getwidth();
        if (len1>len2) {
            System.out.println("lenght1 is greater then length2");
        }
        else
        {
            System.out.println("lenght1 is greater then length2");
        }
    }
}
