package behavior.strategy.swim;

/**
 * 不会游泳
 */
public class NoSwimBehavior implements SwimBehavior{
    @Override
    public void swim() {
        System.out.println("不会游泳，沉了");
    }
}
