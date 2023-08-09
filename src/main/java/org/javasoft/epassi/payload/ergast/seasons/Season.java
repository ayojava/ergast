package org.javasoft.epassi.payload.ergast.seasons;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Season {

    @JsonProperty("season")
    private String year;

    private String url ;
}
