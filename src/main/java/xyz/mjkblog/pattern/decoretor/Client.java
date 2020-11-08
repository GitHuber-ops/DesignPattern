package xyz.mjkblog.pattern.decoretor;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--14--5:24 PM
 */
public class Client {
    public static void main(String[] args) {
        Drink order;

        order = new LongBlack();
        order = new Milk(order);
        order = new Chocolate(order);

        System.out.println(order.getDes());
    }
}
