package behavior.command;

/**
 * 顾客
 */
public class Customer {

    Command slot;

    public Customer() {}

    public void setSlot(Command slot) {
        this.slot = slot;
    }

    /**
     * 当顾客点餐之后，服务员就会将点餐单交到厨师手上，厨师就可以开始工作了
     */
    public void order(){
        System.out.println("服务员我要点菜！");
        slot.execute();
    }
}
