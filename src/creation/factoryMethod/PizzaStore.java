package creation.factoryMethod;


public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;

        //调用工厂方法 实例化一个披萨对象
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;

    }

    /**
     * 此方法就是工厂方法，生产工厂对象，不同地区的店会生产不同的对应的pizza
     */
    public abstract Pizza createPizza(String type);
}
