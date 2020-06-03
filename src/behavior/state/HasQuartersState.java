package behavior.state;

/**
 * 有硬币状态
 */
public class HasQuartersState implements State{

    GumballMachine gumballMachine;

    public HasQuartersState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    //已经塞过硬币
    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    //退硬币，进入无硬币状态
    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    //转动曲柄进入出售状态
    @Override
    public void turnCrank() {
        System.out.println("You turned...");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    //还没转动曲柄呢
    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
