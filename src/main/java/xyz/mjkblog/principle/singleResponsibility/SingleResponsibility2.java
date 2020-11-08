package xyz.mjkblog.principle.singleResponsibility;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--12--9:25 AM
 */
public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("motor");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("plane");
        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("submarine");
    }
}


class RoadVehicle{
    public void run(String vehicle) {
        System.out.println(vehicle + " is running on the road...");
    }
}

class AirVehicle{
    public void run(String vehicle) {
        System.out.println(vehicle + " is running in the air...");
    }
}

class WaterVehicle{
    public void run(String vehicle) {
        System.out.println(vehicle + " is running in the water...");
    }
}
