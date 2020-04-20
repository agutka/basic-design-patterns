package observer.weatherExample;

import observer.weatherExample.notification.InternetNews;
import observer.weatherExample.notification.RadioNews;
import observer.weatherExample.notification.TvNews;
import observer.weatherExample.weatherForecast.WeatherForecast;

public class Main {

    public static void main(String[] args) {

        WeatherForecast weatherForecast = new WeatherForecast(23,1021);
        RadioNews radioNews = new RadioNews();
        InternetNews internetNews = new InternetNews();
        TvNews tvNews = new TvNews();

        weatherForecast.registerObserver(radioNews);
        weatherForecast.registerObserver(internetNews);
        weatherForecast.registerObserver(tvNews);

        weatherForecast.notifyObservers();

        weatherForecast.unregisterObserver(radioNews);
        weatherForecast.unregisterObserver(tvNews);

        System.out.println("Nowa prognoza - powiadomienie tylko dla serwisu internetowego: ");
        weatherForecast.updateForecast(18,1007);
    }
}
