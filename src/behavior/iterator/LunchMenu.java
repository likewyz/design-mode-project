package behavior.iterator;

import java.util.Iterator;

/**
 * 餐厅午餐菜单
 */
public class LunchMenu implements Menu{

    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public LunchMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT", "Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("BLT", "tomato on whole wheat", false, 2.99);
        addItem("Soup of the day", "with a side of potato salad", false, 2.99);
    }

    @Override
    public Iterator createIterator() {
        return new LunchMenuIterator(menuItems);
    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS){
            System.out.println("餐单已经满了！");
            return;
        }
        menuItems[numberOfItems] = menuItem;
        numberOfItems +=1;
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }
}
