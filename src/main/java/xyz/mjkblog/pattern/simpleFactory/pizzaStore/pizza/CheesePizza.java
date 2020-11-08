package xyz.mjkblog.pattern.simpleFactory.pizzaStore.pizza;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--13--9:28 AM
 */
public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Prepare cheese pizza...");
    }
}
