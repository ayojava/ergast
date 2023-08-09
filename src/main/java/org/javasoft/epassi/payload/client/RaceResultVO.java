package org.javasoft.epassi.payload.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RaceResultVO {

    private String position ;

    private String pilotName ;

    private int points;
}
