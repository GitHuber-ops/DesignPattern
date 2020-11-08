package xyz.mjkblog.pattern.obersver;

/**
 * @Project: DesignPattern
 * @Author: Unknown
 * @Create: 2020--09--17--10:03 AM
 */
public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        weatherData.registerObserver(new CurrentConditions());
        weatherData.setData(1.0f,1.0f,1.0f);
    }
}
