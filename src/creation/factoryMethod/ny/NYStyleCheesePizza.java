package creation.factoryMethod.ny;

import creation.factoryMethod.Pizza;

public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        name = "NY Cheese Pizza";
        dough = "Thin Crust Sauce";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
