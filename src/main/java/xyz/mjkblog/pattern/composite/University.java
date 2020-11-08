package xyz.mjkblog.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--14--8:56 PM
 */
public class University extends OrganizationComponent {
    List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();

    public University(String name, String description) {
        super(name, description);
    }

    protected void print() {
        System.out.println(getName());
        organizationComponents.forEach(System.out::println);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent){
        organizationComponents.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent){
        organizationComponents.remove(organizationComponent);
    }
}
