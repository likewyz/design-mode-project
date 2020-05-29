package creation.simpleFactory;

public class SimplePizzaFactory {

    public Pizza createPizza(String type){
        Pizza pizza;
        switch (type){
            case "cheese":
                pizza = new CheesePizza();
                break;
            case "pepperoni":
                pizza = new PepperoniPizza();
                break;
            case "greek":
                pizza = new GreekPizza();
                break;
            default:
                throw new RuntimeException();
        }
        return pizza;


    }
}
