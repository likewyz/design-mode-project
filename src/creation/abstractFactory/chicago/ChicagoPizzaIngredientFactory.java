package creation.abstractFactory.chicago;

import creation.abstractFactory.ingredient.PizzaIngredientFactory;
import creation.abstractFactory.ingredient.dough.Dough;
import creation.abstractFactory.ingredient.dough.ThinDough;
import creation.abstractFactory.ingredient.sauce.Sauce;
import creation.abstractFactory.ingredient.sauce.TartarSauce;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinDough();
    }

    @Override
    public Sauce createSauce() {
        return new TartarSauce();
    }
}
