package xyz.mjkblog.pattern.factoryMethod.pizzaStore.order;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--13--11:49 AM
 */
public class PizzaStore {
    public static void main(String[] args) {
        BJOrderPizza bjOrderPizza = new BJOrderPizza();
        bjOrderPizza.orderPizza();
    }
}
