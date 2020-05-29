package creation.simpleFactory;

public class MainTest {

    public static void main(String[] args) {
        //声明一个普通披萨店
        PizzaStore store = new PizzaStore(new SimplePizzaFactory());

        //当用户想要一个 起司披萨时
        store.orderPizza("cheese");
    }
}
