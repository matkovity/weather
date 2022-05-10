package model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Getter
public class Current {
    long dt;
    long sunrise;
    long sunset;
    double temp;
    @JsonProperty("feels_like")
    long feelsLike;
    long pressure;
    long humidity;
    @JsonProperty("dew_point")
    long dewPoint;
    long uvi;
    long clouds;
    long visibility;
    @JsonProperty("wind_speed")
    long windSpeed;
    @JsonProperty("wind_deg")
    long windDeg;
    @JsonProperty("wind_gust")
    long windGust;
    Rain rain;
    List<Weather> weather;
}
