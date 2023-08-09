package org.javasoft.epassi.payload.ergast.allData;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AllDataRaceTable {

    @JsonProperty("Races")
    private List<AllDataRace> allDataRaces;
}
