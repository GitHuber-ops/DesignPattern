package xyz.mjkblog.pattern.simpleFactory.pizzaStore.order;

import xyz.mjkblog.pattern.simpleFactory.pizzaStore.pizza.CheesePizza;
import xyz.mjkblog.pattern.simpleFactory.pizzaStore.pizza.GreekPizza;
import xyz.mjkblog.pattern.simpleFactory.pizzaStore.pizza.Pizza;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--13--10:34 AM
 */
public class SimpleFactory {
    public Pizza createPizza(String orderType){
        Pizza pizza = null;
        //订购的类型
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("greek pizza");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("cheese pizza");
        }
        return pizza;
    }
}
