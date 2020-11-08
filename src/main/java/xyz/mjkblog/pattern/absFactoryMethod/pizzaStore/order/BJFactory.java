package xyz.mjkblog.pattern.absFactoryMethod.pizzaStore.order;

import xyz.mjkblog.pattern.absFactoryMethod.pizzaStore.pizza.BJCheesePizza;
import xyz.mjkblog.pattern.absFactoryMethod.pizzaStore.pizza.BJGreekPizza;
import xyz.mjkblog.pattern.absFactoryMethod.pizzaStore.pizza.Pizza;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--13--12:23 PM
 */
public class BJFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza=null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
            pizza.setName("cheese");
        } else if(orderType.equals("greek")){
            pizza=new BJGreekPizza();
            pizza.setName("greek");
        }
        return pizza;
    }
}
