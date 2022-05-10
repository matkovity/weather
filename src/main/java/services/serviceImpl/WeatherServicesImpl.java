package services.serviceImpl;

import io.restassured.RestAssured;
import lombok.extern.slf4j.Slf4j;
import model.WeatherMap;
import org.apache.http.HttpStatus;
import services.WeatherServices;
import utils.Utils;

import java.util.Properties;

@Slf4j
public class WeatherServicesImpl implements WeatherServices {

    @Override
    public WeatherMap getWeatherMap() {
        Properties properties = Utils.loadProperty();
        String url = String.format("https://api.openweathermap.org/data/2.5/onecall?lat=%s&lon=%s&exclude=hourly,daily&appid=%s", properties.getProperty("latitude"), properties.getProperty("longitude"), properties.getProperty("openWeatherAppId"));
        log.info("Response from Open Weather Map API: ");
        return RestAssured
                .given()
                .when()
                .get(url)
                .then().log().body()
                .assertThat().statusCode(HttpStatus.SC_OK)
                .extract().as(WeatherMap.class);
    }
}
