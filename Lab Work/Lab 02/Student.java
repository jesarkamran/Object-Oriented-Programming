public class Student {
    double gpa; String[] subjectNames = new String[5];
    String email, name;

    Student(String n, double a, String[] b, String c)
    {
        if ((n != null)&(a>0)&(b.length <= 5)&(c != null)) {
            name = n; gpa = a; email = c;
            for (int i = 0; i < b.length; i++) {
                subjectNames[i] = b[i];
            }
        }
        else
        {
            
        }
    }
    public void setValue(String n, double a, String[] b, String c)
    {
        if ((n != null)&(a>0)&(b.length <= 5)&(c != null)) {
            name = n; gpa = a; email = c;
            for (int i = 0; i < b.length; i++) {
                subjectNames[i] = b[i];
            }
        }
    }
    public void display()
    {
        System.out.println("Student Name is: "+name);
        System.out.println("Gpa of " +name+ " is: " + gpa);
        System.out.println("Email of Student is: "+ email);
        System.out.print("Subjects: ");
        for (int i = 0; i < subjectNames.length; i++) {
            System.out.print(subjectNames[i]+", ");
        }
    }
    public boolean searchSubject(String search)
    {
        for (int i = 0; i < subjectNames.length; i++) {
            if (subjectNames[i].equals(search)) {
                return true;
            }
        }
        return false;
    }
    public boolean checkProb()
    {
        if (gpa <2) {
            return true;
        }
        return false;
    }
    public boolean validateEmail()
    {
        String check = "@gmail.com"; int j = 0;
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == check.charAt(j)) {
                j++;
                if (j == (check.length()-1)) {
                    return true;
                }
            }
        }
        return false;
    }
}
