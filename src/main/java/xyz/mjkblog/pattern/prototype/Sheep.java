package xyz.mjkblog.pattern.prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--13--2:27 PM
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Sheep implements Cloneable{
    String name;
    int age;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
