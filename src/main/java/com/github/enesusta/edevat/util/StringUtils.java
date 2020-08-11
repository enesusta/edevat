package com.github.enesusta.edevat.util;

import java.util.Locale;

public class StringUtils {

    public static String capitalizeWithTurkish(String string) {
        Locale locale = Locale.forLanguageTag("tr-TR");
        StringBuilder stringBuilder = new StringBuilder();
        String temp = string.toLowerCase(locale);
        String first = temp.substring(0, 1).toUpperCase(locale);
        stringBuilder.append(first).append(temp.substring(1));
        return stringBuilder.toString();
    }
}
