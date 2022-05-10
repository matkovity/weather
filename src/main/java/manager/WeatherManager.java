package manager;

import model.WeatherMap;
import services.WeatherServices;
import services.serviceImpl.WeatherServicesImpl;

public class WeatherManager {

    private static final WeatherServices weatherServices = new WeatherServicesImpl();

    public static WeatherMap getWeatherMap() {
        return weatherServices.getWeatherMap();
    }
}
