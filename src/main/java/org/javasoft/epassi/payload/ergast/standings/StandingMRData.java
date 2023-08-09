package org.javasoft.epassi.payload.ergast.standings;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.javasoft.epassi.payload.ergast.DefaultData;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class StandingMRData extends DefaultData {

    @JsonProperty("StandingsTable")
    private StandingsTable standingsTable;

}
