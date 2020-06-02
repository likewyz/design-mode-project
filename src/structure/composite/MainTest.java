package structure.composite;

public class MainTest {
    public static void main(String[] args) {
        MenuComponent breakfastMenu = new Menu("PANCAKE HOUSE", "Breakfast");
        MenuComponent lunchMenu = new Menu("Lunch", "Lunch");
        MenuComponent dinnerMenu = new Menu("Dinner", "Dinner");
        MenuComponent dessertMenu = new Menu("Dessert", "Dessert of course");

        MenuComponent allMenus = new Menu("ALL MENUS", "All Menus combined");
        allMenus.add(breakfastMenu);
        allMenus.add(lunchMenu);
        allMenus.add(dinnerMenu);

        dinnerMenu.add(new MenuItem("Pasta", "Spaghetti", true, 3.67));
        dinnerMenu.add(dessertMenu);

        //甜点菜单
        dessertMenu.add(new MenuItem("Apple Pie", "Apple", true, 1.58));

        //女服务员报菜名
        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
