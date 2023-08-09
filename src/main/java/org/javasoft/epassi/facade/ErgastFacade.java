package org.javasoft.epassi.facade;


import lombok.extern.slf4j.Slf4j;
import org.javasoft.epassi.cache.CacheService;
import org.javasoft.epassi.exception.ErgastException;
import org.javasoft.epassi.payload.client.AverageSpeedRank;
import org.javasoft.epassi.payload.client.GridResultVO;
import org.javasoft.epassi.payload.client.RaceResultVO;
import org.javasoft.epassi.payload.client.Rank;
import org.javasoft.epassi.payload.ergast.racePositions.RacePosition;
import org.javasoft.epassi.payload.ergast.racePositions.RacePositionMRData;
import org.javasoft.epassi.payload.ergast.racePositions.RacePositionTable;
import org.javasoft.epassi.payload.ergast.racePositions.RaceResult;
import org.javasoft.epassi.payload.ergast.races.Race;
import org.javasoft.epassi.payload.ergast.races.RaceMRData;
import org.javasoft.epassi.payload.ergast.seasons.Season;
import org.javasoft.epassi.payload.ergast.standings.DriverStanding;
import org.javasoft.epassi.payload.ergast.standings.StandingMRData;
import org.javasoft.epassi.payload.ergast.standings.StandingsList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static org.javasoft.epassi.util.FunctionUtil.*;

@Slf4j
@Service
public class ErgastFacade {
    private final CacheService cacheService;
    @Autowired
    public ErgastFacade(CacheService cacheService) {
        this.cacheService = cacheService;
    }

    public List<Season> getAllSeasons(){
        return cacheService.getSeasons().getSeasonTable().getSeasons();
    }

    public DriverStanding getStandingData(int season){
        StandingMRData standingMRData = cacheService.getStanding(String.valueOf(season));
        List<StandingsList> standingsLists = standingMRData.getStandingsTable().getStandingsLists();
        StandingsList standingsList = standingsLists.get(0);
        return standingsList.getDriverStandings()
                .stream()
                .min(Comparator.comparingInt(value -> Integer.parseInt(value.getPosition())))
                .orElseThrow(() -> new ErgastException("No Final Standings found for season " + season));
    }

    public List<Race> getRaces(int season){
        RaceMRData raceMRData = cacheService.getRaces(String.valueOf(season));
        List<Race> races = raceMRData.getRaceTable().getRaces();
        if(races.isEmpty()){
            throw new ErgastException("No Race found for season " + season);
        }
        return races;
    }

    public List<RaceResultVO> getRaceResultVO(int season , int round){
        List<RaceResult> raceResults = getRaceResults(season, round);
        return raceResults.stream()
                .map(mapRaceResultVO)
                .collect(Collectors.toList());
    }

    public List<GridResultVO> getGridResultVO(int season , int round){
        List<RaceResult> raceResults = getRaceResults(season, round);
        return raceResults.stream()
                .map(mapGridResultVO)
                .collect(Collectors.toList());
    }

    public Rank scoreSystemByAverageSpeed(int season){
        RacePositionMRData racePositionMRData = cacheService.otherScoringSystems(String.valueOf(season));

        RacePositionTable racePositionTable = racePositionMRData.getRacePositionTable();
        List<RacePosition> racePositions = racePositionTable.getRacePositions();

        List<AverageSpeedRank> averageSpeedRanks = racePositions.stream()
                .map(racePosition -> racePosition.getRaceResults().stream()
                        .min(Comparator.comparingInt(value -> Integer.parseInt(value.getPosition())))
                        .orElse(null))
                .filter(Objects::nonNull)
                .sorted(Comparator.comparingDouble(value -> Double.parseDouble(value.getFastestLap().getAverageSpeed().getSpeed())))
                .map(mapAverageSpeedRank)
                .collect(Collectors.toList());

        Rank rank = new Rank();
        rank.setSeason(season);
        rank.setSpeedRankList(averageSpeedRanks);
        return rank;
    }

    private List<RaceResult> getRaceResults(int season , int round){
        RacePositionMRData racePositionMRData = cacheService.getRacePositions(String.valueOf(season), String.valueOf(round));
        List<RacePosition> racePositions = racePositionMRData.getRacePositionTable().getRacePositions();
        List<RaceResult> raceResults = racePositions.get(0).getRaceResults();
        if(raceResults.isEmpty()){
            throw new ErgastException("No Race found for season " + season);
        }
        return raceResults;
    }

}
