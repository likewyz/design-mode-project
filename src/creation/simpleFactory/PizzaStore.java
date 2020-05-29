package creation.simpleFactory;

/**
 * 披萨商店
 */
public class PizzaStore {

    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type){
        Pizza pizza;

        //调用工厂方法 实例化一个披萨对象
        pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.addCondiments();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;

    }
}
