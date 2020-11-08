package xyz.mjkblog.pattern.adapter.objectAdapter.classAdapter;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--13--9:34 PM
 */
public class VoltageAdapter implements IVoltage5V {
    private Voltage220V voltage220V;

    VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        if (voltage220V != null) {
            int srcV = voltage220V.output220V();
            int destV = srcV / 44;
            return destV;
        }
        return -1;
    }
}
