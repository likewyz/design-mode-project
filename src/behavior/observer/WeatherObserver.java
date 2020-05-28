package behavior.observer;

/**
 * @author wyz
 * <p>
 * 观察者模式：定义对象间的一种一对多的依赖关系,当一个对象的状态发生改变时, 所有依赖于它的对象都得到通知并被自动更新。
 * 主要角色：目标对象，观察者
 * <p>
 * 题目：
 * 每天都会有不同的天气，人们对于不同的天气会有不同的反应，也可能会影响不同人的行为
 * 假设 天气要下雨了，在外面的人，在家里的人会有怎么样的反应。
 */
public interface WeatherObserver {

    void update(Object arg);
}
