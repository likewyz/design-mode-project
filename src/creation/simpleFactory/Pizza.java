package creation.simpleFactory;

/**
 * 简单工厂：
 *  简单工厂其实不是一个设计模式，反而比较像是一种编程习惯
 * 通常情况下，可以将生成对象抽成一个函数，放在工厂类当中，调用者只要调用此方法就能获得对应的对象
 *
 * 问题描述：
 * A村的披萨店会有不同的披萨，起司披萨、希腊披萨、意大利香肠披萨等等
 * 披萨的制造过程有准备、烘焙、切割、包装
 * 具体类 披萨店会根据顾客的要求制造不同的披萨，将此变化的过程单独抽成一个方法，在简单工厂中实现
 *
 */

public abstract class Pizza {

    public abstract void addCondiments();

    void prepare(){
        System.out.println("我已经做好准备工作了");
    }

    void bake(){
        System.out.println("正在烘焙过程中");
    }

    void cut(){
        System.out.println("切成块");
    }

    void box(){
        System.out.println("打包");
    }
}
