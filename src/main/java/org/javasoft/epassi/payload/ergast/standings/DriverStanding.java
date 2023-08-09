package org.javasoft.epassi.payload.ergast.standings;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DriverStanding {

    private String position;

    private String positionText;

    private String points;

    private String wins;

    @JsonProperty("Driver")
    private Driver driver;

    @JsonProperty("Constructors")
    private List<Manufacturer> manufacturers;

}
