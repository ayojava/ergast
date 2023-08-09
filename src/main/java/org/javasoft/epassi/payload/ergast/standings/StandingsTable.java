package org.javasoft.epassi.payload.ergast.standings;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StandingsTable {

    private String season;

    @JsonProperty("StandingsLists")
    private List<StandingsList> standingsLists;
}
