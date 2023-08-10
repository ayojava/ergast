package org.javasoft.epassi;

import org.javasoft.epassi.payload.ergast.racePositions.*;
import org.javasoft.epassi.payload.ergast.standings.Driver;
import org.javasoft.epassi.payload.ergast.standings.Manufacturer;

import java.util.ArrayList;

public class Data {

    public static final String ALL_SEASONS_DATA = "{\"MRData\":{\"xmlns\":\"http:\\/\\/ergast.com\\/mrd\\/1.5\",\"series\":\"f1\",\"url\":\"http://ergast.com/api/f1/seasons.json\",\"limit\":\"1000\",\"offset\":" +
            "\"0\",\"total\":\"74\",\"SeasonTable\":{\"Seasons\":[{\"season\":\"1950\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/1950_Formula_One_season\"},{\"season\":\"1951\",\"url\":" +
            "\"http:\\/\\/en.wikipedia.org\\/wiki\\/1951_Formula_One_season\"},{\"season\":\"1952\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/1952_Formula_One_season\"},{\"season\":\"1953\"," +
            "\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/1953_Formula_One_season\"},{\"season\":\"1954\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/1954_Formula_One_season\"},{\"season\":" +
            "\"1955\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/1955_Formula_One_season\"},{\"season\":\"1956\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/1956_Formula_One_season\"},{\"season\":" +
            "\"1957\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/1957_Formula_One_season\"},{\"season\":\"1958\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/1958_Formula_One_season\"},{\"season\":" +
            "\"1959\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/1959_Formula_One_season\"},{\"season\":\"1960\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/1960_Formula_One_season\"},{\"season\":\"1961\"" +
            ",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/1961_Formula_One_season\"},{\"season\":\"1962\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/1962_Formula_One_season\"},{\"season\":\"1963\",\"url\"" +
            ":\"http:\\/\\/en.wikipedia.org\\/wiki\\/1963_Formula_One_season\"},{\"season\":\"1964\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/1964_Formula_One_season\"},{\"season\":\"1965\",\"url\":" +
            "\"http:\\/\\/en.wikipedia.org\\/wiki\\/1965_Formula_One_season\"},{\"season\":\"1966\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/1966_Formula_One_season\"},{\"season\":\"1967\",\"url\":" +
            "\"http:\\/\\/en.wikipedia.org\\/wiki\\/1967_Formula_One_season\"},{\"season\":\"1968\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/1968_Formula_One_season\"},{\"season\":\"1969\",\"url\":" +
            "\"http:\\/\\/en.wikipedia.org\\/wiki\\/1969_Formula_One_season\"},{\"season\":\"1970\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/1970_Formula_One_season\"},{\"season\":\"1971\",\"url\":" +
            "\"http:\\/\\/en.wikipedia.org\\/wiki\\/1971_Formula_One_season\"},{\"season\":\"1972\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/1972_Formula_One_season\"},{\"season\":\"1973\",\"url\":" +
            "\"http:\\/\\/en.wikipedia.org\\/wiki\\/1973_Formula_One_season\"},{\"season\":\"1974\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/1974_Formula_One_season\"},{\"season\":\"1975\",\"url\":" +
            "\"http:\\/\\/en.wikipedia.org\\/wiki\\/1975_Formula_One_season\"},{\"season\":\"1976\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/1976_Formula_One_season\"},{\"season\":\"1977\",\"url\":" +
            "\"http:\\/\\/en.wikipedia.org\\/wiki\\/1977_Formula_One_season\"},{\"season\":\"1978\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/1978_Formula_One_season\"},{\"season\":\"1979\",\"url\"" +
            ":\"http:\\/\\/en.wikipedia.org\\/wiki\\/1979_Formula_One_season\"},{\"season\":\"1980\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/1980_Formula_One_season\"},{\"season\":\"1981\",\"url\"" +
            ":\"http:\\/\\/en.wikipedia.org\\/wiki\\/1981_Formula_One_season\"},{\"season\":\"1982\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/1982_Formula_One_season\"},{\"season\":\"1983\"," +
            "\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/1983_Formula_One_season\"},{\"season\":\"1984\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/1984_Formula_One_season\"},{\"season\":\"1985" +
            "\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/1985_Formula_One_season\"},{\"season\":\"1986\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/1986_Formula_One_season\"},{\"season\":" +
            "\"1987\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/1987_Formula_One_season\"},{\"season\":\"1988\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/1988_Formula_One_season\"},{\"season\":\"1989\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/1989_Formula_One_season\"},{\"season\":\"1990\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/1990_Formula_One_season\"},{\"season\":\"1991\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/1991_Formula_One_season\"},{\"season\":\"1992\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/1992_Formula_One_season\"},{\"season\":\"1993\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/1993_Formula_One_season\"},{\"season\":\"1994\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/1994_Formula_One_season\"},{\"season\":\"1995\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/1995_Formula_One_season\"},{\"season\":\"1996\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/1996_Formula_One_season\"},{\"season\":\"1997\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/1997_Formula_One_season\"},{\"season\":\"1998\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/1998_Formula_One_season\"},{\"season\":\"1999\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/1999_Formula_One_season\"},{\"season\":\"2000\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/2000_Formula_One_season\"},{\"season\":\"2001\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/2001_Formula_One_season\"},{\"season\":\"2002\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/2002_Formula_One_season\"},{\"season\":\"2003\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/2003_Formula_One_season\"},{\"season\":\"2004\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/2004_Formula_One_season\"},{\"season\":\"2005\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/2005_Formula_One_season\"},{\"season\":\"2006\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/2006_Formula_One_season\"},{\"season\":\"2007\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/2007_Formula_One_season\"},{\"season\":\"2008\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/2008_Formula_One_season\"},{\"season\":\"2009\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/2009_Formula_One_season\"},{\"season\":\"2010\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/2010_Formula_One_season\"},{\"season\":\"2011\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/2011_Formula_One_season\"},{\"season\":\"2012\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/2012_Formula_One_season\"},{\"season\":\"2013\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/2013_Formula_One_season\"},{\"season\":\"2014\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/2014_Formula_One_season\"},{\"season\":\"2015\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/2015_Formula_One_season\"},{\"season\":\"2016\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/2016_Formula_One_season\"},{\"season\":\"2017\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/2017_Formula_One_season\"},{\"season\":\"2018\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/2018_Formula_One_World_Championship\"},{\"season\":\"2019\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/2019_Formula_One_World_Championship\"},{\"season\":\"2020\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/2020_Formula_One_World_Championship\"},{\"season\":\"2021\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/2021_Formula_One_World_Championship\"},{\"season\":\"2022\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/2022_Formula_One_World_Championship\"},{\"season\":\"2023\",\"url\":\"https:\\/\\/en.wikipedia.org\\/wiki\\/2023_Formula_One_World_Championship\"}]}}}";

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
