package org.javasoft.epassi.payload.ergast.allData;


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
public class MRData extends DefaultData {

    @JsonProperty("RaceTable")
    private AllDataRaceTable allDataRaceTable;

}
