package org.javasoft.epassi.controller;

import lombok.extern.slf4j.Slf4j;
import org.javasoft.epassi.facade.ErgastFacade;
import org.javasoft.epassi.payload.client.GridResultVO;
import org.javasoft.epassi.payload.client.RaceResultVO;
import org.javasoft.epassi.payload.client.Rank;
import org.javasoft.epassi.payload.ergast.races.Race;
import org.javasoft.epassi.payload.ergast.seasons.Season;
import org.javasoft.epassi.payload.ergast.standings.DriverStanding;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.javasoft.epassi.api.ClientAPI.*;

@Slf4j
@RestController
@RequestMapping(API)
public class ErgastController {
    private final ErgastFacade ergastFacade;

    @Autowired
    public ErgastController(ErgastFacade ergastFacade) {
        this.ergastFacade = ergastFacade;
    }

    @GetMapping(ALL_SEASONS_API)
    public ResponseEntity<List<Season>> getAllSeasons(){
        List<Season> allSeasons = ergastFacade.getAllSeasons();
        return new ResponseEntity<>(allSeasons , HttpStatus.OK);
    }

    @GetMapping(FINAL_STANDING_API)
    public ResponseEntity<DriverStanding> getFinalStandings(@RequestParam int season){
        DriverStanding standingData = ergastFacade.getStandingData(season);
        return new ResponseEntity<>(standingData , HttpStatus.OK);
    }

    @GetMapping(ALL_RACES_API)
    public ResponseEntity<List<Race>> getAllRaces(@RequestParam int season){
        List<Race> races = ergastFacade.getRaces(season);
        return new ResponseEntity<>(races , HttpStatus.OK);
    }

    @GetMapping(STARTING_GRID_API)
    public ResponseEntity<List<GridResultVO>> getStartingGridFromRace(@RequestParam int season, @RequestParam int race){
        List<GridResultVO> gridResultVO = ergastFacade.getGridResultVO(season, race);
        return new ResponseEntity<>(gridResultVO , HttpStatus.OK);
    }

    @GetMapping(RACE_API)
    public ResponseEntity<List<RaceResultVO>> getRaceResult(@RequestParam int season, @RequestParam int race){
        List<RaceResultVO> raceResultVO = ergastFacade.getRaceResultVO(season, race);
        return new ResponseEntity<>(raceResultVO , HttpStatus.OK);
    }

    @GetMapping(RANK_API)
    public ResponseEntity<Rank> rankByAverageSpeed(@RequestParam int season){
        Rank rank = ergastFacade.scoreSystemByAverageSpeed(season);
        return new ResponseEntity<>(rank , HttpStatus.OK);
    }
}
