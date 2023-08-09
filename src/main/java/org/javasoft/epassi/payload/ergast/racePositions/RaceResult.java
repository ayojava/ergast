package org.javasoft.epassi.payload.ergast.racePositions;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.javasoft.epassi.payload.ergast.standings.Driver;
import org.javasoft.epassi.payload.ergast.standings.Manufacturer;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RaceResult {

    private String number;

    private String position;

    private String positionText;

    private String points;

    @JsonProperty("Driver")
    private Driver driver;

    @JsonProperty("Constructor")
    private Manufacturer manufacturer;

    private String grid;

    private String laps;

    private String status;

    @JsonProperty("Time")
    private RaceDuration  raceDuration;

    @JsonProperty("FastestLap")
    public FastestLap fastestLap;

}
