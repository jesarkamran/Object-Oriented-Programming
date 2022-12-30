public class Rectangle {
    private int length, width;
    Rectangle(int a, int b)
    {
        if ((a>0)&&(b>0)) {
            length = a; width = b;
        }
        else
        {
            System.out.println("Can't initialize with negative values");
        }
    }
    public void setlength(int a)
    {
        if (a>0) {
            length = a;
        }
        else
        {
            System.out.println("Can't initialize with negative values");
        }
    }

    public void setwidth(int a)
    {
        if (a>0) {
            width = a;
        }
        else
        {
            System.out.println("Can't initialize with negative values");
        }
    }
    public int getlength()
    {
        return length;
    }
    public int getwidth()
    {
        return width;
    }
    
    public void display()
    {
        System.out.println("Length of Rectangle is: " + length);
        System.out.println("Width of Rectangle is: " + width);

    }
    public int calculateAreaOfRectangle()
    {
        return width*length;
    }
    public boolean checkSquare()
    {
        if(width == length)
        {
            return true;
        }
        return false;
    }
}
