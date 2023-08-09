package org.javasoft.epassi.payload.ergast.allData;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Circuit {

    private String circuitId;

    private String url;

    private String circuitName;

    @JsonProperty("Location")
    private Location location;

}
