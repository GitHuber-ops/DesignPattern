package xyz.mjkblog.pattern.absFactoryMethod.pizzaStore.order;

import xyz.mjkblog.pattern.absFactoryMethod.pizzaStore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--13--1:24 PM
 */
public class OrderPizza {
    AbsFactory absFactory;

    public void setAbsFactory(AbsFactory absFactory) {
        this.absFactory = absFactory;
        String orderType;
        Pizza pizza;

        do {
            orderType = getType();
            pizza = absFactory.createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("No such type...");
                break;
            }
        } while (true);
    }

    private String getType() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Input pizza type: ");
            String pizzaType = bufferedReader.readLine();
            return pizzaType;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
