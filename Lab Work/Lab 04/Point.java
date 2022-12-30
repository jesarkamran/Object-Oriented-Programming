public class Point {
    private int x, y;
    Point()
    {

    }
    Point(int a)
    {
        if (a>0) {
            x = a;
        }
        else
        {
            System.out.println("Can't initialize with negative value");
        }
    }
    Point(int a, int b)
    {
        if ((a>0)&(b>0)) {
            x = a; y = b;
        }
        else
        {
            System.out.println("Can't initialize with negative value");
        }
    }
    Point(Point obj)
    {
        if ((obj.x >=0)&(obj.y>=0)) {
            this.x = obj.x; this.y = obj.y;
        }
        else
        {
            System.out.println("Can't initialize with negative value");
        }
    }
    public void setx(int a)
    {
        if (a>0) {
            x = a;
        }
        else
        {
            System.out.println("Can't initialize with negative value");
        }
    }
    public void sety(int a)
    {
        if (a>0) {
            y = a;
        }
        else
        {
            System.out.println("Can't initialize with negative value");
        }
    }
    public int getx()
    {
        return x;
    }
    public int gety()
    {
        return y;
    }
    public void display()
    {
        System.out.println("Point x: "+x);
        System.out.println("Point y: "+y);
    }
    public void move(int a, int b)
    {
        System.out.println("Point x is moved from "+ x+"cm to " +a);
        System.out.println("Point y is moved from "+ y+"cm to " +b);
        x = a; y = b;
    }
    public boolean checkOrigin()
    {
        if ((x == 0)&(y == 0)) {
            return true;
        }
        return false;
    }
    public int addTwoPoints(Point obj)
    {
        return obj.x+obj.y;
    }
    public int addThreePoints(Point obj, int a)
    {
        return addTwoPoints(obj) +a;
    }
}
