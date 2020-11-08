package xyz.mjkblog.pattern.singleton;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--12--8:10 PM
 */



class Singleton5 {
    private static Singleton4 instance;

    private Singleton5() {
    }

    public static Singleton4 getInstance() {
        if (instance != null) {
            synchronized (Singleton.class) {
                instance = new Singleton4();
            }
        }
        return instance;
    }
}
