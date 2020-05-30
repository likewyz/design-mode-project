package creation.factoryMethod;

import java.util.ArrayList;

/**
 * 工厂方法
 *  所有工程模式都用来封装对象的创建。
 *  工厂方法模式通过让子类决定改创建的对象是什么，来达到将对象创建的过程封装的目的。
 *  主要角色有创建者类（PizzaStore） 抽象披萨店 该类中会定义抽象方法，用来创建实体披萨
 *          产品类（Pizza） 工厂生产产品，对于PizzaStore来说，产品就是Pizza
 *
 *   问题描述
 *   披萨店经营颇佳，准备在纽约和芝加哥开分店，但是区域有差异，起司披萨在不同地区的店里可能会不一样的
 */

public abstract class Pizza {

    public String name;

    public String dough;

    public String sauce;

    public ArrayList toppings = new ArrayList();

    void prepare(){
        System.out.println("Preparing " + name);
        System.out.println("Tossing " + dough);
        System.out.println("Adding " + sauce);

        for(int i = 0; i < toppings.size(); i++){
            System.out.println("    " + toppings.get(i));
        }
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

    public String getName() {
        return name;
    }

    public String getDough() {
        return dough;
    }

    public String getSauce() {
        return sauce;
    }

    public ArrayList getToppings() {
        return toppings;
    }
}
