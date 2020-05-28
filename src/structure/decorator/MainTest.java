package structure.decorator;

import structure.decorator.beverage.Beverage;
import structure.decorator.beverage.Espresso;
import structure.decorator.beverage.LatteCoffee;
import structure.decorator.comdiment.Mocha;
import structure.decorator.comdiment.Soy;

/**
 * 测试类
 * 拓展：如果有大杯中杯小杯的需要，怎么设计？
 */
public class MainTest {

    public static void main(String[] args){
        //客人点了一份摩卡浓缩咖啡
        Beverage beverage = new Mocha(new Espresso());
        System.out.println(beverage.getDescription());
        System.out.println("一共花费了 " + beverage.cost());

        //客人点了双倍摩卡 豆浆拿铁咖啡
        Beverage beverage2 = new Mocha(new Mocha(new Soy(new LatteCoffee())));
        System.out.println(beverage2.getDescription());
        System.out.println("一共花费了 " + beverage2.cost());
    }
}
