package xyz.mjkblog.pattern.obersver;

import lombok.Getter;

import java.util.ArrayList;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--17--9:53 AM
 */

@Getter
public class WeatherData implements Subject {
    private float temperature;
    private float pressure;
    private float humidity;

    private ArrayList<Observer> observers;

    WeatherData() {
        observers = new ArrayList<>();
    }

    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        if (observers.contains(observer)) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        observers.forEach(e -> e.update(this.temperature, this.pressure, this.humidity));
    }

    public void dataChange(){
        notifyObservers();
    }
}
