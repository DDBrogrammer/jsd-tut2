import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PizzaOrder {
    private int numPizzas;
    private Pizza pizza1;
    private Pizza pizza2;
    private Pizza pizza3;

    public PizzaOrder()
    {
        this.numPizzas = 0;
        this.pizza1 = null;
        this.pizza2 = null;
        this.pizza3 = null;
    }

    public PizzaOrder(int numPizzas, Pizza pizza1, Pizza pizza2, Pizza pizza3)
    {
        setNumPizzas(numPizzas);
        setPizza1(pizza1);
        setPizza2(pizza2);
        setPizza3(pizza3);
    }

    //sets the number of pizzas in the order. numPizzas must be between 1 and 3
    public void setNumPizzas(int numPizzas)
    {
        if(numPizzas < 1)
            this.numPizzas = 1;
        else if(numPizzas > 3)
            this.numPizzas = 3;
        else
            this.numPizzas = numPizzas;
    }

    //sets the first pizza in the order
    public void setPizza1(Pizza pizza1)
    {
        if(numPizzas >= 1)
            this.pizza1 = pizza1;
        else
            this.pizza1 = null;
    }

    //sets the second pizza in the order
    public void setPizza2(Pizza pizza2)
    {
        if(numPizzas >= 2)
            this.pizza2 = pizza2;
        else
            this.pizza2 = null;
    }

    //sets the third pizza in the order
    public void setPizza3(Pizza pizza3)
    {
        if(numPizzas >= 3)
            this.pizza3 = pizza3;
        else
            this.pizza3 = null;
    }

    //returns the total cost of the order
    public double calcTotal()
    {
        double total = 0.0;

        if(pizza1 != null)
            total += pizza1.calcCost();

        if(pizza2 != null)
            total += pizza2.calcCost();

        if(pizza3 != null)
            total += pizza3.calcCost();

        return total;
    }

    public List<Pizza>  sort(){
        List<Pizza> pizzas = reduceOrder();
        Collections.sort(pizzas);
        pizzas.stream().map(s -> s.getTopping().calcCost()).forEach(System.out::print);
        return pizzas;
    }

    private List<Pizza> reduceOrder(){
        List<Pizza> reduceOrderList=new ArrayList<>();
        if( pizza1!=null){
            reduceOrderList.add(pizza1);
        }
        if( pizza2!=null){
            reduceOrderList.add(pizza2);
        }
        if( pizza3!=null){
            reduceOrderList.add(pizza3);
        }
        return  reduceOrderList;
    }
}
