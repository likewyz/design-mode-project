package behavior.template;

public class Coffee extends Beverage{

    @Override
    void brew() {
        System.out.println("我是咖啡，我要慢慢研磨，冲泡");
    }

    public void addCondiment(){
        System.out.println("我要加点咖啡伴侣");
    }
}
