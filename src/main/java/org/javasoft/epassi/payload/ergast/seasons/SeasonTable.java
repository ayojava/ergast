package org.javasoft.epassi.payload.ergast.seasons;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SeasonTable {

    @JsonProperty("Seasons")
    private List<Season> seasons;
}
