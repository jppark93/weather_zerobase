package zerobase.weather.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Getter
@Setter
@Entity(name = "date_weather")
@NoArgsConstructor
public class DateWeather {
 @Id
    private LocalDate date;
    private String weather;
    private String icon;
    private double temperature;

}
