package weatherTests;

import manager.WeatherManager;
import model.WeatherMap;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenWeatherEndToEndTests {
    @Test
    public void OpenWeatherIsItBarbequeTimeGiveBackResultTest() {
        final WeatherMap weatherMap = WeatherManager.getWeatherMap();

        String itBarbequeTime = WeatherManager.isItBarbequeTime(weatherMap);

        Assert.assertNotEquals(itBarbequeTime, "");
    }
}
