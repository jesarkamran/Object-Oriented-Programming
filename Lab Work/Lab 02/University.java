public class University 
{
    String UniName, location, rectorName;
    String[] departments = new String[10];int index = 0;
    University(String a, String b, String c, String[] d)
    {
        if ((a != null)&(b != null)&(c!=null)&(d.length <=departments.length)) 
        {
            UniName = a; rectorName = b; location = c;
            if (d.length <= departments.length) {
                for (index = 0; index < d.length; index++) {
                    departments[index] = d[index]; 
                }
            }
            else if (d.length > departments.length) {
                for (index = 0; index < departments.length; index++) {
                    departments[index] = d[index];
                }
            }
        }
        else
        {
            System.out.println("Can't Initialize a object with invalid values ");
        }

    }
    public void display()
    {
        System.out.println("Name of University: "+ UniName);
        System.out.println("Rector Name: "+rectorName);
        System.out.println("Location City: "+location);
        
        if (departments[0] != null) 
        {
            System.out.print("Departments: ");
            for (int i = 0; i < departments.length; i++) 
            {
                if (departments[i] != null) {
                    System.out.print(departments[i]+", ");
                }
            }
        }
    }
    public void addADepartment(String a)
    {
        if (a != null) {
            departments[index] = a;
            index++;
        }
    }
    public boolean checkIfLocationInCapital()
    {
        if(location.equals("Islamabad"))
        {
            return true;
        }
        return false;
    }
    public boolean checkdepartment(String search)
    {
        for (int i = 0; i < departments.length; i++) {
            if (departments[i].equals(search)) {
                return true;
            }
        }
        return false;
    }
}
