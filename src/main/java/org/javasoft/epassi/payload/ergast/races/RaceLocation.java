package org.javasoft.epassi.payload.ergast.races;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RaceLocation {

    @JsonProperty("lat")
    public String latitude;

    @JsonProperty("long")
    public String longitude;

    public String locality;

    public String country;
}
