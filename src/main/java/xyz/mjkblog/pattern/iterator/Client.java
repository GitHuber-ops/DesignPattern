package xyz.mjkblog.pattern.iterator;

import java.util.ArrayList;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--16--8:38 PM
 */
public class Client {
    public static void main(String[] args) {
        ArrayList<College> collegeList = new ArrayList<>();

        ComputerCollege computerCollege = new ComputerCollege();

        collegeList.add(computerCollege);

        OutputImpl output = new OutputImpl(collegeList);
    }
}
