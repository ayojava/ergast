package org.javasoft.epassi.payload.ergast.seasons;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SeasonRoot {

    @JsonProperty("MRData")
    private SeasonMRData seasonMRData;
}
