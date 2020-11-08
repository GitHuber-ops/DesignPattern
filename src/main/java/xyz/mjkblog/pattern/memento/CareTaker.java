package xyz.mjkblog.pattern.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--17--3:51 PM
 */
public class CareTaker {
    private List<Memento> mementoList=new ArrayList<>();

    public void add(Memento memento) {
        mementoList.add(memento);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }

    public void remove(Memento memento) {
        mementoList.remove(memento);
    }

}
