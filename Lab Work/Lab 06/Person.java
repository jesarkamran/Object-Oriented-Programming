public class Person {
    private String name;
    private int age;
    Person()
    {

    }
    Person(String name, int a)
    {
        if ((name != null)&(a>0)) {
            this.name = name; age = a;
        }
        else
        {
            System.out.println("Can't Initialize data with invalid vlues");
        }
    }
    public void display()
    {
        System.out.println("Name of Person: "+name);
        System.out.println("Age of Person: "+age);
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
}
