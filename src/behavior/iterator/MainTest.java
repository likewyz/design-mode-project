package behavior.iterator;

public class MainTest {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        LunchMenu lunchMenu = new LunchMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu, lunchMenu);

        //女服务员报餐单
        waitress.printMenu();
    }
}
