public class URunner {
    public static void main(String[] args) {
        System.out.println("\nUsing Class data with Object No: 1");
        University obj1 = new University();
        obj1.setUniName("Comsats University Of Islamabad");
        obj1.setrectorName("Kamran Jesar");
        obj1.setLocation("Islamabad");
        String[] depName = {"CS","AI", "DS", "SE", "CT"};
        obj1.setDepartments(depName);
        obj1.display();

        System.out.println("\nDisplaying data after Adding new Department");
        obj1.addDepartment("BBA");
        obj1.display();
        System.out.println("Location is in Islamabad: " +obj1.checkLocation("Islamabad"));
        System.out.println("\nUsing Class data with Object No: 2");
        String[] depName1 = {"CS","AI", "DS", "EE", "BBA"};
        University obj2 = new University("University Of Karachi","Imran Jesar", "Karachi", depName1);
        obj2.display();

        University obj3 = new University(obj2);
        System.out.println("Two objects are equal: "+obj3.equals(obj2));
        System.out.println("University with more Departments: "+obj2.compareDepartment(obj1).getUniName()+"\n");
    }
}
