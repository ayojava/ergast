package org.javasoft.epassi.payload.ergast.racePositions;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.javasoft.epassi.payload.ergast.races.RaceCircuit;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RacePosition {

    private String season;

    private String round;

    private String url;

    private String raceName;

    @JsonProperty("Circuit")
    private RaceCircuit raceCircuit;

    @JsonProperty("date")
    private String eventDay;

    @JsonProperty("time")
    private String eventTime;

    @JsonProperty("Results")
    private List<RaceResult> raceResults;
}
