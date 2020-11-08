package xyz.mjkblog.pattern.flyWeight;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--15--2:18 PM
 */
public class ConcreteWebSite extends WebSite {

    public String type;

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    public void use() {
        System.out.println("Concrete website...");
    }
}
