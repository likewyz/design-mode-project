package behavior.command;

/**
 * 点餐
 */
public class OrderCommand implements Command{

    Chef chef;

    public OrderCommand(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void execute() {
        System.out.println("厨师要烧这些菜！");
        chef.cook();
    }
}
