public class Document
{
    protected String text;

    Document()
    {

    }

    Document(String text)
    {
        if(text != null)
        {
            this.text = text;
        }
        else
        {
            System.out.println("Can't Initialize data with invalid values");
        }
    }
    public String toString()
    {
        return text;
    }
    
    public void setText(String text)
    {
        if(text != null)
        {
            this.text = text;
        }
        else
        {
            System.out.println("Can't Initialize data with invalid values");
        }
    }
}
