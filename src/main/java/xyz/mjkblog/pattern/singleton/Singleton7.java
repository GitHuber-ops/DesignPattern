package xyz.mjkblog.pattern.singleton;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--12--8:44 PM
 */
class Singleton7 {
    private Singleton7() {
    }

    private static class SingletonInstance {
        private static final Singleton7 INSTANCE = new Singleton7();
    }

    public static Singleton7 getInstance() {
        return SingletonInstance.INSTANCE;
    }
}