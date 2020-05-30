package creation.abstractFactory.ingredient;

import creation.abstractFactory.ingredient.dough.Dough;
import creation.abstractFactory.ingredient.sauce.Sauce;

public interface PizzaIngredientFactory {

    Dough createDough();

    Sauce createSauce();
}
