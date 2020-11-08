package xyz.mjkblog.pattern.simpleFactory.pizzaStore.order;

import xyz.mjkblog.pattern.simpleFactory.pizzaStore.pizza.CheesePizza;
import xyz.mjkblog.pattern.simpleFactory.pizzaStore.pizza.GreekPizza;
import xyz.mjkblog.pattern.simpleFactory.pizzaStore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--13--9:32 AM
 */
public class OrderPizza {
    public void orderPizza() {
        SimpleFactory simpleFactory = new SimpleFactory();
        do {
            String orderType = getType();
            Pizza pizza = simpleFactory.createPizza(orderType);
            if (pizza!=null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("No such pizza...");
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
