package xyz.mjkblog.pattern.vistor;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--16--6:19 PM
 */
public class Man extends Person {
    public void accept(Action action) {
        action.getManConclusion(this);
    }
}
