package xyz.mjkblog.pattern.factoryMethod.pizzaStore.pizza;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--13--11:21 AM
 */
public class BJGreekPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("Prepare BJGreekPizza...");
    }
}
