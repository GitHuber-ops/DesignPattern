package xyz.mjkblog.pattern.factoryMethod.pizzaStore.order;

import xyz.mjkblog.pattern.factoryMethod.pizzaStore.pizza.BJCheesePizza;
import xyz.mjkblog.pattern.factoryMethod.pizzaStore.pizza.BJGreekPizza;
import xyz.mjkblog.pattern.factoryMethod.pizzaStore.pizza.Pizza;


/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--13--11:43 AM
 */
public class BJOrderPizza extends OrderPizza{

    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza=null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
            pizza.setName("cheese pizza");
        } else if (orderType.equals("greek")) {
            pizza = new BJGreekPizza();
            pizza.setName("greek pizza");
        }
        return pizza;
    }
}
