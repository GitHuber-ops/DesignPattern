package xyz.mjkblog.pattern.memento;

import lombok.Getter;
import lombok.Setter;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--17--3:46 PM
 */
@Getter
@Setter
public class Originator {
    private String state;

    public Memento saveMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento){
        this.state=memento.getState();
    }
}
