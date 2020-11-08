package xyz.mjkblog.pattern.factoryMethod.pizzaStore.order;

import xyz.mjkblog.pattern.factoryMethod.pizzaStore.pizza.LDCheesePizza;
import xyz.mjkblog.pattern.factoryMethod.pizzaStore.pizza.LDGreekPizza;
import xyz.mjkblog.pattern.factoryMethod.pizzaStore.pizza.Pizza;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--13--11:47 AM
 */
public class LDOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
            pizza.setName("cheese pizza");
        } else if (orderType.equals("greek")) {
            pizza = new LDGreekPizza();
            pizza.setName("greek pizza");
        }
        return pizza;
    }
}
