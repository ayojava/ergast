package org.javasoft.epassi.payload.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.javasoft.epassi.payload.ergast.racePositions.RaceDuration;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GridResultVO {

    private String startingGrid;

    private String position;

    private String pilotName;

    private RaceDuration qualifyingTime;
}
