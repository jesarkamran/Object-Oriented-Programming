public class Point 
{
    private int x, y;
    Point()
    {

    }
    Point(int a, int b)
    {
        x = a; y = b;
    }

    //Setters
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }

    //Getters
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public void move(int a, int b)
    {
        System.out.println("Point x is moved from "+x+" to "+a);
        System.out.println("Point x is moved from "+y+" to "+b);
        x = a;  y = b;
    }
}
