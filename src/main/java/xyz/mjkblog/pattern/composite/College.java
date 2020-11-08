package xyz.mjkblog.pattern.composite;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--14--9:17 PM
 */
public class College extends OrganizationComponent {
    public College(String name, String description) {
        super(name, description);
    }

    @Override
    protected void print() {

    }
}
