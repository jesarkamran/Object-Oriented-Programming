public class RunnerPayable 
{
    public static void main(String[] args) 
    {
        Payable[] p = new Payable[2];
        p[0] = new Invoice("123", "dfsaf", 10, 50);
        p[1] = new SalariedEmployee("Deepak", "Kumar", "DK-02", 10000);

        System.out.println("Payment Amount of Invoice is: "+ p[0].getPaymentAmount());
        System.out.println("Payment Amount of  is: "+ p[1].getPaymentAmount());
    }
}
