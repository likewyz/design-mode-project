package structure.composite;

/**
 * 组合模式
 * 允许你讲对象组合成树形结构来表现“整体/部分”层次结构。组合能让客户以一致的方式处理个别对象以及对象组合
 *
 * 问题描述
 * 一个餐厅有不同的餐单，早餐、午餐、晚餐
 * 每个餐单中可能会存在子菜单，比如晚餐可能会有甜品餐单。
 * 每个餐单中也包含了一些菜目以及它的子菜单
 *
 * 菜单组件的抽象类；
 * 菜单组件的角色是为叶节点和组合节点提供一个共同的接口。
 * 如果菜单项（叶节点） 或者菜单（组合）不想实现某些方法的时候（例如叶节点不想实现getChild()方法），就可以不实现
 */
public abstract class MenuComponent {
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    //打印菜单 内部自行遍历
    public void print() {
        throw new UnsupportedOperationException();
    }

}

