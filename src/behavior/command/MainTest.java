package behavior.command;

public class MainTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Command command = new OrderCommand(new Chef());
        //顾客想好了点什么
        customer.setSlot(command);
        //顾客呼叫服务员 帮我上这些菜
        customer.order();
    }
}
