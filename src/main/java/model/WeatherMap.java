package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherMap {
    Current current;
}
