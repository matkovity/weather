package validation;

import model.WeatherMap;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Integer.parseInt;

public class WeatherValidation {
    public static String isItBarbequeTime(WeatherMap weatherMap) {
        String result = "";
        double celsius = getCelsiusFromKelvin(weatherMap.getCurrent().getTemp());
        int rain = getRain(weatherMap.getCurrent().getRain());

        if (celsius >= 20 && rain < 2)
            result = "barbeque time";
        else {
            result = "no barbeque time";
        }
        return result;
    }

    private static int getRain(String rainInMM) {
        int rain;
        if (rainInMM == null || rainInMM.equals("")) {
            rain = 0;
        } else {
            rain = parseInt(rainInMM.substring(0, rainInMM.length() - 2));
        }
        return rain;
    }

    private static double getCelsiusFromKelvin(double kelvin) {
        return kelvin - 273.15;
    }

    @Test
    public void calculateCelsius() {
        double actualResult = WeatherValidation.getCelsiusFromKelvin(273.15);
        double expectedResult = 0.0;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculateRainWithString() {
        int actualResult = WeatherValidation.getRain("20mm");
        int expectedResult = 20;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculateRainWithNull() {
        int actualResult = WeatherValidation.getRain(null);
        int expectedResult = 0;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculateRainWithEmptyString() {
        int actualResult = WeatherValidation.getRain("");
        int expectedResult = 0;
        Assert.assertEquals(expectedResult, actualResult);
    }
}
