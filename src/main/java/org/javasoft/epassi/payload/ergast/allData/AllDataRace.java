package org.javasoft.epassi.payload.ergast.allData;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class AllDataRace {

    private String season;

    private String round;

    private String url;

    private String raceName;

    @JsonProperty("Circuit")
    private Circuit circuit;

    @JsonProperty("date")
    private String eventDay;

}
