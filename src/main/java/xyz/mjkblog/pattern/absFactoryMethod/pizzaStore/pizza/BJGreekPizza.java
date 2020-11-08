package xyz.mjkblog.pattern.absFactoryMethod.pizzaStore.pizza;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--13--11:21 AM
 */
public class BJGreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Prepare BJGreekPizza...");
    }
}
