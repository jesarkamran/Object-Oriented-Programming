public class Laptop extends Computer
{
    private double length, width, hieght, weight;
    
    Laptop()
    {
        super();
    }
    Laptop(int a, int b, int c, int d, double e,double f,double g,double h)
    {
        super(a,b,c,d);
        if ((e>0)&(f>0)&(g>0)&(h>0)) {
            length = e; width = f;
            hieght = g; weight = h;
        }
        else
        {
            System.out.println("Can't Initialize Data Invalid Values");
        }
    }

    //Setters
    public void setHieght(double hieght) 
    {
        this.hieght = hieght;
    }
    public void setLength(double length) 
    {
        this.length = length;
    }
    public void setWeight(double weight) 
    {
        this.weight = weight;
    }
    public void setWidth(double width) 
    {
        this.width = width;
    }

    //Getters
    public double getHieght()
    {
        return hieght;
    }
    public double getLength() 
    {
        return length;
    }
    public double getWeight() 
    {
        return weight;
    }
    public double getWidth() 
    {
        return width;
    }
    
    public void display()
    {
        System.out.println("\nLaptop Word Size: "+super.wordSize +" bits");
        System.out.println("Laptop Memory Size: "+super.memorySize +" megabytes");
        System.out.println("Laptop Storage Size: "+super.storageSize +" megabytes");
        System.out.println("Laptop Speed: "+super.speed +" megahertz");
        System.out.println("Laptop Screen Lenth: "+getLength()+ " inches");
        System.out.println("Laptop Screen Width: "+getWidth()+ " inches");
        System.out.println("Laptop Screen Hiegth: "+getHieght()+ " inches");
        System.out.println("Laptop  Weight: "+getWeight()+" grams\n");
    }
}
