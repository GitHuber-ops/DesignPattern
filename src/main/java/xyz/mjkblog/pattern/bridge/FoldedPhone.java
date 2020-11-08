package xyz.mjkblog.pattern.bridge;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--14--3:19 PM
 */
public class FoldedPhone extends Phone {
    FoldedPhone(Brand brand) {
        super(brand);
    }

    public void open() {
        super.open();
        System.out.println("folded phone...");
    }

    public void close() {
        super.close();
        System.out.println("folded phone...");
    }

    public void call() {
        super.call();
        System.out.println("folded phone...");
    }
}
