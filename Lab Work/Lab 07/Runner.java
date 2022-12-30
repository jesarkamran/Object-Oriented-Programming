public class Runner 
{
    public static void main(String[] args)
    {
        Document d = new Document("Kamran Jesar");
        Email e = new Email("Kamran Jesar", "Deepak", "Anyone", "Anything");
        File f = new File("Kamran Jesar", "adasfd");

        System.out.println("\nDisplay of Email Class");
        e.display();
        System.out.println("\nDisplay of File Class");
        f.display();

        System.out.println("\nText Data of Document"+d.toString()+"\n");
        System.out.println("\nText Data of Email"+e.toString()+"\n");
        System.out.println("\nText Data of File"+f.toString()+"\n");
    }
}
