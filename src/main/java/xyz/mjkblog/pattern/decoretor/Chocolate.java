package xyz.mjkblog.pattern.decoretor;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--14--5:11 PM
 */
public class Chocolate extends Decorator {
    public Chocolate(Drink obj) {
        super(obj);
        setDes("chocolate");
        setPrice(3.0f);
    }
}
