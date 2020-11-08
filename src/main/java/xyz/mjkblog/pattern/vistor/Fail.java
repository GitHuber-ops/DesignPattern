package xyz.mjkblog.pattern.vistor;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--16--6:21 PM
 */
public class Fail extends Action {
    public void getManConclusion(Man man) {
        System.out.println("Man: normal...");
    }

    public void getWomanConclusion(Woman women) {
        System.out.println("Woman: normal...");
    }
}
