package org.javasoft.epassi.payload.ergast.racePositions;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FastestLap {

    private String rank;

    private String lap;

    @JsonProperty("AverageSpeed")
    private AverageSpeed averageSpeed;

    @JsonProperty("Time")
    private RaceDuration raceDuration;
}
