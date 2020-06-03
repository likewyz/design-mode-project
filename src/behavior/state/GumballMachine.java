package behavior.state;

/**
 * 糖果机
 * 会有不同的状态，也会有一个初始的糖果库存
 */
public class GumballMachine {

    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;

    State state = soldOutState;
    int count;

    public GumballMachine(int count) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuartersState(this);
        soldState = new SoldState(this);

        this.count = count;
        if (count > 0){
            state = noQuarterState;
        }
    }


    //塞入硬币
    void insertQuarter(){
        state.insertQuarter();
    }

    //退出硬币
    void ejectQuarter(){
        state.ejectQuarter();
    }

    //转动曲柄
    void turnCrank(){
        state.turnCrank();
        state.dispense();
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    //辅助方法，释放糖果
    public void releaseBall(){
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0){
            count = count - 1;
        }
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
                "state=" + state +
                ", count=" + count +
                '}';
    }
}
