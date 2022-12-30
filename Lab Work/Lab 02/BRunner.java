public class BRunner {
    public static void main(String[] args) {
        String[] s = {"DataTypes", "Variables","Selection Statements", "Loops", "Arrays"};
        Book obj1 = new Book("Kamran Jesar", s);
        obj1.setValue("Kamran Jesar", s);
        obj1.display();
        System.out.println("\nAuthor name starts with A: "+obj1.checkIfAuthorNameStartsWithA());
        System.out.println("Chapter you Searched is present in the Book: "+obj1.searchChapter("DataTypes"));

        System.out.println();

        Book obj2 = new Book("Aamir Jesar", s);
        obj2.setValue("Aamir Jesar", s);
        obj2.display();
        System.out.println("\nAuthor name starts with A: "+obj2.checkIfAuthorNameStartsWithA());
        System.out.println("Chapter you Searched is present in the Book: "+obj2.searchChapter("Lists"));
    }
}
