package com.rochacamargovitor.algasensors.device.management;

import io.hypersistence.tsid.TSID;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class TSIDTest {

    @Test
    void IdGenerator() {
        TSID tsid = IdGenerator.generateTSID();
        Assertions.assertThat(tsid.getInstant())
                .isCloseTo(Instant.now(), Assertions.within(1, ChronoUnit.MINUTES));
    }

}
