package xyz.mjkblog.pattern.command;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--16--2:03 PM
 */
public class LightOnCommand implements Command {
    LightReceiver lightReceiver;

    public void execute() {
        lightReceiver.on();
    }

    public void undo() {
        lightReceiver.off();
    }
}
