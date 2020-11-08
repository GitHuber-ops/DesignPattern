package xyz.mjkblog.pattern.factoryMethod.pizzaStore.pizza;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--13--11:23 AM
 */
public class LDGreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Prepare LDGreek pizza...");
    }
}
