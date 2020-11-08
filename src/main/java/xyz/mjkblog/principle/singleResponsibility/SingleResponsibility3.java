package xyz.mjkblog.principle.singleResponsibility;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--12--9:25 AM
 */
public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle3 vehicle3 = new Vehicle3();
        vehicle3.run("motor");
        vehicle3.runWater("submarine");
        vehicle3.runAir("plane");
    }
}


class Vehicle3 {
    public void run(String vehicle) {
        System.out.println(vehicle + " is running on the road...");
    }

    public void runAir(String vehicle) {
        System.out.println(vehicle + " is running in the air...");
    }

    public void runWater(String vehicle) {
        System.out.println(vehicle + " is running in the water...");
    }
}

