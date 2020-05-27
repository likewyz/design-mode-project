package behavior.strategy;

import behavior.strategy.quack.BaseQuackBehavior;
import behavior.strategy.swim.BaseSwimBehavior;

/**
 * 测试类
 */
public class MainTest {

    public static void main(String[] args) {
        //红色鸭子
        RedDuck redDuck = new RedDuck();
        redDuck.display();
        redDuck.swim();
        redDuck.quack();

        //蓝色鸭子
        BlueDuck blueDuck = new BlueDuck();
        blueDuck.setQuackBehavior(new BaseQuackBehavior());
        blueDuck.setSwimBehavior(new BaseSwimBehavior());
        blueDuck.display();
        blueDuck.swim();
        blueDuck.quack();

        //木头鸭子
        WoodDuck woodDuck = new WoodDuck();
        woodDuck.display();
        woodDuck.swim();
        woodDuck.quack();
    }
}
