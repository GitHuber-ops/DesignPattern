package xyz.mjkblog.pattern.simpleFactory.pizzaStore.pizza;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--13--9:30 AM
 */
public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Prepare greek pizza...");
    }
}
