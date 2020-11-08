package xyz.mjkblog.pattern.build;

import java.lang.invoke.VarHandle;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--13--7:30 PM
 */
public abstract class HouseBuilder {
    protected House house=new House();

    public abstract void buildBase();
    public abstract void buildWalls();
    public abstract void roofed();

    public House buildHouse(){
        return house;
    }
}
