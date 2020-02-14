package com.github.enesusta.edevat.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StopwatchTest {

    @Test
    public void basicTest() throws InterruptedException {
        Stopwatch start = Stopwatch.start();
        Thread.sleep(4000);
        assertEquals(4000, start.stop());
    }

}
