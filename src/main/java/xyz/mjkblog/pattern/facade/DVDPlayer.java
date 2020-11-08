package xyz.mjkblog.pattern.facade;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--15--10:52 AM
 */
public class DVDPlayer {
    private final static DVDPlayer instance = new DVDPlayer();

    private DVDPlayer() {
    }

    public static DVDPlayer getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("DVD on...");
    }

    public void off() {
        System.out.println("DVD off...");
    }

    public void play() {
        System.out.println("DVD play...");
    }
}
