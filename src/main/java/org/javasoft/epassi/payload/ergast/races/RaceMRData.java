package org.javasoft.epassi.payload.ergast.races;

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
public class RaceMRData extends DefaultData {

    @JsonProperty("RaceTable")
    private RaceTable raceTable;
}
