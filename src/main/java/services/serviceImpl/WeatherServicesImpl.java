package services.serviceImpl;

import io.restassured.RestAssured;
import model.WeatherMap;
import org.apache.http.HttpStatus;
import services.WeatherServices;
import utils.Utils;

import java.util.Properties;

public class WeatherServicesImpl implements WeatherServices {

    @Override
    public WeatherMap getWeatherMap() {
        Properties properties = Utils.loadProperty();
        String url = String.format("https://api.openweathermap.org/data/2.5/onecall?lat=%s&lon=%s&exclude=hourly,daily&appid=%s", properties.getProperty("lat"), properties.getProperty("lon"), properties.getProperty("appid"));
        return RestAssured
                .given()
                .when()
                .get(url)
                .then().log().body()
                .assertThat().statusCode(HttpStatus.SC_OK)
                .extract().as(WeatherMap.class);
    }
}
