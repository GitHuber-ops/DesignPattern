package xyz.mjkblog.pattern.iterator;

import java.util.Iterator;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--16--7:56 PM
 */
public class ComputerCollegeIterator implements Iterator {
    Department[] department;
    int position;

    public ComputerCollegeIterator(Department[] department) {
        this.department = department;
    }

    @Override
    public boolean hasNext() {
        return position > 0;
    }

    @Override
    public Object next() {
        return department[position++];
    }
}
