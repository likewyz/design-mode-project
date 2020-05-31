package structure.adapter;

public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("我是只火鸡，我只会咯咯叫");
    }

    @Override
    public void fly() {
        System.out.println("我只会扑腾一下");
    }
}
