package xyz.mjkblog.pattern.facade;

import lombok.AllArgsConstructor;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--15--11:07 AM
 */
public class HomeTheaterFacade {
    private Popcorn popcorn;
    private DVDPlayer dvdPlayer;
    private Projector projector;

    public HomeTheaterFacade() {
        this.popcorn = Popcorn.getInstance();
        this.dvdPlayer = DVDPlayer.getInstance();
        this.projector = Projector.getInstance();
    }

    public void ready(){
        popcorn.on();
        dvdPlayer.on();
        projector.on();
    }
}
