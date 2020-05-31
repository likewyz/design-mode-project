package behavior.command;

/**
 * 命令模式
 * 将”请求“封装成对象，以便使用不同的请求，队列或者日志来参数化其他对象。命令模式也支持可撤销的操作
 *
 * 问题场景
 * 举例披萨店，发送请求的是顾客，顾客需要点餐，服务员接收到顾客的指令之后，会生产点餐单，
 * 这里的点餐单就是Command, 那么谁来执行呢？服务员会将点餐单交给厨师，厨师会执行execute,
 * 当然一般餐厅是不会支持取消订单的，除非厨师还没开始做，不过可以适用在其他场景，比如遥控板
 *
 * 好处在于，顾客不需要我是怎么得到这些菜的，比如我点了一个汉堡，又叫了一杯可乐，这可以是两个指令
 * 顾客不需要谁来烧这个汉堡，谁来灌可乐，只需要发指令就能拿到最后的东西
 *
 * 这种形式其实类似于 线程池中的任务队列
 */
public interface Command {
    void execute();
}
