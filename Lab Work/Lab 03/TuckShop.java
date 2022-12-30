import java.util.Scanner;
public class TuckShop{
    String owner; String[] food_Items = new String[100];
    double[] price = new double[100]; int[] quantity = new int[100];
    int indexFoodItems = 0, indexPrice = 0, indexQuantity;
    TuckShop()
    {

    }
    TuckShop(String a, String[] b, double[] c,int[] d)
    {
        if ((a != null)&(b.length <= food_Items.length)&(c.length<=price.length)&(d.length <= quantity.length)) {
            owner = a; 
            for (indexFoodItems = 0; indexFoodItems < b.length; indexFoodItems++) {
                food_Items[indexFoodItems] = b[indexFoodItems]; price[indexFoodItems] = c[indexFoodItems]; quantity[indexFoodItems] = d[indexFoodItems];
            }
        }
        else
        {
            owner = "Kamran Jesar";
            for (indexFoodItems = 0; indexFoodItems < food_Items.length; indexFoodItems++) {
                food_Items[indexFoodItems] = b[indexFoodItems]; price[indexFoodItems] = c[indexFoodItems]; quantity[indexFoodItems] = d[indexFoodItems];
            }

        }
        indexPrice = indexFoodItems; indexQuantity = indexFoodItems;
    }
    public void display()
    {
        System.out.println("Owner of TuckShop: "+ owner);

        System.out.println("TUCK SHOP MENU");
        System.out.println("Food Items\t  Price\t\tQuantity");
        for (int j = 0; j < indexFoodItems; j++) {
            System.out.println(food_Items[j]+"\t\t : "+price[j]+"\t\t : "+ quantity[j]);
        }
    }
    public void setFoodItem(String b)
    {
        if (b !=null) {
            food_Items[indexFoodItems] = b;
        }
        indexFoodItems++;
    }
    public void setPrice(double b)
    {
        if (b>0) {
            price[indexPrice] = b;
        }
        indexPrice++;
    }
    public void setQuantity(int b)
    {
        if (b >0) {
            quantity[indexQuantity] = b;
        }
        indexQuantity++;
    }
    
    public void buy()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name of Food Item to Buy: ");
        String item = input.nextLine();
        input.close();
        for (int j = 0; j < indexFoodItems; j++) {
            if (food_Items[j].equals(item)) {
                for (int k = j; k <= indexFoodItems; k++)
                {
                    j++; food_Items[k] = food_Items[j];
                    price[k] = price[j];
                    quantity[k] = quantity[j];
                
                    
                }
                break;
            }
        }
            indexFoodItems--; indexPrice = indexFoodItems;
            indexQuantity = indexFoodItems;
    }
    public double totalPrice()
    {
        double total = 0;
        for (int j = 0; j < indexFoodItems; j++) {
            total += price[j];
        }
        return total;
    }

    public int itemWithMinQuantity()
    {
        int min = quantity[0];
        for (int j = 1; j < indexFoodItems; j++) {
            if (min > quantity[j]) {
                min = quantity[j];
            }
        }
        return min;
    }

    public double itemWithMinPrice()
    {
        double min = price[0];
        for (int j = 1; j < indexFoodItems; j++) {
            if (min > price[j]) {
            System.out.println(price[j]+ " "+j);
            min = price[j];
            }
        }
        return min;
    }

}