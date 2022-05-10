package manager;

import lombok.extern.slf4j.Slf4j;
import model.WeatherMap;
import services.WeatherServices;
import services.serviceImpl.WeatherServicesImpl;

@Slf4j
public class WeatherManager {

    private static final WeatherServices weatherServices = new WeatherServicesImpl();

    public static WeatherMap getWeatherMap() {
        return weatherServices.getWeatherMap();
    }

    public static String isItBarbequeTime(WeatherMap weatherMap) {
        double celsius = getCelsiusFromKelvin(weatherMap.getCurrent().getTemp());
        double rain = weatherMap.getCurrent().getRain().getRainInMM();

        return decideBarbequeTime(celsius, rain);
    }

    public static String decideBarbequeTime(double celsius, double rain) {
        String result = "";
        if (celsius >= 20 && rain < 0.2)
            result = "barbeque time";
        else {
            result = "no barbeque time";
        }
        return result;
    }

    public static double getCelsiusFromKelvin(double kelvin) {
        return kelvin - 273.15;
    }
}
