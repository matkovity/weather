package weatherTests;

import manager.WeatherManager;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenWeatherUnitTests {

    @Test
    public void calculateCelsius() {
        double actualResult = WeatherManager.getCelsiusFromKelvin(273.15);
        double expectedResult = 0.0;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void decideBarbequeTimePositiveEqualCelsius() {
        String actualResult = WeatherManager.decideBarbequeTime(20, 0.1);
        String expectedResult = "barbeque time";
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void decideBarbequeTimePositivePlusCelsius() {
        String actualResult = WeatherManager.decideBarbequeTime(21, 0.1);
        String expectedResult = "barbeque time";
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void decideBarbequeTimeNegativeMinusCelsius() {
        String actualResult = WeatherManager.decideBarbequeTime(19, 0.1);
        String expectedResult = "no barbeque time";
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void decideBarbequeTimeNegativeEqualRain() {
        String actualResult = WeatherManager.decideBarbequeTime(20, 0.2);
        String expectedResult = "no barbeque time";
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void decideBarbequeTimeNegativeMinusRain() {
        String actualResult = WeatherManager.decideBarbequeTime(20, 0.3);
        String expectedResult = "no barbeque time";
        Assert.assertEquals(expectedResult, actualResult);
    }


}
