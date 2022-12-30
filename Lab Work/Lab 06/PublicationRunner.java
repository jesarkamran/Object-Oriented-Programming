public class PublicationRunner {
    public static void main(String[] args) {
        System.out.println("\nBook Class");
        Book b = new Book("Fault in Our Stars", 2000, 300);
        b.display();
        System.out.println("\nTape Class");
        Tape t = new Tape("Alchemist", 3000, 20.8);
        t.display();
        System.out.println();
    }
}
