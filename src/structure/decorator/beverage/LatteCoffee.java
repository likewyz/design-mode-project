package structure.decorator.beverage;

/**
 * 拿铁咖啡
 */
public class LatteCoffee extends Beverage {

    public LatteCoffee() {
        description = "拿铁咖啡";
    }

    //算价格要用bigDecimal，此处试验就用double了
    @Override
    public double cost() {
        return 2.31;
    }
}
