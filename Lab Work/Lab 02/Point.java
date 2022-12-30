public class Point {
    int x, y;
    Point()
    {
        int a, b;
    }
    Point(int a, int b)
    {
        if ((a>0)&&(b>0)) {
            x = a; y = b;
        }
        else
        {
            System.out.println("Can't initialize with negative values");
        }
    }
    public void setx(int a)
    {
        if ((a>0)) {
            x = a;
        }
        else
        {
            System.out.println("Can't initialize with negative values");
        }
    }
    public void sety(int a)
    {
        if ((a>0)) {
             y= a;
        }
        else
        {
            System.out.println("Can't initialize with negative values");
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
        System.out.println("Value of x is: " + x);
        System.out.println("Value of y is: " + y);

    }
    public void move(int a, int b)
    {
        if ((a>=0)&&(b>=0)) {
            x = a; y = b;
            System.out.println("Point x moved: " + x+ " cm");
            System.out.println("Point y moved: " + y+ " cm");
        }
    }
    public boolean checkOrigin() {
        if ((x == 0)&(y == 0)) {
            return true;
        }
        return false;
    }
}
