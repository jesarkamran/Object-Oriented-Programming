public class Job {
    private String  designation;
    private double salary;
    private int id;
    Job()
    {

    }
    Job(String a, double b, int c)
    {
        if ((a != null)&(b >0)&(c>0)) {
            designation = a;
            salary = b;
            id = c;
        }
    }
    public void setDesignation(String designation) {
        if(designation != null)
            this.designation = designation;
        else
            System.out.println("Can't INitialize with ivalid values");
    }
    public String getDesignation() {
        return designation;
    }
    public void setId(int id) {
        if(id>0)    
            this.id = id;
        else
            System.out.println("Can't INitialize with ivalid values");
    }
    public int getId() {
        return id;
    }
    public void setSalary(double salary) {
        if(salary>0)
            this.salary = salary;
        else
        System.out.println("Can't INitialize with ivalid values");
    }
    public double getSalary() {
        return salary;
    }

    public void display()
    {
        System.out.println("Employee Designation: "+designation);
        System.out.println("Employee Salary: "+salary);
        System.out.println("Employee ID: "+id);
    }
}
