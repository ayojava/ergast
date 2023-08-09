package org.javasoft.epassi.payload.ergast.racePositions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AverageSpeed {

    private String units;

    private String speed;
}
