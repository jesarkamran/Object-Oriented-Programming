public abstract class Package 
{
    protected String senderName, senderAddress, recipientName, recipientAddress;
    protected double costPerOunce, weight;
    Package()
    {

    }
    Package(String a, String b, String c, String d, double e, double f)
    {
        if ((a!=null)&(b!=null)&(c!=null)&(d!=null)&(e>0)&(f>0)) 
        {
            senderName = a; senderAddress = b;
            recipientName = c; recipientAddress = d;
            costPerOunce = e; weight = f;
        }
    }

    public  double calculateCost()
    {
        return weight*costPerOunce;
    }

    public abstract void display();
}
