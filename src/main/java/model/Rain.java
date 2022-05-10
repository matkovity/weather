package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Rain {
    @JsonProperty("1h")
    double rainInMM;
}
