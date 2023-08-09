package org.javasoft.epassi.payload.ergast.standings;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StandingsList {

    @JsonProperty("season")
    private String year;

    private String round;

    @JsonProperty("DriverStandings")
    private List<DriverStanding> driverStandings;

}
