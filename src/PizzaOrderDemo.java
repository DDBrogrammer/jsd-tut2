

public class PizzaOrderDemo {
    public static void main(String[] args)
    {
        PizzaOrder order = new PizzaOrder();
        order.setNumPizzas(2);
        double total = order.calcTotal();
        System.out.println("Total cost: $" + total);
    }
}
