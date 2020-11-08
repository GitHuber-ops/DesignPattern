package xyz.mjkblog.pattern.command;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--16--2:07 PM
 */
public class LightOffCommand implements Command{
    LightReceiver lightReceiver;

    public void execute() {
        lightReceiver.off();
    }

    public void undo() {
        lightReceiver.on();
    }
}
