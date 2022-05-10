import lombok.extern.slf4j.Slf4j;
import manager.WeatherManager;
import model.WeatherMap;

@Slf4j
public class WeatherMain {
    public static void main(String args[]) {
        WeatherMap weatherMap = WeatherManager.getWeatherMap();
        String isBarbequeTime = WeatherManager.isItBarbequeTime(weatherMap);
        log.info("Result: " + isBarbequeTime);
    }
}
