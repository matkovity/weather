package weatherTests;

import manager.WeatherManager;
import model.WeatherMap;
import org.testng.annotations.Test;
import validation.WeatherValidation;

public class GrillTimeTests{

    @Test
    public void grillTimeTest() {
        final WeatherMap weatherMap = WeatherManager.getWeatherMap();

        String barbeque = WeatherValidation.isItBarbequeTime(weatherMap);

        System.out.println(barbeque);
    }

}
