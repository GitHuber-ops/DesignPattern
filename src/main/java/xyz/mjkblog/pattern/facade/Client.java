package xyz.mjkblog.pattern.facade;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--15--11:14 AM
 */
public class Client {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
    }
}
