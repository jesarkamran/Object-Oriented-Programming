public class Runner
{
    public static void main(String[] args) {
        
        Account obj = new Account(4000);
        obj.setValue(5000, 2002, "4430122488631");
        obj.display();
        System.out.println("Amount after withdraw: " +obj.withdraw(2500));
        System.out.println("Amount after deposit: " +obj.deposit(500));
        System.out.println("Years Passed : " +obj.calculateAgeOFAcc());

        Account obj2 = new Account(4000, 2009, "4430122488631");
        obj2.display();
        System.out.println("Amount after withdraw: " +obj2.withdraw(2500));
        System.out.println("Amount after deposit: " +obj2.deposit(500));
        System.out.println("Years Passed : " +obj2.calculateAgeOFAcc());
    }
}