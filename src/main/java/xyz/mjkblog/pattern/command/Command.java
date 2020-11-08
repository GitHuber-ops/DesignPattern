package xyz.mjkblog.pattern.command;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--16--2:01 PM
 */
public interface Command {
    public void execute();
    public void undo();
}
