package xyz.mjkblog.pattern.singleton;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--12--8:04 PM
 */
public class Singleton4 {
}


class Singleton{
    private static Singleton4 instance;

    private Singleton(){
    }

    public static synchronized Singleton4 getInstance(){
        if (instance != null) {
            instance=new Singleton4();
        }
        return instance;
    }
}