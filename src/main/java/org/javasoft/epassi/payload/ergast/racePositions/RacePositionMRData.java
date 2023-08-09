package org.javasoft.epassi.payload.ergast.racePositions;

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
public class RacePositionMRData extends DefaultData {

    @JsonProperty("RaceTable")
    private RacePositionTable racePositionTable;

}
