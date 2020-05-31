package structure.adapter;

/**
 * 正统鸭子 - 绿头鸭
 */
public class MallardDuck implements Duck{
    @Override
    public void quack() {
        System.out.println("我是正统鸭子，我会呱呱叫");
    }

    @Override
    public void fly() {
        System.out.println("我飞的贼远！");
    }
}
