public class Email extends Document 
{
    private String sender, recipient, title;
    Email()
    {
        super();
    } 
    Email(String a, String b, String c, String d)
    {
        super(a);
        if ((b!=null)&(c!=null)&(d!=null))
        {
            sender = b; recipient = c; title = d;
        }
        else
        {
            System.out.println("Can't Initialize data with invalid values");
        }
    }
    public void setRecipient(String recipient) 
    {
        this.recipient = recipient;
    }
    public void setSender(String sender) 
    {
        this.sender = sender;
    }
    public void setTitle(String title) 
    {
        this.title = title;
    }
    @Override
    public void setText(String text)
    {
        super.setText(text);
    }

    public String getRecipient() 
    {
        return recipient;
    }
    public String getSender() 
    {
        return sender;
    }
    public String getTitle() 
    {
        return title;
    }
    
    public void display()
    {
        System.out.println("Sender Name: "+getSender());
        System.out.println("Recipient Name: "+getRecipient());
        System.out.println("Message Title: "+getTitle());
    }
    @Override
    public String toString() 
    {
        return  text+sender+recipient+title;
    }
}
