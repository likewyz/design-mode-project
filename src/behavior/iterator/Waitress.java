package behavior.iterator;

import java.util.Iterator;

/**
 * 女服务员
 */
public class Waitress {
    Menu pancakeHouseMenu;
    Menu lunchMenu;

    public Waitress(Menu pancakeHouseMenu, Menu lunchMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.lunchMenu = lunchMenu;
    }

    public void printMenu(){
        Iterator pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
        Iterator lunchMenuIterator = lunchMenu.createIterator();
        System.out.println("MENU\n--------\nBREAKFAST");
        printMenu(pancakeHouseMenuIterator);
        System.out.println("\nLUNCH");
        printMenu(lunchMenuIterator);
    }

    private void printMenu(Iterator iterator){
        MenuItem menuItem;
        while (iterator.hasNext()){
            menuItem = (MenuItem)iterator.next();
            System.out.println(menuItem.getName() + ", ");
            System.out.println(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
