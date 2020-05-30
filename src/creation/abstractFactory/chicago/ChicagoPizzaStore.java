package creation.abstractFactory.chicago;

import creation.abstractFactory.Pizza;
import creation.abstractFactory.PizzaStore;

/**
 * 不同地区的披萨店会生产具有地方特色的披萨
 */
public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        switch (type) {
            case "cheese":
                pizza = new ChicagoStyleCheesePizza(new ChicagoPizzaIngredientFactory());
                break;
            default:
                throw new RuntimeException();
        }
        return pizza;
    }
}
