package xyz.mjkblog.pattern.bridge;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--14--3:26 PM
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new FoldedPhone(new OPPO());
    }
}
