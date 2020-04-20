package observer.weatherExample.weatherForecast;

import observer.weatherExample.notification.Observer;

public interface Observable {

    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers();
}
