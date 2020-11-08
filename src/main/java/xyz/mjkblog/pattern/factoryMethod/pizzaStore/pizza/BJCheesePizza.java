package xyz.mjkblog.pattern.factoryMethod.pizzaStore.pizza;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--13--11:20 AM
 */
public class BJCheesePizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println("Prepare BJCheese pizza...");
    }
}
