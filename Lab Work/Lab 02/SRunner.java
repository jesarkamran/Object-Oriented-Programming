public class SRunner {
    public static void main(String[] args) {
        String[] s = {"ICT", "AP", "IS", "ECC", "CAL"};
        String c = "jesarkamran@gmail.com";
        Student obj1 = new Student("Kamran Jesar", 3.23, s, c);

        obj1.setValue("Kamran Jesar", 3.23, s, c);
        obj1.display();
        System.out.println("\nSubject you Searched is presnt: "+obj1.searchSubject("PF"));
        System.out.println("Student GAS status: "+obj1.checkProb());
        System.out.println("Student Email valid: "+obj1.validateEmail());

        System.out.println();

        c = "jesarkamrangmail.com";
        Student obj2 = new Student("Kamran Jesar", 2.6, s, c);

        obj2.setValue("Kamran Jesar", 2.6, s, c);
        obj2.display();
        System.out.println("\nSubject you Searched is presnt: "+obj2.searchSubject("OOP"));
        System.out.println("Student GAS status: "+obj2.checkProb());
        System.out.println("Student Email valid: "+obj2.validateEmail());
    }
}
