package behavior.observer;

/**
 * @author wyz
 */
public class OutsideMan implements WeatherObserver{

    private String behavior;

    @Override
    public void update(Object arg) {
        if ((Boolean) arg){
            behavior = "下雨了，赶紧回家！";
        } else {
            behavior = "我还能继续浪！";
        }
        System.out.println(this.behavior);
    }
}
