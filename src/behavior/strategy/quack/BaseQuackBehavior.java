package behavior.strategy.quack;

/**
 * 普通的鸭子嘎嘎叫
 */
public class BaseQuackBehavior implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("嘎嘎");
    }
}
