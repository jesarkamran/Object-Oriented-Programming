public class ShapeRunner 
{
    public static void main(String[] args) 
    {
        Circle c = new Circle(8);
        Rectangle r = new Rectangle(10, 5);
        System.out.println("Area of Circle is: "+c.getArea());
        System.out.println("Area of Rectangle is: "+r.getArea());
    }
}
