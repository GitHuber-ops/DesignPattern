package xyz.mjkblog.pattern.absFactoryMethod.pizzaStore.order;

import xyz.mjkblog.pattern.absFactoryMethod.pizzaStore.pizza.Pizza;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--13--12:21 PM
 */
public interface AbsFactory {
    public Pizza createPizza(String orderType);
}
