package xyz.mjkblog.pattern.bridge;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--14--3:13 PM
 */
public class XiaoMi implements Brand {
    public void open() {
        System.out.println("Xiaomi open...");
    }

    public void close() {
        System.out.println("Xiaomi close...");
    }

    public void call() {
        System.out.println("XiaoMi call...");
    }
}
