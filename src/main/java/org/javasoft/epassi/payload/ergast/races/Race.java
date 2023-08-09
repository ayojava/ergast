package org.javasoft.epassi.payload.ergast.races;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Race {

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

}
