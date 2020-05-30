package creation.factoryMethod;

import creation.factoryMethod.chicago.ChicagoPizzaStore;
import creation.factoryMethod.ny.NYPizzaStore;

public class MainTest {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza nyStorePizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + nyStorePizza.getName());

        System.out.println("================================");

        Pizza chicagoStorePizza = chicagoStore.orderPizza("cheese");
        System.out.println("Mike ordered a " + chicagoStorePizza.getName());
    }
}
