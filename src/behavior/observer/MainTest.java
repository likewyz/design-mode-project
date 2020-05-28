package behavior.observer;

/**
 * @author wyz
 */
public class MainTest {

    public static void main(String[] args){
        RainWeather rainWeather = new RainWeather();

        //注册
        rainWeather.attach(new InsideMan());
        rainWeather.attach(new OutsideMan());

        //下雨了
        rainWeather.setRainFlag(true);

        System.out.println("=====================================================");

        //雨停了
        rainWeather.setRainFlag(false);
    }
}
