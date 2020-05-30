package creation.abstractFactory;


import creation.abstractFactory.chicago.ChicagoPizzaStore;
import creation.abstractFactory.ny.NYPizzaStore;

public class MainTest {

    public static void main(String[] args) {
        NYPizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza nyPizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + nyPizza.getName());

        System.out.println("================================");

        Pizza chicagoPizza = chicagoStore.orderPizza("cheese");
        System.out.println("Mike ordered a " + chicagoPizza.getName());
    }
}
