package xyz.mjkblog.pattern.singleton;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--12--6:06 PM
 * @Description: 饿汉式（静态常量）
 */
public class Singleton1 {
    private Singleton1() {
    }

    private final static Singleton1 instance = new Singleton1();

    public static Singleton1 getInstance(){
        return instance;
    }
}
