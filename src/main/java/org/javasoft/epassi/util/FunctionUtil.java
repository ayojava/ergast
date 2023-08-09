package org.javasoft.epassi.util;

import org.javasoft.epassi.payload.client.AverageSpeedRank;
import org.javasoft.epassi.payload.client.GridResultVO;
import org.javasoft.epassi.payload.client.RaceResultVO;
import org.javasoft.epassi.payload.ergast.racePositions.RaceResult;
import org.javasoft.epassi.payload.ergast.standings.Driver;

import java.util.function.Function;

public class FunctionUtil {

    public static final Function<RaceResult, RaceResultVO> mapRaceResultVO  = raceResult -> {
        RaceResultVO raceResultVO = new RaceResultVO();
        raceResultVO.setPosition(raceResult.getPosition());
        raceResultVO.setPoints(Integer.parseInt(raceResult.getPoints()));
        Driver driver = raceResult.getDriver();
        raceResultVO.setPilotName(driver.getFirstName() + "  " + driver.getLastName());
        return raceResultVO;
    };

    public static final Function<RaceResult , GridResultVO> mapGridResultVO = raceResult -> {
        GridResultVO gridResultVO = new GridResultVO();
        gridResultVO.setStartingGrid(raceResult.getGrid());
        gridResultVO.setPosition(raceResult.getPosition());

        Driver driver = raceResult.getDriver();
        gridResultVO.setPilotName(driver.getFirstName() + "  " + driver.getLastName());

        gridResultVO.setQualifyingTime(raceResult.getRaceDuration());
        return gridResultVO;
    };

    public static final Function<RaceResult , AverageSpeedRank> mapAverageSpeedRank = raceResult -> AverageSpeedRank.builder()
            .averageSpeed(raceResult.getFastestLap().getAverageSpeed().getSpeed() + " " + raceResult.getFastestLap().getAverageSpeed().getUnits())
            .manufacturer(raceResult.getManufacturer())
            .pointsInRace(raceResult.getPoints())
            .positionInRace(raceResult.getPosition())
            .raceNo(raceResult.getNumber())
            .driver(raceResult.getDriver())
            .build();
}
