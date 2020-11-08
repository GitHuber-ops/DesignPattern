package xyz.mjkblog.pattern.adapter.objectAdapter.classAdapter;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--13--9:37 PM
 */
public class Phone {
    public void charging(IVoltage5V iVoltage5V) {
        if (iVoltage5V.output5V() == 5) {
            System.out.println("5V");
        }
    }
}
