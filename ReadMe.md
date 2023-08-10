# Getting Started 

* Clone the application , and open the command prompt from the home directory
* Build the application - 

```bash
  mvn clean install
```

* Build the docker image - 
```bash
  docker-compose build
```

* Run the application  - 

```bash
  docker-compose up
```
# Calling the Endpoints
* The Endpoints require to pass the following header key and value to access the api
```bash
  Header Value : [ X-API-TOKEN ]
```
```bash
  Header Key : [ EPASSI ]
```

* **ALL SEASONS ENDPOINT :**  Returns a list of all seasons 
 ```bash
  GET REQUEST - http://localhost:8080/ergast/api/allSeasons
```

* **FINAL STANDINGS ENDPOINT :**  Show the final standings for the season, with pilots, constructors, and points
 ```bash
  GET REQUEST - http://localhost:8080/ergast/api/finalStanding?season=2003
```

* **ALL RACES ENDPOINT :**  List the races for a season
 ```bash
  GET REQUEST - http://localhost:8080/ergast/api/allRaces?season=2003
```

* **STARTING GRID ENDPOINT :**  Show the starting grid with the position, pilot name and qualifying time for each pilot
 ```bash
  GET REQUEST - http://localhost:8080/ergast/api/grid?season=2003&race=1
```

* **RACE ENDPOINT :**  Show the result of the race with the position, pilot name and number of points for each pilot
 ```bash
  GET REQUEST - http://localhost:8080/ergast/api/race?season=2003&race=1
```

* **RANK BY AVERAGE SPEED ENDPOINT :**  Selects the top performers in every race at that season and then orders by average speed in ascending order
 ```bash
  GET REQUEST - http://localhost:8080/ergast/api/rank?season=2009
```
