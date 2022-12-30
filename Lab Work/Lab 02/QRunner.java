public class QRunner {
    public static void main(String[] args) {
        Quadratic obj1 = new Quadratic(30, 20, 10);
        obj1.setValue(10, 20, 30);
        obj1.display();
        System.out.println("Disriminant of Quadratic Equation is: "+ obj1.getDiscriminant());
        System.out.println("Discriminant is greater than 100: "+obj1.checkIfDescriminantIsGretaerThan100());

        Quadratic obj2 = new Quadratic(30, 20, 10);
        obj2.setValue(1, 2, 3);
        obj2.display();
        System.out.println("Disriminant of Quadratic Equation is: "+ obj2.getDiscriminant());
        System.out.println("Discriminant is greater than 100: "+obj2.checkIfDescriminantIsGretaerThan100());

    }
}
