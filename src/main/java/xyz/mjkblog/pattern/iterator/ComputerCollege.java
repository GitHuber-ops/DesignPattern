package xyz.mjkblog.pattern.iterator;

import java.util.Iterator;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--16--8:17 PM
 */
public class ComputerCollege implements College {
    Department[] departments;
    int departmentNumber;

    ComputerCollege(){
        departments=new Department[5];
    }
    @Override
    public String getName() {
        return "Computer college...";
    }

    @Override
    public void addDepartment(String name) {
        departments[departmentNumber++] = new Department("computer college");
    }

    @Override
    public Iterator createIterator() {
        return null;
    }
}
