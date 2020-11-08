package xyz.mjkblog.pattern.singleton;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--12--7:48 PM
 */
public class Singleton2 {
    private Singleton2() {
    }

    private static Singleton2 instance;

    static {
        instance = new Singleton2();
    }

    public Singleton2 getInstance() {
        return instance;
    }
}
