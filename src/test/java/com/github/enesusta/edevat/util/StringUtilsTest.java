package com.github.enesusta.edevat.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    public void should_return_sanliurfa() {

        String sanliurfa = StringUtils.capitalizeWithTurkish("şanlıurfa");
        assertEquals("Şanlıurfa", sanliurfa);

    }

    @Test
    public void should_return_istanbul() {

        String istanbul = StringUtils.capitalizeWithTurkish("istanbul");
        assertEquals("İstanbul", istanbul);

    }

}
