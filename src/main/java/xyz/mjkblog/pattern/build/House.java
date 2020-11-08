package xyz.mjkblog.pattern.build;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--13--7:27 PM
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class House {
    private String base;
    private String wall;
    private String roofed;
}
