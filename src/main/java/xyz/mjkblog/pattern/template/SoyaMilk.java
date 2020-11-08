package xyz.mjkblog.pattern.template;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--16--11:00 AM
 */
public abstract class SoyaMilk {
    public void make(){
        add();
        heat();
    }

    public abstract void add();

    public abstract void heat();
}
