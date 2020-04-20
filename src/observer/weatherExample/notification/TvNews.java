package observer.weatherExample.notification;

import observer.weatherExample.weatherForecast.WeatherForecast;

public class TvNews implements Observer {

    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Telewizja - nowa prognoza pogody: temperatura: " + weatherForecast.getTemperature() + " stopni, cisnienie: " + weatherForecast.getPressure() + "hPa");
    }
}
