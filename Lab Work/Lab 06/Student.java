public class Student extends APerson {
    private String status;
    Student()
    {
        super();
    }
    Student(String a, String b, String c, String d, String e)
    {
        super(a, b, c, d);
        if (e!=null) 
        {
            status = e;
        }
        else
        {
            System.out.println("Can't Initiallize Data with Invalid values");
        }
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getStatus() {
        return status;
    }
    public void display()
    {
        System.out.println("Student Name: "+super.name);
        System.out.println("Student Address: "+super.address);
        System.out.println("Student Contact No: "+super.contactNUm);
        System.out.println("Student Email: "+super.email);
        System.out.println("Status of Student: "+ getStatus());
    }
}
