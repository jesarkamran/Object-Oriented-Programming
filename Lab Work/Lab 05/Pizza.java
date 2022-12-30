public class Pizza {
    private String sizeOfPizza;
    private int numOfCheeseToppings;
    private int numOfPepperoniToppings;
    private int numOfHamToppings;

    Pizza()
    {

    }
    Pizza(String a, int b,int c, int d)
    {
        
        sizeOfPizza = a;
        numOfCheeseToppings = b;
        numOfPepperoniToppings = c;
        numOfHamToppings = d;
    }
    public void setSizeOfPizza(String sizeOfPizza) {
        this.sizeOfPizza = sizeOfPizza;
    }
    public String getSizeOfPizza() {
        return sizeOfPizza;
    }

    public void setNumOfCheeseToppings(int numOfCheeseToppings) {
        this.numOfCheeseToppings = numOfCheeseToppings;
    }
    public int getNumOfCheeseToppings() {
        return numOfCheeseToppings;
    }

    public void setNumOfPepperoniToppings(int numOfPepperoniToppings) {
        this.numOfPepperoniToppings = numOfPepperoniToppings;
    }
    public int getNumOfPepperoniToppings() {
        return numOfPepperoniToppings;
    }

    public void setNumOfHamToppings(int numOfHamToppings) {
        this.numOfHamToppings = numOfHamToppings;
    }
    public int getNumOfHamToppings() {
        return numOfHamToppings;
    }

    public void display()
    {
        System.out.println("Size of Pizza: "+getSizeOfPizza());
        System.out.println("Number of Cheese Toppings: "+getNumOfCheeseToppings());
        System.out.println("Number of Pepperoni Toppings: "+getNumOfPepperoniToppings());
        System.out.println("Number of Ham Toppings: "+getNumOfHamToppings());
    }
    public double calCost()
    {
        double cost = 0, topping = 2*(numOfCheeseToppings+numOfPepperoniToppings+numOfHamToppings);
        switch (sizeOfPizza) {
            case "Small":
                cost = (10*topping); break;
            case "Medium":
                cost = (12*topping); break;
            case "Large":
                cost = (14*topping); break;
            default:
                System.out.println("Invalid Size type entered");
                break;
        }
        return cost;
    }

    public String getdescription()
    {
        return ("Size of Pizza: "+sizeOfPizza+"\nNumber of Cheese Toppings: "
        +getNumOfCheeseToppings()+"\nNumber of Peperoni Toppings: "
        +getNumOfPepperoniToppings()+"\nNumber of Ham Toppings: "+getNumOfHamToppings());
    }
}
