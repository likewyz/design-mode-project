package creation.factoryMethod.chicago;

import creation.factoryMethod.Pizza;
import creation.factoryMethod.PizzaStore;

/**
 * 不同地区的披萨店会生产具有地方特色的披萨
 */
public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        switch (type) {
            case "cheese":
                pizza = new ChicagoStyleCheesePizza();
                break;
            default:
                throw new RuntimeException();
        }
        return pizza;
    }
}
