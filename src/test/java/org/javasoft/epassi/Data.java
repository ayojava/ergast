package org.javasoft.epassi;

import org.javasoft.epassi.payload.ergast.racePositions.*;
import org.javasoft.epassi.payload.ergast.standings.Driver;
import org.javasoft.epassi.payload.ergast.standings.Manufacturer;

import java.util.ArrayList;

public class Data {

    public static RacePositionMRData getRacePositionMRData(String season){
        RacePositionMRData racePositionMRData = new RacePositionMRData();

        ArrayList<RacePosition> racePositions = new ArrayList<>();
        racePositions.add(getRacePosition1(season));
        racePositions.add(getRacePosition2(season));
        racePositions.add(getRacePosition3(season));

        RacePositionTable racePositionTable = new RacePositionTable();
        racePositionTable.setSeason(season);
        racePositionTable.setRacePositions(racePositions);


        racePositionMRData.setRacePositionTable(racePositionTable);
        return racePositionMRData;
    }

    private static RacePosition getRacePosition1(String season){

        ArrayList<RaceResult> raceResults = new ArrayList<>();

        RaceResult raceResult1 = new RaceResult();
        raceResult1.setPosition("1");
        raceResult1.setNumber("22");
        raceResult1.setGrid("1");
        raceResult1.setPoints("10");
        raceResult1.setManufacturer(new Manufacturer("brawn","http://u.com","Brawn","British"));
        raceResult1.setRaceDuration(new RaceDuration("5655784","1:34:15.784"));
        raceResult1.setFastestLap(new FastestLap("3","17",new AverageSpeed("kph","216.891") , new RaceDuration()));
        raceResult1.setDriver(new Driver("button" , "22" , "BUT" ,"http:yu.com" , "Scott" ,"James","1980-01-19" ,"Congolese"));

        raceResults.add(raceResult1);

        RaceResult raceResult2 = new RaceResult();
        raceResult2.setPosition("2");
        raceResult2.setNumber("23");
        raceResult2.setGrid("2");
        raceResult2.setPoints("8");
        raceResult2.setManufacturer(new Manufacturer("brawn","http://u.com","American","Germany"));
        raceResult2.setRaceDuration(new RaceDuration("5656591","+0.807"));
        raceResult2.setFastestLap(new FastestLap("14","43",new AverageSpeed("kph","214.344") , new RaceDuration()));
        raceResult2.setDriver(new Driver("trulli" , "22" , "BUT" ,"http:yu.com" , "Sphinx" ,"Trulli","1985-04-19" ,"Chinese"));

        raceResults.add(raceResult2);

        RaceResult raceResult3 = new RaceResult();
        raceResult3.setPosition("3");
        raceResult3.setNumber("23");
        raceResult3.setGrid("2");
        raceResult3.setPoints("6");
        raceResult3.setManufacturer(new Manufacturer("alfa","http://u.com","Alfa Romeo","Swiss"));
        raceResult3.setRaceDuration(new RaceDuration("5656591","+0.807"));
        raceResult3.setFastestLap(new FastestLap("14","43",new AverageSpeed("kph","214.706") , new RaceDuration()));
        raceResult3.setDriver(new Driver("Standing" , "22" , "BUT" ,"http:yu.com" , "Rethg" ,"Malala","1985-04-19" ,"German"));

        raceResults.add(raceResult3);

        RacePosition racePosition1 = new RacePosition();
        racePosition1.setSeason(season);
        racePosition1.setRound("1");
        racePosition1.setRaceResults(raceResults);

        return racePosition1;
    }

