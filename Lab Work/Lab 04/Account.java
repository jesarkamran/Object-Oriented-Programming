public class Account {
    private double balance; private int yearOfOpening;
    private String cnic;
    Account()
    {
        
    } 
    Account(int a)
    {
        balance = a;
    }
    Account(double a, int b, String c)
    {
        if((balance>0)&(b>0)&(c.length() == 13))
        {
            balance = a; yearOfOpening = b;
            cnic = c;
        }
        else
        {
            System.out.println("Can't Initialize data members with invalid Values");
        }
    }
    Account(Account obj)
    {
        if ((obj.cnic.length() == 13)&(obj.balance>0)&(obj.yearOfOpening>0)) {
            this.cnic = obj.cnic; this.balance = obj.balance; this.yearOfOpening = obj.yearOfOpening;
        }
        else
        {
            System.out.println("Can't Initialize data members with invalid Values");
        }
    }
    public boolean equals(Account obj)
    {
        if ((this.cnic == obj.cnic)&(this.balance == obj.balance)&(this.yearOfOpening ==obj.yearOfOpening)) {
            return true;
        }
        return false;
    }
    public void display()
    {
        System.out.println("Account holder CNIC No: "+cnic);
        System.out.println("Balance in the Account: "+balance);
        System.out.println("Year of Opening the Account: "+yearOfOpening);
    }
    public void setBalance(double a)
    {
        if(a >0)
        {
            balance = a;
        }
        else
        {
            System.out.println("Can't Initialize data member with invalid Value");
        }
    }

    public void setCNIC(String a)
    {
        if(a.length() == 13)
        {
            cnic = a;
        }
        else
        {
            System.out.println("Can't Initialize data member with invalid Value");
        }
    }
    
    public void setYearOfOpening(int a)
    {
        if(a >0)
        {
            yearOfOpening = a;
        }
        else
        {
            System.out.println("Can't Initialize data member with invalid Value");
        }
    }
    
    public double getBalance()
    {
        return balance;
    }

    public String getCNIC()
    {
        return cnic;
    }
    public int getYearOfOpening()
    {
        return yearOfOpening; 
    }

    public double withdraw(double amount)
    {
        if(amount <= balance)
        {
            balance = balance - amount;
            return (balance);
        }
        System.out.println("Cant withdraw amount greater than the amount in account");
        return 0;
    }
    public double deposit(double amount)
    {
        if(amount >0)
        {
            balance = balance+amount;
            return balance;
        }
        else
        {
            System.out.println("Can't Initialize data member with invalid Value");
        }
        return 0;
    }
    public boolean checkValidCNIC(String a)
    {
        if (a.length() == 13) {
            return true;
        }
        else
        {
            return false;
        }
    }
}
