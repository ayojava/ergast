package org.javasoft.epassi.cache;

import lombok.extern.slf4j.Slf4j;
import org.javasoft.epassi.bean.RestTemplateBean;
import org.javasoft.epassi.payload.ergast.allData.MRData;
import org.javasoft.epassi.payload.ergast.allData.AllDataRace;
import org.javasoft.epassi.payload.ergast.allData.Root;
import org.javasoft.epassi.payload.ergast.racePositions.RacePositionMRData;
import org.javasoft.epassi.payload.ergast.racePositions.RacePositionRoot;
import org.javasoft.epassi.payload.ergast.races.RaceMRData;
import org.javasoft.epassi.payload.ergast.races.RaceRoot;
import org.javasoft.epassi.payload.ergast.seasons.SeasonMRData;
import org.javasoft.epassi.payload.ergast.seasons.SeasonRoot;
import org.javasoft.epassi.payload.ergast.standings.StandingMRData;
import org.javasoft.epassi.payload.ergast.standings.StandingRoot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.javasoft.epassi.api.ErgastAPI.*;

@Slf4j
@Service
public class CacheService {

    private final RestTemplateBean restTemplateBean;

    @Autowired
    public CacheService(RestTemplateBean restTemplateBean) {
        this.restTemplateBean = restTemplateBean;
    }


    @Cacheable("seasons")
    public SeasonMRData getSeasons(){
        return restTemplateBean.loadRecords(SeasonRoot.class ,SEASONS_API).getSeasonMRData();
    }

    @Cacheable(value = "standing" , key = "#season")
    public StandingMRData getStanding(String season){
        String url = "/" + season + DRIVER_STANDINGS_API;
        return restTemplateBean.loadRecords(StandingRoot.class , url)
                .getStandingMRData();
    }

    @Cacheable(value = "races" , key = "#season")
    public RaceMRData getRaces(String season){
        String url = "/" + season + ".json";
        return restTemplateBean
                .loadRecords(RaceRoot.class , url)
                .getRaceMRData();
    }

    @Cacheable(value = "racePositions" , key = "#season + #round")
    public RacePositionMRData getRacePositions(String season , String round){
        String url = "/" + season + "/" + round + RESULTS_API;
        return restTemplateBean
                .loadRecords(RacePositionRoot.class , url)
                .getRacePositionMRData();
    }

    @Cacheable(value = "scoreSystems" , key = "#season")
    public RacePositionMRData otherScoringSystems(String season ){
        String url = "/" + season +  RESULTS_API;
        return restTemplateBean
                .loadRecords(RacePositionRoot.class , url)
                .getRacePositionMRData();
    }


    @Cacheable("mrData")
    public MRData getAllData(){

        MRData mrData = restTemplateBean.loadRecords( Root.class ,".json").getMRData();
        List<AllDataRace> allDataRaces = mrData.getAllDataRaceTable().getAllDataRaces();

        int total = Integer.parseInt(mrData.getTotal());
        int fetchedRecords  = Integer.parseInt(mrData.getLimit()) ;
        while(fetchedRecords < total){
            int remainder = total - fetchedRecords;
            int limit  = Math.min(remainder, restTemplateBean.getLimit());
            MRData records = restTemplateBean.loadRecords(fetchedRecords , limit ,  MRData.class ," .json");
            fetchedRecords = fetchedRecords + Integer.parseInt(records.getLimit()) ;
            mrData.setTotal(String.valueOf(fetchedRecords));

            allDataRaces.addAll(records.getAllDataRaceTable().getAllDataRaces());
        }
        return mrData;
    }


}
