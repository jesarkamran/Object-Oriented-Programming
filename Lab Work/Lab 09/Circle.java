public class Circle implements Shape
{
    private int radius;
    private final double PI = 3.1416;
    Circle()
    {

    }
    Circle(int radius)
    {
        this.radius = radius;
    }
    public void setRadius(int radius) 
    {
        this.radius = radius;
    }
    public double getRadius() 
    {
        return radius;
    }
    public double getPI() 
    {
        return PI;
    }
    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return getPI()*getRadius()*getRadius();
    }
}