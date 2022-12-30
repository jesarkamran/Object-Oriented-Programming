public class Rectangle implements Shape
{
    private int length, width;
    Rectangle()
    {

    }
    Rectangle(int length, int width)
    {
        this.length = length;
        this.width = width;
    }
    public void setLength(int length) 
    {
        this.length = length;
    }
    public void setWidth(int width) 
    {
        this.width = width;
    }
    public int getLength() 
    {
        return length;
    }
    public int getWidth() 
    {
        return width;
    }

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return getLength()*getWidth();
    }

}
