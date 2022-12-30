public class AccRunner {
    public static void main(String[] args) {
        System.out.println("\nUsing Data of Accout Class form Object No: 1\n");
        Account obj1 = new Account();
        obj1.setBalance(8000);
        obj1.setCNIC("4430122488631");
        obj1.setYearOfOpening(2021);
        obj1.display();
        System.out.println("Amount afer withdraw: " +obj1.withdraw(3000));
        System.out.println("Amount afer deposit: " + obj1.deposit(500));
        System.out.println("Cnic is Valid: "+obj1.checkValidCNIC("4430122488631"));

        System.out.println("\nUsing Data of Accout Class form Object No: 2\n");
        Account obj2 = new Account(obj1);
        System.out.println("Displaying Object Status after using Copy Constructor");
        obj2.display();
        System.out.println("The 2 objects are Equal: "+ obj2.equals(obj1));
    }
}
