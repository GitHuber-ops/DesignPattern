package xyz.mjkblog.pattern.memento;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--17--3:47 PM
 */
@AllArgsConstructor
@Setter
@Getter
public class Memento {
    private String state;
}
