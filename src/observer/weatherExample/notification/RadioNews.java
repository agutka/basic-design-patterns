package observer.weatherExample.notification;

import observer.weatherExample.weatherForecast.WeatherForecast;

public class RadioNews implements Observer {

    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Radio - nowa prognoza pogody: temperatura: " + weatherForecast.getTemperature() + " stopni, cisnienie: " + weatherForecast.getPressure() + "hPa");
    }
}
