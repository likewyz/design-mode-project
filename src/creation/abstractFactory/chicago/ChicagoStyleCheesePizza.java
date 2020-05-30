package creation.abstractFactory.chicago;


import creation.abstractFactory.Pizza;
import creation.abstractFactory.ingredient.PizzaIngredientFactory;

public class ChicagoStyleCheesePizza extends Pizza {


    PizzaIngredientFactory pizzaIngredientFactory;

    public ChicagoStyleCheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        name = "Chicago Cheese";
        dough = pizzaIngredientFactory.createDough();
        dough.size();
        sauce = pizzaIngredientFactory.createSauce();
        sauce.degree();
    }

    void cut() {
        System.out.println("我是芝加哥披萨，我不太一样，我要切成正方形");
    }
}
