package behavior.strategy;

import behavior.strategy.quack.NoQuackBehavior;
import behavior.strategy.swim.NoSwimBehavior;

/**
 * 木头鸭子只能看看，不会叫也不会游泳
 */
public class WoodDuck extends BaseDuck{

    public WoodDuck() {
        quackBehavior = new NoQuackBehavior();
        swimBehavior = new NoSwimBehavior();
    }

    @Override
    public void display() {
        System.out.println("木头鸭子颜色是随机的");
    }
}
