package xyz.mjkblog.pattern.memento;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--17--3:55 PM
 */
public class Client {
    public static void main(String[] args) {
        Originator originator=new Originator();
        CareTaker careTaker=new CareTaker();

        originator.setState("001...");

        careTaker.add(originator.saveMemento());
    }


}
