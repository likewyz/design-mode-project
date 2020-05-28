package structure.decorator.comdiment;

import structure.decorator.beverage.Beverage;

/**
 * 豆浆
 */
public class Soy extends CondimentDecorator{

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 豆浆";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.6;
    }
}
