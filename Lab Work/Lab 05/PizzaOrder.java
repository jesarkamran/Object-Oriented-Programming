public class PizzaOrder {
    private Pizza p1, p2;
    PizzaOrder()
    {
        p1 = new Pizza(); 
        p2 = new Pizza();
    }
    PizzaOrder(Pizza a, Pizza b)
    {
            p1 =a;
            p2 =b;
    }
    public void setPizza1(Pizza p)
    {
        p1 = p;
    }
    public void setPizza2(Pizza p)
    {
        p2 = p;
    }
    public Pizza getP1() {
        return p1;
    }
    public Pizza getP2() {
        return p2;
    }
    public double calTotal()
    {
        return (p1.calCost()+p2.calCost());
    }
}
