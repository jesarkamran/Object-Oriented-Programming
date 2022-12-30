public class Book {
    String author; String[] chapterNames = new String[5];
    Book(String a, String[] s)
    {
        if ((a != null)&(s.length == 5)) {
            author = a; chapterNames = s;
        }
    }

    public void setValue(String a, String[] s)
    {
        if ((a.equals(""))&(s.length == 5)) {
            author = a; chapterNames = s;
        }
    }
    public void display()
    {
        System.out.println("Author of Book: "+author);
        System.out.print("Chapter Names: ");
        for (int i = 0; i < chapterNames.length; i++) {
            System.out.print(chapterNames[i]+", ");
        }
    }
    public boolean checkIfAuthorNameStartsWithA()
    {
        if(author.charAt(0) == 'A')
        {
            return true;
        }
        return false;
    }
    public boolean searchChapter(String search)
    {
        for (int i = 0; i < chapterNames.length; i++) {
            if (chapterNames[i].equals(search)) {
                return true;
            }
        }
        return false;
    }

}
