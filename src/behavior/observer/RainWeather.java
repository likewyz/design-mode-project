package behavior.observer;


import java.util.ArrayList;
import java.util.List;

/**
 * @author wyz
 * 下雨天
 */
public class RainWeather {

    /**
     * 用来保存注册的观察者对象，也就是不同的人
     */
    private List<WeatherObserver> observers = new ArrayList<>();

    private boolean rainFlag;

    public boolean isRainFlag() {
        return rainFlag;
    }

    public void setRainFlag(boolean rainFlag) {
        this.rainFlag = rainFlag;
        //在天气改变时，通知所有的注册者
        notifyObservers();
    }

    /**
     * 不同的人需要订阅天气，先要注册
     *
     * @param observer 不同的人
     */
    public void attach(WeatherObserver observer) {
        observers.add(observer);
    }

    /**
     * 有些人可能原来在意天气，现在不在意了，就不注册了
     *
     * @param observer 不同的人
     */
    public void detach(WeatherObserver observer) {
        observers.remove(observer);
    }

    /**
     * 每当天气下雨时，就需要通知所有的注册者
     */
    private void notifyObservers() {
        for (WeatherObserver observer : observers) {
            observer.update(this.rainFlag);
        }
    }
}
