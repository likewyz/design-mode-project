package structure.facade;

public class MainTest {

    public static void main(String[] args) {
        Facade facade = new Facade(new Car(), new Knife(), new ElectricCooker(), new CookPot());

        facade.cookDinner();
    }
}
