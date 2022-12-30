public class Computer 
{
    protected int wordSize, memorySize, storageSize, speed;
    Computer()
    {

    }
    Computer(int a, int b, int c, int d)
    {
        if ((a>0)&(b>0)&(c>0)&(d>0)) {
            wordSize = a; memorySize = b;
            storageSize = c; speed = d;
        }
        else
        {
            System.out.println("Can't Initialize Data Invalid Values");
        }
    }
}
