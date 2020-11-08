package xyz.mjkblog.pattern.bridge;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--14--3:14 PM
 */
public class OPPO implements Brand{
    public void open() {
        System.out.println("OPPO open...");
    }

    public void close() {
        System.out.println("OPPO close...");
    }

    public void call() {
        System.out.println("OPPO call...");
    }
}