    private static RacePosition getRacePosition2(String season){

        ArrayList<RaceResult> raceResults = new ArrayList<>();

        RaceResult raceResult1 = new RaceResult();
        raceResult1.setPosition("1");
        raceResult1.setNumber("22");
        raceResult1.setGrid("1");
        raceResult1.setPoints("25");
        raceResult1.setManufacturer(new Manufacturer("moda","http://u.com","Andrea Moda","Italian"));
        raceResult1.setRaceDuration(new RaceDuration("5655784","1:34:15.784"));
        raceResult1.setFastestLap(new FastestLap("3","17",new AverageSpeed("kph","256.891") , new RaceDuration()));
        raceResult1.setDriver(new Driver("triab" , "22" , "BUT" ,"http:yu.com" , "Jared" ,"Triab","1980-01-19" ,"Ghanian"));

        raceResults.add(raceResult1);

        RaceResult raceResult2 = new RaceResult();
        raceResult2.setPosition("2");
        raceResult2.setNumber("23");
        raceResult2.setGrid("2");
        raceResult2.setPoints("14");
        raceResult2.setManufacturer(new Manufacturer("brabham-ford","http://u.com","brabham-ford","British"));
        raceResult2.setRaceDuration(new RaceDuration("5656591","+0.807"));
        raceResult2.setFastestLap(new FastestLap("14","43",new AverageSpeed("kph","244.344") , new RaceDuration()));
        raceResult2.setDriver(new Driver("cor" , "22" , "BUT" ,"http:yu.com" , "Makeills" ,"Lakutoos","1985-04-19" ,"Jamaican"));

        raceResults.add(raceResult2);

        RaceResult raceResult3 = new RaceResult();
        raceResult3.setPosition("3");
        raceResult3.setNumber("23");
        raceResult3.setGrid("2");
        raceResult3.setPoints("12");
        raceResult3.setManufacturer(new Manufacturer("brawn","http://u.com","Brawn","British"));
        raceResult3.setRaceDuration(new RaceDuration("5656591","+0.807"));
        raceResult3.setFastestLap(new FastestLap("14","43",new AverageSpeed("kph","274.706") , new RaceDuration()));
        raceResult3.setDriver(new Driver("trulli" , "22" , "BUT" ,"http:yu.com" , "Jarno" ,"Trulli","1985-04-19" ,"British"));

        raceResults.add(raceResult3);

        RacePosition racePosition1 = new RacePosition();
        racePosition1.setSeason(season);
        racePosition1.setRound("2");
        racePosition1.setRaceResults(raceResults);

        return racePosition1;
    }

    private static RacePosition getRacePosition3(String season){

        ArrayList<RaceResult> raceResults = new ArrayList<>();

        RaceResult raceResult1 = new RaceResult();
        raceResult1.setPosition("1");
        raceResult1.setNumber("22");
        raceResult1.setGrid("1");
        raceResult1.setPoints("20");
        raceResult1.setManufacturer(new Manufacturer("brawn","http://u.com","Brawn","British"));
        raceResult1.setRaceDuration(new RaceDuration("5655784","1:34:15.784"));
        raceResult1.setFastestLap(new FastestLap("3","17",new AverageSpeed("kph","120.891") , new RaceDuration()));
        raceResult1.setDriver(new Driver("button" , "22" , "BUT" ,"http:yu.com" , "Jensen" ,"Button","1980-01-19" ,"British"));

        raceResults.add(raceResult1);

        RaceResult raceResult2 = new RaceResult();
        raceResult2.setPosition("2");
        raceResult2.setNumber("23");
        raceResult2.setGrid("2");
        raceResult2.setPoints("15");
        raceResult2.setManufacturer(new Manufacturer("brawn","http://u.com","Brawn","British"));
        raceResult2.setRaceDuration(new RaceDuration("5656591","+0.807"));
        raceResult2.setFastestLap(new FastestLap("14","43",new AverageSpeed("kph","244.344") , new RaceDuration()));
        raceResult2.setDriver(new Driver("trulli" , "22" , "BUT" ,"http:yu.com" , "Jarno" ,"Trulli","1985-04-19" ,"German"));

        raceResults.add(raceResult2);

        RaceResult raceResult3 = new RaceResult();
        raceResult3.setPosition("3");
        raceResult3.setNumber("23");
        raceResult3.setGrid("2");
        raceResult3.setPoints("10");
        raceResult3.setManufacturer(new Manufacturer("brawn","http://u.com","Toyota","Japan"));
        raceResult3.setRaceDuration(new RaceDuration("5656591","+0.807"));
        raceResult3.setFastestLap(new FastestLap("14","43",new AverageSpeed("kph","340.706") , new RaceDuration()));
        raceResult3.setDriver(new Driver("trulli" , "22" , "BUT" ,"http:yu.com" , "Alonso" ,"Fernando","1985-04-19" ,"Spanish"));

        raceResults.add(raceResult3);

        RacePosition racePosition1 = new RacePosition();
        racePosition1.setSeason(season);
        racePosition1.setRound("2");
        racePosition1.setRaceResults(raceResults);

        return racePosition1;
    }

}
