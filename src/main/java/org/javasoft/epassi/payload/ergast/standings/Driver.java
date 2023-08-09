package org.javasoft.epassi.payload.ergast.standings;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Driver {

    private String driverId;

    private String permanentNumber;

    private String code;

    private String url;

    @JsonProperty("givenName")
    private String firstName;

    @JsonProperty("familyName")
    private String lastName;

    private String dateOfBirth;

    private String nationality;
}
