package xyz.mjkblog.pattern.simpleFactory.pizzaStore.pizza;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--13--9:25 AM
 */
public abstract class Pizza {
    protected String name;

    public abstract void prepare();

    public void bake() {
        System.out.println(name + " baking...");
    }

    public void cut() {
        System.out.println(name + " cutting...");
    }

    public void box() {
        System.out.println(name + " boxing...");
    }

    public void setName(String name) {
        this.name = name;
    }
}
