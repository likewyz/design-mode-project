package structure.facade;

/**
 * 外观模式
 *  提供了一个统一的接口，用来访问子系统中的一群接口。外观定义了一个高层接口，让子系统更容易使用。
 *
 *  问题描述
 *  假如你想要吃饭，首先你要去买菜，其次你要准备食材，切菜、再者你要用电饭煲烧饭，最后你要煤气灶烧菜
 *
 *  想要使用外观模式，我们创建了一个接口简化而统一的类，用来包装子系统中一个或多个复杂的类，
 *  外观模式允许我们让客户和子系统之间避免耦合。
 *
 *  “最少知识”原则
 *  要减少对象之间的交互，只留下几个“密友”
 */
public class Facade {

    //开车去买菜
    Car car;

    //用菜刀切菜
    Knife knife;

    //用电饭煲煮饭
    ElectricCooker electricCooker;

    //用炒锅烧菜
    CookPot cookPot;

    public Facade(Car car, Knife knife, ElectricCooker electricCooker, CookPot cookPot) {
        this.car = car;
        this.knife = knife;
        this.electricCooker = electricCooker;
        this.cookPot = cookPot;
    }

    /**
     * 将复杂的过程封装成一个方法暴露给外部
     */
    public void cookDinner(){
        System.out.println("开始准备晚饭");
        car.driveToMarket();
        knife.cutUp();
        electricCooker.cookRice();
        cookPot.cookFood();
    }
}
