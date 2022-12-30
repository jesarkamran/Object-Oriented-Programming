public class Student
{
    private String name; private int[] result_Array = new int[5];
    Student()
    {

    }   
    Student(String a)
    {
        if (a != null) {
            name = a;
        }
        else
        {
            System.out.println("Can't initialize data with invalid values");
        }
    }
    Student(String a, int[] b)
    {
        if ((a != null)&&(b.length >= result_Array.length)) {
            name = a;
            if (b.length <= result_Array.length) {
                for (int i = 0; i < b.length; i++) {
                    result_Array[i] = b[i];
                }
            }
            else
            {
            for (int i = 0; i < result_Array.length; i++) {
                result_Array[i] = b[i];
            }
            }
        }
        else
        {
            System.out.println("Can't initialize data with invalid values");
        }
    }

    Student(Student obj)
    {
        if ((obj.name != null)&&(obj.result_Array.length >0)) {
            this.name = obj.name;
            for (int i = 0; i < this.result_Array.length; i++) {
                this.result_Array[i] = obj.result_Array[i];
            }
        }
    }
    public boolean equals(Student obj)
    {
        if (this.name == obj.name) {
            for (int i = 0; i < this.result_Array.length; i++) {
                if (this.result_Array[i] == obj.result_Array[i]) {
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

    public void display()
    {
        System.out.println("Student Name: " + name);
        for (int i = 0; i < result_Array.length; i++) 
        {
            System.out.println("Subject Marks: "+result_Array[i]);
        }
    }
    public void setName(String a)
    {
        if (a != null) {
            name = a;
        }
    }
    public String getName() {
        return name;
    }
    public int[] getResult_Array() {
        return result_Array;
    }
    public void setResult(int[] result)
    {
        if (result.length <= result_Array.length) {
            for (int i = 0; i < result.length; i++) {
                result_Array[i] = result[i];
            }
        }
        else
        {
            for (int i = 0; i < result_Array.length; i++) {
                result_Array[i] = result[i];
            }
        }
    }
    public int average()
    {
        int average = 0;
        for (int i = 0; i < result_Array.length; i++) {
            average += result_Array[i];
        }
        return average/(result_Array.length);
    }
    public Student compareAverage(Student p)
    {
        if (this.average()  > p.average()) {
            return this;
        }
        return p;
    }
}