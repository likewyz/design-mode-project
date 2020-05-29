package creation.simpleFactory;

public class GreekPizza extends Pizza{

    @Override
    public void addCondiments() {
        System.out.println("加点 希腊风味");
    }
}
