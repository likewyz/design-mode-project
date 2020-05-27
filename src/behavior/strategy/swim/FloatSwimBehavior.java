package behavior.strategy.swim;

/**
 * 只会飘着
 */
public class FloatSwimBehavior implements SwimBehavior{
    @Override
    public void swim() {
        System.out.println("漂浮");
    }
}
