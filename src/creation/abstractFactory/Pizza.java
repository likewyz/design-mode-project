package creation.abstractFactory;

import creation.abstractFactory.ingredient.dough.Dough;
import creation.abstractFactory.ingredient.sauce.Sauce;

import java.util.ArrayList;

/**
 * 问题描述
 * 披萨店在各个地区都开了店，但是对于披萨的原料不同的地区有不同的取材
 * 我们需要为不同的区域配置不同的原料工厂，原料工厂生产面团、沙司、蔬菜等等
 *
 * 抽象工厂
 * 提供一个接口，用于创建相关或依赖对象的家族，而不需要明确指定具体类
 * 抽象工厂定义了一个接口，所有的具体工厂都必须实现此接口，这个接口包含了一组方法用来生产产品
 * 通过抽象工厂所提供的接口，可以创建产品的家族，利用这个接口书写代码，我们的代码将从实际工厂解耦，
 * 以便在不同上下文实现各式各样的工厂，制造出各种不同的产品，例如：不同的区域、不同的操作系统、不同的外观以及操作
 * 因为代码从实际的产品中解耦了，所以我们可以替换不同的工厂来取得不同的行为（例如取得大蒜番茄酱料，而不是取得番茄酱料）
 *
 */

public abstract class Pizza {

    public String name;

    public Dough dough;

    public Sauce sauce;

    public abstract void prepare();

    void bake(){
        System.out.println("正在烘焙过程中");
    }

    void cut(){
        System.out.println("切成块");
    }

    void box(){
        System.out.println("打包");
    }

    public String getName() {
        return name;
    }

    public Dough getDough() {
        return dough;
    }

    public Sauce getSauce() {
        return sauce;
    }
}
