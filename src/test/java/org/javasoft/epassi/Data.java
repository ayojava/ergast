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


    public static final String ALL_RACES_DATA = "{\"MRData\":{\"xmlns\":\"http:\\/\\/ergast.com\\/mrd\\/1.5\",\"series\":\"f1\",\"url\":\"http://ergast.com/api/f1/2019.json\",\"limit\":\"1000\",\"offset\":\"0\",\"total\":\"21\",\"RaceTable\":{\"season\":\"2019\",\"Races\":[{\"season\":\"2019\",\"round\":\"1\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/2019_Australian_Grand_Prix\",\"raceName\":\"Australian Grand Prix\",\"Circuit\":{\"circuitId\":\"albert_park\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/Melbourne_Grand_Prix_Circuit\",\"circuitName\":\"Albert Park Grand Prix Circuit\",\"Location\":{\"lat\":\"-37.8497\",\"long\":\"144.968\",\"locality\":\"Melbourne\",\"country\":\"Australia\"}},\"date\":\"2019-03-17\",\"time\":\"05:10:00Z\"},{\"season\":\"2019\",\"round\":\"2\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/2019_Bahrain_Grand_Prix\",\"raceName\":\"Bahrain Grand Prix\",\"Circuit\":{\"circuitId\":\"bahrain\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/Bahrain_International_Circuit\",\"circuitName\":\"Bahrain International Circuit\",\"Location\":{\"lat\":\"26.0325\",\"long\":\"50.5106\",\"locality\":\"Sakhir\",\"country\":\"Bahrain\"}},\"date\":\"2019-03-31\",\"time\":\"15:10:00Z\"},{\"season\":\"2019\",\"round\":\"3\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/2019_Chinese_Grand_Prix\",\"raceName\":\"Chinese Grand Prix\",\"Circuit\":{\"circuitId\":\"shanghai\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/Shanghai_International_Circuit\",\"circuitName\":\"Shanghai International Circuit\",\"Location\":{\"lat\":\"31.3389\",\"long\":\"121.22\",\"locality\":\"Shanghai\",\"country\":\"China\"}},\"date\":\"2019-04-14\",\"time\":\"06:10:00Z\"},{\"season\":\"2019\",\"round\":\"4\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/2019_Azerbaijan_Grand_Prix\",\"raceName\":\"Azerbaijan Grand Prix\",\"Circuit\":{\"circuitId\":\"baku\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/Baku_City_Circuit\",\"circuitName\":\"Baku City Circuit\",\"Location\":{\"lat\":\"40.3725\",\"long\":\"49.8533\",\"locality\":\"Baku\",\"country\":\"Azerbaijan\"}},\"date\":\"2019-04-28\",\"time\":\"12:10:00Z\"},{\"season\":\"2019\",\"round\":\"5\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/2019_Spanish_Grand_Prix\",\"raceName\":\"Spanish Grand Prix\",\"Circuit\":{\"circuitId\":\"catalunya\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/Circuit_de_Barcelona-Catalunya\",\"circuitName\":\"Circuit de Barcelona-Catalunya\",\"Location\":{\"lat\":\"41.57\",\"long\":\"2.26111\",\"locality\":\"Montmeló\",\"country\":\"Spain\"}},\"date\":\"2019-05-12\",\"time\":\"13:10:00Z\"},{\"season\":\"2019\",\"round\":\"6\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/2019_Monaco_Grand_Prix\",\"raceName\":\"Monaco Grand Prix\",\"Circuit\":{\"circuitId\":\"monaco\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/Circuit_de_Monaco\",\"circuitName\":\"Circuit de Monaco\",\"Location\":{\"lat\":\"43.7347\",\"long\":\"7.42056\",\"locality\":\"Monte-Carlo\",\"country\":\"Monaco\"}},\"date\":\"2019-05-26\",\"time\":\"13:10:00Z\"},{\"season\":\"2019\",\"round\":\"7\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/2019_Canadian_Grand_Prix\",\"raceName\":\"Canadian Grand Prix\",\"Circuit\":{\"circuitId\":\"villeneuve\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/Circuit_Gilles_Villeneuve\",\"circuitName\":\"Circuit Gilles Villeneuve\",\"Location\":{\"lat\":\"45.5\",\"long\":\"-73.5228\",\"locality\":\"Montreal\",\"country\":\"Canada\"}},\"date\":\"2019-06-09\",\"time\":\"18:10:00Z\"},{\"season\":\"2019\",\"round\":\"8\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/2019_French_Grand_Prix\",\"raceName\":\"French Grand Prix\",\"Circuit\":{\"circuitId\":\"ricard\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/Paul_Ricard_Circuit\",\"circuitName\":\"Circuit Paul Ricard\",\"Location\":{\"lat\":\"43.2506\",\"long\":\"5.79167\",\"locality\":\"Le Castellet\",\"country\":\"France\"}},\"date\":\"2019-06-23\",\"time\":\"13:10:00Z\"},{\"season\":\"2019\",\"round\":\"9\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/2019_Austrian_Grand_Prix\",\"raceName\":\"Austrian Grand Prix\",\"Circuit\":{\"circuitId\":\"red_bull_ring\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/Red_Bull_Ring\",\"circuitName\":\"Red Bull Ring\",\"Location\":{\"lat\":\"47.2197\",\"long\":\"14.7647\",\"locality\":\"Spielberg\",\"country\":\"Austria\"}},\"date\":\"2019-06-30\",\"time\":\"13:10:00Z\"},{\"season\":\"2019\",\"round\":\"10\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/2019_British_Grand_Prix\",\"raceName\":\"British Grand Prix\",\"Circuit\":{\"circuitId\":\"silverstone\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/Silverstone_Circuit\",\"circuitName\":\"Silverstone Circuit\",\"Location\":{\"lat\":\"52.0786\",\"long\":\"-1.01694\",\"locality\":\"Silverstone\",\"country\":\"UK\"}},\"date\":\"2019-07-14\",\"time\":\"13:10:00Z\"},{\"season\":\"2019\",\"round\":\"11\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/2019_German_Grand_Prix\",\"raceName\":\"German Grand Prix\",\"Circuit\":{\"circuitId\":\"hockenheimring\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/Hockenheimring\",\"circuitName\":\"Hockenheimring\",\"Location\":{\"lat\":\"49.3278\",\"long\":\"8.56583\",\"locality\":\"Hockenheim\",\"country\":\"Germany\"}},\"date\":\"2019-07-28\",\"time\":\"13:10:00Z\"},{\"season\":\"2019\",\"round\":\"12\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/2019_Hungarian_Grand_Prix\",\"raceName\":\"Hungarian Grand Prix\",\"Circuit\":{\"circuitId\":\"hungaroring\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/Hungaroring\",\"circuitName\":\"Hungaroring\",\"Location\":{\"lat\":\"47.5789\",\"long\":\"19.2486\",\"locality\":\"Budapest\",\"country\":\"Hungary\"}},\"date\":\"2019-08-04\",\"time\":\"13:10:00Z\"},{\"season\":\"2019\",\"round\":\"13\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/2019_Belgian_Grand_Prix\",\"raceName\":\"Belgian Grand Prix\",\"Circuit\":{\"circuitId\":\"spa\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/Circuit_de_Spa-Francorchamps\",\"circuitName\":\"Circuit de Spa-Francorchamps\",\"Location\":{\"lat\":\"50.4372\",\"long\":\"5.97139\",\"locality\":\"Spa\",\"country\":\"Belgium\"}},\"date\":\"2019-09-01\",\"time\":\"13:10:00Z\"},{\"season\":\"2019\",\"round\":\"14\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/2019_Italian_Grand_Prix\",\"raceName\":\"Italian Grand Prix\",\"Circuit\":{\"circuitId\":\"monza\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/Autodromo_Nazionale_Monza\",\"circuitName\":\"Autodromo Nazionale di Monza\",\"Location\":{\"lat\":\"45.6156\",\"long\":\"9.28111\",\"locality\":\"Monza\",\"country\":\"Italy\"}},\"date\":\"2019-09-08\",\"time\":\"13:10:00Z\"},{\"season\":\"2019\",\"round\":\"15\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/2019_Singapore_Grand_Prix\",\"raceName\":\"Singapore Grand Prix\",\"Circuit\":{\"circuitId\":\"marina_bay\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/Marina_Bay_Street_Circuit\",\"circuitName\":\"Marina Bay Street Circuit\",\"Location\":{\"lat\":\"1.2914\",\"long\":\"103.864\",\"locality\":\"Marina Bay\",\"country\":\"Singapore\"}},\"date\":\"2019-09-22\",\"time\":\"12:10:00Z\"},{\"season\":\"2019\",\"round\":\"16\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/2019_Russian_Grand_Prix\",\"raceName\":\"Russian Grand Prix\",\"Circuit\":{\"circuitId\":\"sochi\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/Sochi_Autodrom\",\"circuitName\":\"Sochi Autodrom\",\"Location\":{\"lat\":\"43.4057\",\"long\":\"39.9578\",\"locality\":\"Sochi\",\"country\":\"Russia\"}},\"date\":\"2019-09-29\",\"time\":\"11:10:00Z\"},{\"season\":\"2019\",\"round\":\"17\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/2019_Japanese_Grand_Prix\",\"raceName\":\"Japanese Grand Prix\",\"Circuit\":{\"circuitId\":\"suzuka\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/Suzuka_Circuit\",\"circuitName\":\"Suzuka Circuit\",\"Location\":{\"lat\":\"34.8431\",\"long\":\"136.541\",\"locality\":\"Suzuka\",\"country\":\"Japan\"}},\"date\":\"2019-10-13\",\"time\":\"05:10:00Z\"},{\"season\":\"2019\",\"round\":\"18\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/2019_Mexican_Grand_Prix\",\"raceName\":\"Mexican Grand Prix\",\"Circuit\":{\"circuitId\":\"rodriguez\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/Aut%C3%B3dromo_Hermanos_Rodr%C3%ADguez\",\"circuitName\":\"Autódromo Hermanos Rodríguez\",\"Location\":{\"lat\":\"19.4042\",\"long\":\"-99.0907\",\"locality\":\"Mexico City\",\"country\":\"Mexico\"}},\"date\":\"2019-10-27\",\"time\":\"19:10:00Z\"},{\"season\":\"2019\",\"round\":\"19\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/2019_United_States_Grand_Prix\",\"raceName\":\"United States Grand Prix\",\"Circuit\":{\"circuitId\":\"americas\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/Circuit_of_the_Americas\",\"circuitName\":\"Circuit of the Americas\",\"Location\":{\"lat\":\"30.1328\",\"long\":\"-97.6411\",\"locality\":\"Austin\",\"country\":\"USA\"}},\"date\":\"2019-11-03\",\"time\":\"19:10:00Z\"},{\"season\":\"2019\",\"round\":\"20\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/2019_Brazilian_Grand_Prix\",\"raceName\":\"Brazilian Grand Prix\",\"Circuit\":{\"circuitId\":\"interlagos\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/Aut%C3%B3dromo_Jos%C3%A9_Carlos_Pace\",\"circuitName\":\"Autódromo José Carlos Pace\",\"Location\":{\"lat\":\"-23.7036\",\"long\":\"-46.6997\",\"locality\":\"São Paulo\",\"country\":\"Brazil\"}},\"date\":\"2019-11-17\",\"time\":\"17:10:00Z\"},{\"season\":\"2019\",\"round\":\"21\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/2019_Abu_Dhabi_Grand_Prix\",\"raceName\":\"Abu Dhabi Grand Prix\",\"Circuit\":{\"circuitId\":\"yas_marina\",\"url\":\"http:\\/\\/en.wikipedia.org\\/wiki\\/Yas_Marina_Circuit\",\"circuitName\":\"Yas Marina Circuit\",\"Location\":{\"lat\":\"24.4672\",\"long\":\"54.6031\",\"locality\":\"Abu Dhabi\",\"country\":\"UAE\"}},\"date\":\"2019-12-01\",\"time\":\"13:10:00Z\"}]}}}\n";




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
