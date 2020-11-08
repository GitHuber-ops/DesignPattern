package xyz.mjkblog.pattern.decoretor;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--14--5:05 PM
 */
public class Decorator extends Drink {
    private Drink obj;

    public Decorator(Drink obj) {
        this.obj = obj;
    }

    public float cost() {
        return super.getPrice() + obj.cost();
    }

    public String getDes() {
        return super.getDes() + " " + super.getPrice() + " && " + obj.getDes();
    }
}

