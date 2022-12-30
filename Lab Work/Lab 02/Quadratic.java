public class Quadratic {
    int a, b, c;
    Quadratic(int x, int y, int z)
    {
        if((a>0)&& (b>0) && (c>0))
        {
            a = x; b = y; c = z;
        }
        else
        {
            System.out.println("Enter positive Values");
        }
    }

    public void setValue(int x, int y, int z)
    {
        if((x>0)&& (y>0) && (z>0))
        {
            a = x; b = y; c = z;
        }
        else
        {
            System.out.println("Enter positive Values");
        }
    }
    public void display()
    {
        System.out.println("Value of a: "+a);
        System.out.println("Value of b: "+b);
        System.out.println("Value of c: "+c);
    }

    public double getDiscriminant()
    {
        return (b*b) + (4*a*c);
    }
    public boolean checkIfDescriminantIsGretaerThan100()
    {
        if (getDiscriminant() > 100) {
            return true;
        }
        return false;
    }
}
