package xyz.mjkblog.pattern.vistor;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--16--6:20 PM
 */
public class Success extends Action {
    public void getManConclusion(Man man) {
        System.out.println("Man: great...");
    }

    public void getWomanConclusion(Woman women) {
        System.out.println("Woman: great...");
    }
}
