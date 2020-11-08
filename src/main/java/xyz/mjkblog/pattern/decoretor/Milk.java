package xyz.mjkblog.pattern.decoretor;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--14--5:24 PM
 */
public class Milk extends Decorator {
    public Milk(Drink obj) {
        super(obj);
        setDes("milk");
        setPrice(2.0f);
    }
}
