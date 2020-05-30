package creation.singleton;

/**
 * 单例模式
 * 确保一个类只有一个实例，并提供一个全局访问点
 * 只有private构造方法，确保外部无法实例化；
 * 通过private static变量持有唯一实例，保证全局唯一性；
 * 通过public static方法返回此唯一实例，使外部调用方能获取到实例。
 *
 * 简单的getInstance 在多线程的环境中可能会存在问题，所以可以采取下面的方式来解决
 * 1.在声明 静态字段 INSTANCE 时直接new 一个对象，在getInstance直接返回，这种方式也叫做饿汉式
 * 2.在getInstance方法中加上 synchronized,使方法变成同步的
 * 3.在声明 静态字段 INSTANCE 时加上 volatile,使其在多线程的情况下全局可见
 */

public class Singleton {

    // 静态字段引用唯一实例:
    private static Singleton INSTANCE;

    // private构造方法保证外部无法实例化:
    private Singleton() {
    }

    //public static方法返回此唯一实例
    public synchronized static Singleton getInstance() {
        if (INSTANCE == null){
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

    //双重检查加锁，给INSTANCE加上volatile，在getInstance中减少使用同步
    public static Singleton getInstance2() {
        if (INSTANCE == null){
            synchronized (Singleton.class){
                if (INSTANCE == null){
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }
}
