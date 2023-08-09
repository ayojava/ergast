package org.javasoft.epassi.payload.ergast.allData;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Location {

    @JsonProperty("lat")
    public String latitude;

    @JsonProperty("long")
    public String longitude;

    public String locality;

    public String country;
}
