public class PackageRunner 
{
    public static void main(String[] args) 
    {
        Package[] p = new Package[2];
        p[0] = new TwoDayPackage("Kamran Jesar", "Islamabad", "Imran Jesar", "Karachi", 5.6, 10, 100);
        p[1] = new OverNightPackage("Hemant Kumar", "Chelhar", "Sartaj", "Mithi", 5.6, 5, 100, 50);

        for (int i = 0; i < p.length; i++) {
            p[i].display();
         System.out.println("Total Cost of Shipping: \t"+p[i].calculateCost());
            
        }
    }
}
