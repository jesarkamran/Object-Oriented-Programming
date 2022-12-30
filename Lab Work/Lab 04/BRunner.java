public class BRunner {
    public static void main(String[] args) {
        System.out.println("\nUsing Class data with Object No: 1");
        Book obj1 = new Book(); String[] chap = {"Java", "Python", "C++", "JavaScript", "PHP"};
        obj1.setAuthorName("Kamran Jesar"); obj1.setChapterNames(chap);
        obj1.display();
        
        System.out.println("\nUsing Class data with Object No: 2");
        Book obj2 = obj1;
        System.out.println("Two Objects are Same: " +obj2.equals(obj1));
        System.out.println("Authors are Same: "+ obj2.compareAuthors(obj1).getAuthorName());
        System.out.println("Chapter names are same of both Objects: "+ obj2.compareChapters(obj1));
    }
}
