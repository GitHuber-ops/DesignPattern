package xyz.mjkblog.pattern.composite;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--14--8:52 PM
 */
@AllArgsConstructor
@Setter
@Getter
public abstract class OrganizationComponent {
    private String name;
    private String description;

    protected void add(OrganizationComponent organizationComponent) {
        throw new UnsupportedOperationException();
    }

    protected void remove(OrganizationComponent organizationComponent){
        throw new UnsupportedOperationException();
    }

    protected abstract void print();

}
