package structure.decorator.beverage;

/**
 * 装饰者模式
 * 定义：动态地将责任附加到对象上，若要拓展功能，装饰者提供了比继承更有弹性的替代方案
 * <p>
 * 一些特征：
 * 1.装饰者和被装饰对象有相同的超类型
 * 2.因为装饰者和被装饰对象拥有一样的超类型，所以在任何需要原始对象（被包装的）的场合，可以用装饰过的对象代替它
 * 3.装饰者可以在所委托被装饰者的行为之前或者之后，加上自己的行为，以达到特定的目的
 * 4.对象可以在任何时候被装饰，所以可以在运行时动态地、不限量地用你喜欢的装饰者来装饰
 * <p>
 * 问题场景：
 * 星巴克是一家闻名的卡费连锁店，产品主要是饮料（Beverage）,饮料超类中主要是有两个方法，描述（description）以及价格（cost）
 * 购买咖啡时，也可以要求在其中加入各种调料，例如：牛奶（milk）、豆浆（soy）、摩卡（Mocha）等等
 * 对于不同的调料最后会有不同的价格，某一种调料可能还会放多次，如果在超类Beverage 定义这些调料，就会造成子类复杂的计算，也不好拓展
 * <p>
 * 基于上述的特征，咖啡子类可以作为被装饰者，调料可以作为装饰者，同样继承一个超类，并作为属性设置进调料类中，并在计算价格的过程中
 * 委托属性来计算属性的价格
 */
public abstract class Beverage {

    String description = "UNKNOWN";

    public String getDescription() {
        return description;
    }

    //价格抽象方法需要被子类实现
    public abstract double cost();
}
