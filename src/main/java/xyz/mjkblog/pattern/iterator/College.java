package xyz.mjkblog.pattern.iterator;

import java.util.Iterator;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--16--8:16 PM
 */
public interface College {
    public String getName();

    public void addDepartment(String name);

    public Iterator createIterator();
}
