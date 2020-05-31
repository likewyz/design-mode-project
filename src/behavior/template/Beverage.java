package behavior.template;

/**
 * 模板模式
 * 在一个方法中定义一个算法的骨架，而将一些步骤延迟到子类中。
 * 模板方法使得子类可以在不改变算法结构的情况下，重新定义算法中的默写步骤。
 *
 * 问题描述
 * 咖啡店有咖啡和茶，两者基本有着同样的制作顺序
 * 1.烧水
 * 2.泡茶
 * 3.倒入杯中
 * 4.加入配料
 *
 * 咖啡和茶都需要烧水和倒入杯中，但是brew的过程不一样，最后一步调料茶可以不放，咖啡可以放咖啡伴侣之类的
 *
 * addCondiment() 俗称 “钩子”， 子类可以选择性地重写
 *
 * 好莱坞原则： 别调用我们，我们会调用你
 * 允许低层组件将自己挂钩到系统上，但是高层组件会决定什么时候和怎样使用这些低层组件。
 */
public abstract class Beverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiment();
    }

    //泡茶
    abstract void brew();

    //加调料
    void addCondiment(){};

    //烧水
    void boilWater(){
        System.out.println("烧了壶开水");
    }

    //倒进茶杯
    void pourInCup(){
        System.out.println("倒进杯子");
    }

}
