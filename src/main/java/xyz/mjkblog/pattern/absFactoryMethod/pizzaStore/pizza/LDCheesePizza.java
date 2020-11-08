package xyz.mjkblog.pattern.absFactoryMethod.pizzaStore.pizza;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--13--11:22 AM
 */
public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Prepare LDCheesePizza...");
    }
}
