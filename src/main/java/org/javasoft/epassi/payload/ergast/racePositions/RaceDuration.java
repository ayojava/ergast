package org.javasoft.epassi.payload.ergast.racePositions;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RaceDuration {

    private String millis;

    @JsonProperty("time")
    private String eventTime;
}
