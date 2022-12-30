public class Tape extends Publication{
    private double playingTime;
    Tape()
    {
        super();
    }
    Tape(String a, double b, double c)
    {
        super(a,b);
        if (c>0) {
            playingTime = c;
        }
        else
        {
            System.out.println("Can't Initialize data with invalid vlues");
        }
        
    }
    public void display()
    {
        super.display();
        System.out.println("Playing Time: "+playingTime+" mins");
    }

}
