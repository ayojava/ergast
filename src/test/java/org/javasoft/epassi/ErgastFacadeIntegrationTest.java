package org.javasoft.epassi;

import lombok.extern.slf4j.Slf4j;
import org.javasoft.epassi.cache.CacheService;
import org.javasoft.epassi.facade.ErgastFacade;
import org.javasoft.epassi.payload.client.AverageSpeedRank;
import org.javasoft.epassi.payload.client.Rank;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@Slf4j
@ExtendWith(MockitoExtension.class)
public class ErgastFacadeIntegrationTest {
    @Mock
    private CacheService cacheService;

    @InjectMocks
    private ErgastFacade ergastFacade;

    @Test
    void testScoreSystemByAverageSpeed() {
        when(cacheService.otherScoringSystems("2013"))
                .thenReturn(Data.getRacePositionMRData("2013"));

        Rank rank = ergastFacade.scoreSystemByAverageSpeed(2013);

        assertEquals(2013, rank.getSeason());
        List<AverageSpeedRank> speedRankList = rank.getSpeedRankList();

        assertThat(speedRankList)
                .hasSize(3)
                .extracting(AverageSpeedRank::getAverageSpeed)
                .containsExactly("120.891 kph", "216.891 kph", "256.891 kph");

    }
}
