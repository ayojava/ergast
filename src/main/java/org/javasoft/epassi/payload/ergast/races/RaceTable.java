package org.javasoft.epassi.payload.ergast.races;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RaceTable {

    private String season;

    @JsonProperty("Races")
    private List<Race> races;
}
