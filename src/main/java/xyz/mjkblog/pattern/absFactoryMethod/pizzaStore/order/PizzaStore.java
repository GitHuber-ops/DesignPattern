package xyz.mjkblog.pattern.absFactoryMethod.pizzaStore.order;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--13--1:33 PM
 */
public class PizzaStore {
    public static void main(String[] args) {
        OrderPizza orderPizza = new OrderPizza();
        orderPizza.setAbsFactory(new BJFactory());
    }
}
