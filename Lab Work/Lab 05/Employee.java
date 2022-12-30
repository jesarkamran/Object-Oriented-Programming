public class Employee {
   
    private String firstName;
    private String lastName;
    private My_Date birthDate;
    private My_Date hireDate;
    private Job jobObj;
   
    Employee()
    {
        birthDate = new My_Date();
        hireDate = new My_Date();
        jobObj = new Job();
    }
   
    Employee(String f, String l, My_Date d1 , My_Date d2, Job d3)
    {
        firstName = f;
        lastName = l;
        birthDate =d1;
        hireDate = d2;
        jobObj = d3;
    }
   
    public void setBirthDate(My_Date d1)
    {
        birthDate =d1;
    }
    public void setHireDate(My_Date d1)
    {
        hireDate =d1;
    }
   
    public  My_Date  getBirthDate()
    {
        return birthDate;
    }
     public  My_Date  getHireDate()
    {
        return hireDate;
    }
    public void setJobObj(Job jobObj) {
        this.jobObj = jobObj;
    }
    public Job getJobObj() {
        return jobObj;
    }
    public void display()
    {
    System.out.println(firstName);
    System.out.println(lastName);
    System.out.println(birthDate.getDay() + "  "+birthDate.getMonth() + "  "+ birthDate.getYear());
    System.out.println(hireDate.getDay() + "  "+hireDate.getMonth() + "  "+ hireDate.getYear());
    System.out.println("Designation: "+jobObj.getDesignation() + "\nSalary: "+jobObj.getSalary() + " \nID: "+ jobObj.getId());
    }

    public void display2()
    {
    System.out.println(firstName);
    System.out.println(lastName);
    birthDate.display();
    hireDate.display();
    jobObj.display();
    }
    public boolean experienced(int current)
    {
        if ((current-hireDate.getYear()) >= 5) {
            return true;   
        }
        return false;
    }
    public boolean salaryGreater()
    {
        if (jobObj.getSalary() >50000) {
            return true;
        }
        return false;
    }
}