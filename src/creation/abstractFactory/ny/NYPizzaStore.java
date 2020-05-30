package creation.abstractFactory.ny;

import creation.abstractFactory.Pizza;
import creation.abstractFactory.PizzaStore;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        switch (type) {
            case "cheese":
                pizza = new NYStyleCheesePizza(new NYPizzaIngredientFactory());
                break;
            default:
                throw new RuntimeException();
        }
        return pizza;
    }
}
