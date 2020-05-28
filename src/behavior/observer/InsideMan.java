package behavior.observer;

/**
 * @author wyz
 */
public class InsideMan implements WeatherObserver{

    private String behavior;

    @Override
    public void update(Object arg) {
        if ((Boolean) arg){
            behavior = "我才在乎下不下雨呢";
        } else {
            behavior = "又是一个大晴天！";
        }
        System.out.println(this.behavior);
    }
}
