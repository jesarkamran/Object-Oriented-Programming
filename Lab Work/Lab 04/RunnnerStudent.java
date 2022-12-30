public class RunnnerStudent {
   public static void main(String[] args) 
   {
      System.out.println("\nUsing Class data with Object No: 1");
      int[] intArray = {80,60,70,90,78};  
      Student obj1 = new Student();
      obj1.setName("Imran Jesar");
      obj1.setResult(intArray);
      obj1.display();
      System.out.println("Average of Marks: "+obj1.average());
   
      System.out.println("\nUsing Class data with Object No: 2");
      int[] intArray1 = {88,78,68,58,84};
      Student obj2 = new Student("Kamran Jesar", intArray1);
      obj2.display();

      Student obj3 = obj2;

      System.out.println("Two objects are Equal: "+obj3.equals(obj2));

      System.out.println("Object with greater Average: "+obj3.compareAverage(obj1).average());
   } 
}
