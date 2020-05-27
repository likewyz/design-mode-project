package behavior.strategy;

/**
 * 蓝鸭子颜色是红的，又会游泳又会叫
 *
 * 蓝鸭子的具体行为实现类 在BlueDuck对象new之后设置
 */
public class BlueDuck extends BaseDuck{


    @Override
    public void display() {
        System.out.println("我是蓝色的");
    }
}
