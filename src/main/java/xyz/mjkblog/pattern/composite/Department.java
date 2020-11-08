package xyz.mjkblog.pattern.composite;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--14--9:12 PM
 */
public class Department extends OrganizationComponent {
    public Department(String name, String description) {
        super(name, description);
    }

    @Override
    protected void print() {

    }
}
