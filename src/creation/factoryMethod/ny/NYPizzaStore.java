package creation.factoryMethod.ny;

import creation.factoryMethod.Pizza;
import creation.factoryMethod.PizzaStore;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        switch (type) {
            case "cheese":
                pizza = new NYStyleCheesePizza();
                break;
            default:
                throw new RuntimeException();
        }
        return pizza;
    }
}
