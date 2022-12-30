public class RUNNER 
{
    public static void main(String[] args) 
    {
        System.out.println("\nEmployee Class\n");
        My_Date d = new My_Date(14,6,2025);
        Employee e = new Employee("Ragnor Lothbrok", "Mihti, Tharparkar", "03442136564","jesarkamran@gmail.com", "SpaceX", 2000000, d);
        e.display();

        System.out.println("Faculty Class Display 2");
        Faculty f = new Faculty("Ragnor Lothbrok", "Mihti, Tharparkar", "03442136564","jesarkamran@gmail.com", "SpaceX", 2000000, d,8,1);
        f.display2();
        System.out.println();

        System.out.println("\nStudent Class\n");
        Student s = new Student("Kamran Jesar", "Mithi, Tharparkar", "03442136564", "jesarkamran@gmail.com", "GAS");
        s.display();
    }
}
