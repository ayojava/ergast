package org.javasoft.epassi.payload.client;


import lombok.Builder;
import lombok.Data;
import org.javasoft.epassi.payload.ergast.standings.Driver;
import org.javasoft.epassi.payload.ergast.standings.Manufacturer;

@Data
@Builder
public class AverageSpeedRank {

    private String raceNo;

    private String positionInRace;

    private String pointsInRace;

    private Driver driver;

    private Manufacturer manufacturer;

    private String averageSpeed;
}
