package behavior.strategy.quack;

/**
 * 不会叫
 */
public class NoQuackBehavior implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("不会叫");
    }
}
