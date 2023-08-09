package org.javasoft.epassi.payload.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rank {

    private int season;

    private List<AverageSpeedRank> speedRankList;
}
