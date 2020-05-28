package structure.decorator.comdiment;

import structure.decorator.beverage.Beverage;

/**
 * @author wyz
 * 抽象装饰者类 表示所有调料的超类
 */
public abstract class CondimentDecorator extends Beverage {

    /**
     * 重新声明抽象方法，用来表述此调味料，当然也可以用其他的方法，在此抽象类中，可以定义一些额外的方法用于功能的拓展
     */
    public abstract String getDescription();
}
