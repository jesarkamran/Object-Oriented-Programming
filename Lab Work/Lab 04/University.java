public class University {
    private String uniName, rectorName, location; 
    private String[] departments = new String[20];

    //defualt Constructor
    University()
    {

    }

    //Two Argument Constructor
    University(String a, String b, String c, String[] d)
    {
        if ((a != null)&&(b != null)&&(c != null)&&(d.length >0)) {
            uniName = a; rectorName = b; location = c;
            if (d.length <= departments.length) {
                for (i = 0; i < d.length; i++) {
                    departments[i] = d[i];
                }
            }
            else
            {
                for (i = 0; i < departments.length; i++) {
                    departments[i] = d[i];
                }
            }
        }
        else
        {
            System.out.println("Can't initialize data with invalid values");
        }
    }

    //Copy Constructor
    University(University obj)
    {
        if ((obj.uniName != null)&&(obj.rectorName != null)&&(obj.location != null)&&(obj.departments.length >0)) 
        {
            this.uniName = obj.uniName; this.rectorName = obj.rectorName; this.location = obj.location;
            if (obj.departments.length <= departments.length) {
                for (int i = 0; i < obj.departments.length; i++) {
                    this.departments[i] = obj.departments[i];
                }
            }
            else
            {
                for (int i = 0; i < this.departments.length; i++) {
                    this.departments[i] = obj.departments[i];
                }
            }
        }
        else
        {
            System.out.println("Can't initialize data with invalid values");
        }
    }

    //Equals Method
    public boolean equals(University obj)
    {
        if ((this.uniName==obj.uniName)&&(this.rectorName == obj.rectorName)&&(this.location == obj.location)&&(this.departments.length == obj.departments.length)) 
        {
            for (int j = 0; j < this.departments.length; j++) {
                if (this.departments[j] == obj.departments[j]) {
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

    //Set Methods
    public void setUniName(String uName) {
        if (uName != null)
        {
            uniName = uName;
        }
    }

    public void setrectorName(String rName) {
        if (rName != null)
        {
            rectorName = rName;
        }
    }

    public void setLocation(String loc) {
        if (loc != null)
        {
            location = loc;
        }
    }
    private int i = 0;
    public void setDepartments(String[] d) {
        if (d.length >0)
        {
            if (d.length <= departments.length) {
                for (i = 0; i < d.length; i++) {
                    departments[i] = d[i];
                }
            }
            else
            {
                for (i = 0; i < departments.length; i++) {
                    departments[i] = d[i];
                }
            }
        }
        else
        {
            System.out.println("Can't initialize data with invalid values");
        }
    }

    //Get Methods
    public String getUniName() {
        return uniName;
    }

    public String getRectorName() {
        return rectorName;
    }

    public String getLocation() {
        return location;
    }

    public String[] getDepartments() {
        return departments;
    }

    //Display Method
    public void display()
    {
        System.out.println("University Name: "+uniName);
        System.out.println("Rector Name: "+rectorName);
        System.out.println("Location of University: "+location);
        System.out.print("Departments: ");
        for (int j = 0; j < i; j++) {
            System.out.print(departments[j]+ " ");
        }
        System.out.println();
    }

    //Add Department
    public void addDepartment(String depName)
    {
        
        departments[i] = depName;
        i++;
    }

    //Check location Mehtod
    public boolean checkLocation(String loc)
    {
        if (location.equals(loc)) {
            return true;
        }
        return false;
    }

    //Compare Department Method
    public University compareDepartment(University obj)
    {
        if (this.departments.length > obj.departments.length) {
            return this;
        }
        return obj;
    }
}
