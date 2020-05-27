package behavior.strategy.swim;

/**
 * 普通鸭子都会扭着游
 */
public class BaseSwimBehavior implements SwimBehavior{

    @Override
    public void swim() {
        System.out.println("扭着游");
    }
}
