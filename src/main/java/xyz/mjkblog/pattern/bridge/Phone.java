package xyz.mjkblog.pattern.bridge;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--14--3:15 PM
 */
public abstract class Phone {
    private Brand brand;

    Phone(Brand brand) {
        this.brand = brand;
    }

    protected void open() {
        brand.open();
    }

    protected void close() {
        brand.open();
    }

    protected void call() {
        brand.open();
    }
}
