package xyz.mjkblog.pattern.build;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--13--7:42 PM
 */
public class HouseDirector {
    HouseBuilder houseBuilder=null;

    HouseDirector(HouseBuilder houseBuilder){
        this.houseBuilder=houseBuilder;
    }

    public House constructHouse(){
        houseBuilder.buildBase();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }
}
