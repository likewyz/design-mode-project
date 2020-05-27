package behavior.strategy;

import behavior.strategy.quack.QuackBehavior;
import behavior.strategy.swim.SwimBehavior;

/**
 * 定义抽象类，声明QuackBehavior，SwimBehavior变量，用作swim，quack。
 * 对于实现类来说可以在构造器中指定 QuackBehavior，SwimBehavior的具体实现类
 * 也可以用具体的setter方法来确定具体的实现类
 */
public abstract class BaseDuck implements Duck{

    QuackBehavior quackBehavior;

    SwimBehavior swimBehavior;

    public abstract void display();

    public void swim(){
        swimBehavior.swim();
    }

    public void quack(){
        quackBehavior.quack();
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setSwimBehavior(SwimBehavior swimBehavior) {
        this.swimBehavior = swimBehavior;
    }
}
