package observer.weatherExample.weatherForecast;

import observer.weatherExample.notification.Observer;

import java.util.HashSet;
import java.util.Set;

public class WeatherForecast implements Observable {

    private int temperature;
    private int pressure;
    Set<Observer> registeredObservers = new HashSet<>();

    public WeatherForecast(int temperature, int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
    }

    public void updateForecast(int temperature, int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        registeredObservers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        registeredObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : registeredObservers) {
            observer.updateForecast(this);
        }
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }
}
