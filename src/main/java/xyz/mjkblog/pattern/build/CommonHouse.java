package xyz.mjkblog.pattern.build;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--13--7:35 PM
 */
public class CommonHouse extends HouseBuilder {

    @Override
    public void buildBase() {
        System.out.println("common house base...");
    }

    @Override
    public void buildWalls() {
        System.out.println("common house walls...");
    }

    @Override
    public void roofed() {
        System.out.println("common house roof...");
    }
}
