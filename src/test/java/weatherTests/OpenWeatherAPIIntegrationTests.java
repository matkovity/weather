package weatherTests;

import manager.WeatherManager;
import model.WeatherMap;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenWeatherAPIIntegrationTests {

    @Test
    public void OpenWeatherAPIGiveBackWeatherMapDTOTest() {
        final WeatherMap weatherMap = WeatherManager.getWeatherMap();

        Assert.assertNotEquals(weatherMap, null);
    }
}
