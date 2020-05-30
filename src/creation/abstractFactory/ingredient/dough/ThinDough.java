package creation.abstractFactory.ingredient.dough;

public class ThinDough implements Dough{

    @Override
    public void size() {
        System.out.println("我是瘦面团");
    }
}
