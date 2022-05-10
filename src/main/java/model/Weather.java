package model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Getter
public class Weather {
    Integer id;
    String main;
    String description;
    String icon;
}
