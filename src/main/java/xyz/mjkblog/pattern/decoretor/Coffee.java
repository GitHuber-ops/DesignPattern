package xyz.mjkblog.pattern.decoretor;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--14--5:01 PM
 */
public class Coffee extends Drink {

    public float cost() {
        return super.getPrice();
    }
}
