package structure.proxy;

import java.lang.reflect.Proxy;

public class MainTest {
    public static void main(String[] args) {
        PersonBean people = new PersonBeanImpl();
        people.setName("wyz");
        ProxyInvocationHandler handler = new ProxyInvocationHandler(people);

        PersonBean proxy = (PersonBean)Proxy.newProxyInstance(people.getClass().getClassLoader(), people.getClass().getInterfaces(), handler);
        proxy.getName();
    }
}
