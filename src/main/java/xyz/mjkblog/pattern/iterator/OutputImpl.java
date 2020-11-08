package xyz.mjkblog.pattern.iterator;

import lombok.AllArgsConstructor;

import java.util.Iterator;
import java.util.List;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--16--8:27 PM
 */
@AllArgsConstructor
public class OutputImpl {
    List<College> collegeList;

    public void printDepartment(Iterator<College> iterator) {
        iterator.forEachRemaining(System.out::println);

    }

    public void printCollege() {
        Iterator<College> iterator = collegeList.iterator();
        iterator.forEachRemaining(System.out::println);
    }
}
