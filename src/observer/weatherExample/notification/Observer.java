package observer.weatherExample.notification;

import observer.weatherExample.weatherForecast.WeatherForecast;

public interface Observer {

    void updateForecast(WeatherForecast weatherForecast);
}
