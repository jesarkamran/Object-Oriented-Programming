public class EmpRunner {
public static void main(String[] args) {
    
    Employee e1 = new Employee();
    
        
    
    My_Date d1 = new My_Date (4,5,1992);
    
        
    
    My_Date d2 = new My_Date (4,5,2005);
    
    Job d3 = new Job("Software Analyst", 100000, 123987);   
    
    Employee e2 = new Employee("saneeha","aamir",d1, d2, d3);
       
    
    e2.display();
    System.out.println("Employee is Experienced: "+e2.experienced(2022));    
    System.out.println("Employee Salary greater than 50000: "+e2.salaryGreater());    
    
    e1.display();
    
        
    
    }
}
