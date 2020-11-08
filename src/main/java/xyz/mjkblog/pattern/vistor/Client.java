package xyz.mjkblog.pattern.vistor;

import java.io.ObjectOutputStream;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--16--6:40 PM
 */
public class Client {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();

        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());


        Success success = new Success();
        objectStructure.diaPlay(success);
    }
}
