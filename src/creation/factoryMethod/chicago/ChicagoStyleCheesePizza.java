package creation.factoryMethod.chicago;

import creation.factoryMethod.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
        name = "Chicago Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    void cut(){
        System.out.println("我是芝加哥披萨，我不太一样，我要切成正方形");
    }
}
