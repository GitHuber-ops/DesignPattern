package xyz.mjkblog.pattern.obersver;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--17--9:45 AM
 */
public interface Subject {
    public void registerObserver(Observer observer);

    public void remove(Observer observer);

    public void notifyObservers();
}
