package xyz.mjkblog.pattern.facade;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--15--10:56 AM
 */
public class Popcorn {
    private final static Popcorn instance = new Popcorn();

    private Popcorn() {
    }

    public static Popcorn getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("Popcorn on...");
    }

    public void off() {
        System.out.println("Popcorn off...");
    }

    public void pop() {
        System.out.println("Popcorn pop...");
    }
}
