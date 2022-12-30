public class Invoice implements Payable
{
    private String partNumber, partDescription;
    private int quantity; private double pricePerItem;
    
    Invoice()
    {

    }
    Invoice(String a, String b, int c, double d)
    {
        partNumber = a; partDescription = b;
        quantity = c; pricePerItem = d;
    }

    //SETTERS
    public void setPartDescription(String partDescription) 
    {
        this.partDescription = partDescription;
    }
    public void setPartNumber(String partNumber) 
    {
        this.partNumber = partNumber;
    }
    public void setPricePerItem(double pricePerItem) 
    {
        this.pricePerItem = pricePerItem;
    }
    public void setQuantity(int quantity) 
    {
        this.quantity = quantity;
    }

    //GETTERS
    public String getPartDescription() 
    {
        return partDescription;
    }
    public String getPartNumber() 
    {
        return partNumber;
    }
    public int getQuantity() 
    {
        return quantity;
    }
    public double getPricePerItem() 
    {
        return pricePerItem;
    }


    @Override
    public double getPaymentAmount() 
    {
        // TODO Auto-generated method stub
        return getPricePerItem()*getQuantity();
    }
}
