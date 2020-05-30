package creation.abstractFactory.ny;

import creation.abstractFactory.ingredient.PizzaIngredientFactory;
import creation.abstractFactory.ingredient.dough.Dough;
import creation.abstractFactory.ingredient.dough.FatDough;
import creation.abstractFactory.ingredient.sauce.OysterSauce;
import creation.abstractFactory.ingredient.sauce.Sauce;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new FatDough();
    }

    @Override
    public Sauce createSauce() {
        return new OysterSauce();
    }
}
