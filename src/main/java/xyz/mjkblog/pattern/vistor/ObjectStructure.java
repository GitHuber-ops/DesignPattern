package xyz.mjkblog.pattern.vistor;

import javax.swing.tree.VariableHeightLayoutCache;
import java.util.LinkedList;
import java.util.List;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--16--6:28 PM
 */
public class ObjectStructure {
    private List<Person> personList= new LinkedList<>();

    public void attach(Person person) {
        personList.add(person);
    }

    public void detach(Person person) {
        personList.remove(person);
    }

    public void diaPlay(Action action) {
        for (Person person : personList) {
            person.accept(action);
        }
    }
}
