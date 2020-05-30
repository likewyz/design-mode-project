package creation.abstractFactory.ny;


import creation.abstractFactory.Pizza;
import creation.abstractFactory.ingredient.PizzaIngredientFactory;

public class NYStyleCheesePizza extends Pizza {

    PizzaIngredientFactory pizzaIngredientFactory;

    public NYStyleCheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        name = "NY CHEESE";
        dough = pizzaIngredientFactory.createDough();
        dough.size();
        sauce = pizzaIngredientFactory.createSauce();
        sauce.degree();
    }
}
