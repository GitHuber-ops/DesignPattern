package xyz.mjkblog.principle.singleResponsibility;

import javax.swing.tree.VariableHeightLayoutCache;
import java.sql.Date;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--12--9:25 AM
 */
public class SingleResponsibility {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("motor");
        vehicle.run("car");
        vehicle.run("plane");
    }
}


class Vehicle{
    public void run(String vehicle){
        System.out.println(vehicle + " is running on the road...");
    }
}
