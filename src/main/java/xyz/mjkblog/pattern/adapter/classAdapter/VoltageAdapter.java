package xyz.mjkblog.pattern.adapter.classAdapter;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--13--9:34 PM
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {
    @Override
    public int output5V() {
        int srcV = output220V();
        int destV = srcV / 44;
        return destV;
    }
}
