package xyz.mjkblog.pattern.decoretor;

import lombok.Getter;
import lombok.Setter;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--14--4:58 PM
 */

@Setter
@Getter
public abstract class Drink {
    public String des;
    private float price=0.0f;

    public abstract float cost();
}
