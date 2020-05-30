package creation.abstractFactory.ingredient.dough;

public class FatDough implements Dough{
    @Override
    public void size() {
        System.out.println("我是胖面团");
    }
}
