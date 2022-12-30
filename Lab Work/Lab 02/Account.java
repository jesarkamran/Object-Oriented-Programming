public class Account {
    int balance, yearOFOpening; String cnic;
    Account()
    {
        System.out.println("Default Constructor");
    }

    Account(int b)
    {
        System.out.println("Balance initialized by using one Arg Constructor");
        if (b>0)
        {
            balance = b;
        }
    }
    Account(int a, int b, String c)
    {
        if ((a>0) && (b>0) && (c.length() == 13)) {
            balance = a; yearOFOpening = b; cnic = c;
        }
    }
    public void setValue(int a, int b, String c)
    {
        if ((a>0) && (b>0) && (c.length() == 13)) {
            balance = a; yearOFOpening = b; cnic = c;
        }
    }
    public void display()
    {
        System.out.println("Account Balance: " + balance);
        System.out.println("Year of Account Opening: "+ yearOFOpening);
        System.out.println("Cnic of Account Holder: " + cnic);
    }
    public  int withdraw(int amount)
    {
        return balance - amount;
    }
    public  int deposit(int amount)
    {
        return balance + amount;
    }
    public  int calculateAgeOFAcc()
    {
        return 2022 - yearOFOpening;
    }
}
