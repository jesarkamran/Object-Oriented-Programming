public class OverNightPackage extends Package
{
    private double shippingCharges, additionalCharges;
    
    OverNightPackage()
    {
        super();
    }
    OverNightPackage(String a, String b, String c, String d, double e, double f, double g, double h)
    {
        super(a,b,c,d,e,f);
        if ((g>0)&(h>0)) {
            shippingCharges = g; additionalCharges = h;
        }
    }
    public double getAdditionalCharges() 
    {
        return additionalCharges;
    }
    public void setAdditionalCharges(double additionalCharges) 
    {
        this.additionalCharges = additionalCharges;
    }
    
    
    public void setShippingCharges(double shippingCharges)
    {
        this.shippingCharges = shippingCharges;
    }
    public double getShippingCharges() 
    {
        return shippingCharges;
    }
    @Override
    public double calculateCost() 
    {
        // TODO Auto-generated method stub
        return (getShippingCharges()+getAdditionalCharges()+super.calculateCost());
    }
    @Override
    public void display() 
    {
        // TODO Auto-generated method stub
        System.out.println("\nSender Details");
        System.out.println("Sender Name: "+super.senderName);
        System.out.println("Sender Address: "+super.senderAddress);
        System.out.println("\nReciver Details");
        System.out.println("Recipient Name: "+super.recipientName);
        System.out.println("Recipient Address: "+super.recipientAddress);
        System.out.println("\nPackage Details");
        System.out.println("Pakage Weight: "+super.weight+" ounces");
        System.out.println("Charge's per Ounce: "+super.costPerOunce);
        System.out.println("Package Shipping Carges: "+getShippingCharges());
        System.out.println("Additional Charges for Over Night Shipment: "+getAdditionalCharges());
    }
}
