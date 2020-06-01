package behavior.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 煎饼店的餐单是list 直接支持Iterator
 */
public class PancakeHouseMenu implements Menu{
    List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();
        addItem("A Pancake", "with eggs and toast", true, 2.99);
        addItem("B Pancake", "with eggs and sausage", false, 3.99);
        addItem("C Pancake", "with fresh blueberries", true, 4.99);
        addItem("D Pancake", "with strawberries", true, 5.99);
    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    @Override
    public Iterator createIterator() {
        return menuItems.iterator();
    }
}
