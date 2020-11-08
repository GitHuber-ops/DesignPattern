package xyz.mjkblog.pattern.prototype;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--13--2:34 PM
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep tom = new Sheep("Tom", 1);

        Sheep sheep2= (Sheep) tom.clone();
    }
}
