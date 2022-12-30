public class URunner {
    public static void main(String[] args) {
        String[] strArr = {"CS", "AI", "SE", "DSA"};
        University obj1 = new University("Comsats University Of Islamabad", "Kamran Jesar", "Islamabad", strArr);
        obj1.display();
        obj1.addADepartment("PF");
        System.out.println("\nShowing Data after adding Departments");
        obj1.display();

        System.out.println("\nLocation is in Capital: "+obj1.checkIfLocationInCapital());
        System.out.println("Department you Searched is present: "+obj1.checkdepartment("CS"));
    }    
}
