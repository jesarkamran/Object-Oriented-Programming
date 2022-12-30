public class Book {
    private String authorName; private String[] chapterNames = new String[5];
    Book()
    {

    }
    Book(String a, String[] b)
    {
        if ((a != null)&&(b.length > 0)) {
            authorName = a;
            if (b.length <= chapterNames.length) {
                for (int i = 0; i < b.length; i++) {
                    chapterNames[i] = b[i];
                }
            }
            else
            {
                for (int i = 0; i < chapterNames.length; i++) {
                    chapterNames[i] = b[i];
                }
            }
        }
        else
        {
            System.out.println("Can't initialize data with invalid values");
        }
    }

    public boolean equals(Book obj) {
        if (this.authorName.equals(obj.authorName)) {
            for (int i = 0; i < chapterNames.length; i++) {
                if (this.chapterNames[i].equals(obj.chapterNames[i])) {
                    continue;
                }
                else
                {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    public void setAuthorName(String a) {
        
        if (a != null) 
        {
            authorName = a;
        }
        else
        {
            System.out.println("Can't Initialize data member with invalid valid values");
        }
    }
    public void setChapterNames(String[] s) {
        if (s.length > 0) {
            if (s.length <= chapterNames.length) {
                for (int i = 0; i < s.length; i++) {
                    chapterNames[i] = s[i];
                }
            }
            else
            {
                for (int i = 0; i < chapterNames.length; i++) {
                    chapterNames[i] = s[i];
                }
            }
        }
        else
        {
            System.out.println("Can't initialize data with invalid values");
        }

    }
    public String getAuthorName() {
        return authorName;
    }
    public String[] getChapterNames() {
        return chapterNames;
    }
    public void display()
    {
        System.out.println("Author Name: " +authorName);
        for (int i = 0; i < chapterNames.length; i++) {
            System.out.println("Chapter No: "+i+" Name: "+chapterNames[i]);
        }
    }
    public Book compareAuthors(Book obj)
    {
        if (this.authorName == obj.authorName) {
            return this;
        }
        return obj;
    }

    public boolean compareChapters(Book obj)
    {
        for (int i = 0; i < chapterNames.length; i++) {
            if (this.chapterNames[i].equals(obj.chapterNames[i])) {
                continue;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}
