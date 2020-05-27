package behavior.strategy;

import behavior.strategy.quack.BaseQuackBehavior;
import behavior.strategy.swim.BaseSwimBehavior;


/**
 * 红鸭子颜色是红的，又会游泳又会叫
 */
public class RedDuck extends BaseDuck{

    /**
     * 此处直接在构造器中申明具体的实现类
     */
    public RedDuck() {
        quackBehavior = new BaseQuackBehavior();
        swimBehavior = new BaseSwimBehavior();
    }

    @Override
    public void display() {
        System.out.println("我的颜色是红色的");
    }
}
