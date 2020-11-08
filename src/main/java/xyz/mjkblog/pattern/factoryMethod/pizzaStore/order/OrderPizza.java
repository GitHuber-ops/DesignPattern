package xyz.mjkblog.pattern.factoryMethod.pizzaStore.order;

import xyz.mjkblog.pattern.factoryMethod.pizzaStore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--13--11:24 AM
 */
public abstract class OrderPizza {
    public void orderPizza() {
        do {
            String orderType = getType();
            Pizza pizza = createPizza(orderType);
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

    abstract xyz.mjkblog.pattern.factoryMethod.pizzaStore.pizza.Pizza createPizza(String orderType);

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