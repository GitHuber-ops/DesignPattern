package xyz.mjkblog.pattern.build;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--13--7:47 PM
 */
public class Client {
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        HouseDirector houseDirector = new HouseDirector(commonHouse);

        House house = houseDirector.constructHouse();
    }
}
