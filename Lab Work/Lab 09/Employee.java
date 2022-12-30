public abstract class Employee implements Payable
{
    private String firstName, lastName, socialSecuritNumber;
    Employee()
    {

    }
    Employee(String a, String b, String c)
    {
        firstName = a; lastName = b;
        socialSecuritNumber = c;
    }

    //Setters
    public void setFirstName(String firstName) 
    {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) 
    {
        this.lastName = lastName;
    }
    public void setSocialSecuritNumber(String socialSecuritNumber) 
    {
        this.socialSecuritNumber = socialSecuritNumber;
    }

    //Getters
    public String getFirstName() 
    {
        return firstName;
    }
    public String getLastName() 
    {
        return lastName;
    }
    public String getSocialSecuritNumber() 
    {
        return socialSecuritNumber;
    }
}
