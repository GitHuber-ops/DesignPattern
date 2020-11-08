package xyz.mjkblog.pattern.absFactoryMethod.pizzaStore.order;

import xyz.mjkblog.pattern.absFactoryMethod.pizzaStore.pizza.*;

import java.util.Calendar;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--13--1:23 PM
 */
public class LDFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza=null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
            pizza.setName("cheese");
        } else if(orderType.equals("greek")){
            pizza=new LDGreekPizza();
            pizza.setName("greek");
        }
        return pizza;
    }
}


