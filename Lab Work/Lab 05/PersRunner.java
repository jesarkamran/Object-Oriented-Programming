public class PersRunner {
    public static void main(String[] args) {
        Address a1 = new Address("Quad Block", 2, "Islamabad");
        Person p1 = new Person("Kamran", "Jesar", a1);
        p1.display();
        System.out.println(p1.getFirstName() +" "+p1.getLastName()+" lives in Islamabad: "+p1.check());

        System.out.println("Display of Data using 2nd display method");

        p1.display2();

        System.out.println("\nBOOK CLASS\n");
        Book b1 = new Book("Imran", "OOP", p1);
        b1.display();
        System.out.println("Book class Street No. is less than 10: "+b1.stCheck());

        Address a2 = new Address("Khan Plaza", 8, "Mithi");
        p1.setAddObj(a2);

        System.out.println("\nDisplaying Data of Book After Modifying Address");
        b1.display2();
    }
}
