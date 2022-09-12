
public abstract class Pizza  implements Comparable{
    static class Topping {
        String name;
        int quantity;
        double cost;
        public double calcCost(){
            return cost*quantity;
        }

        @Override
        public String toString() {
            return quantity+"@$"+cost+" - "+ name;
        }
    }

    private String size;
    private int cheeseNumber; 
    private int pepperoniNumber; 
    private int hamToppingNumber;
    private Topping topping;

    public Topping getTopping() {
        return topping;
    }

    public void setToping(Topping topping) {
        this.topping = topping;
    }

    //Constructor(s) that set all of the instance variables
    public Pizza()
    {
        this.size = "";
        this.cheeseNumber = 0;
        this.pepperoniNumber = 0;
        this.hamToppingNumber = 0;
    }

    public Pizza(String pizzaSize, int cheeseCount,
                 int pepperoniCount, int hamCount)
    {
        this.size = pizzaSize;
        this.cheeseNumber = cheeseCount;
        this.pepperoniNumber = pepperoniCount;
        this.hamToppingNumber = hamCount;
    }

    //Public methods to get and set the instance variables
    protected String getSize()
    {
        return size;
    }

    public void setSize(String pizzaSize)
    {
        this.size = pizzaSize;
    }

    protected int getCheeseNumber()
    {
        return cheeseNumber;
    }

    public void setCheeseNumber(int cheeseCount)
    {
        this.cheeseNumber = cheeseCount;
    }

    protected int getPepperoniNumber()
    {
        return pepperoniNumber;
    }

    public void setPepperoniNumber(int pepperoniCount)
    {
        this.pepperoniNumber = pepperoniCount;
    }

    protected int getHamToppingNumber()
    {
        return hamToppingNumber;
    }

    public void setHamToppingNumber(int hamCount)
    {
        this.hamToppingNumber = hamCount;
    }

    //Private instance variables
    private String name;

    public String getName() {
        return name;
    }

    //A public method named that returns a double that is the cost of the pizza
    public double calcCost() {
        if(size.equals("small"))
        {
            return 10 + (cheeseNumber + pepperoniNumber + hamToppingNumber) * 2;
        }
        else if(size.equals("medium"))
        {
            return 12 + (cheeseNumber + pepperoniNumber + hamToppingNumber) * 2;
        }
        else if(size.equals("large"))
        {
            return 14 + (cheeseNumber + pepperoniNumber + hamToppingNumber) * 2;
        }
        else
        {
            return 0.0;
        }
    }

    //A public method named that returns a containing the pizza size, quantity of each
    //topping, and the pizza cost as calculated by calcCost()
    protected String getDescription()
    {
        return "Pizza size: " + size + "\n Cheese toppings: "
                + cheeseNumber + "\n Pepperoni toppings: "
                + pepperoniNumber + "\n Ham toppings: " + hamToppingNumber
                + "\n Pizza cost: $" + calcCost() + "\n";
    }
}
