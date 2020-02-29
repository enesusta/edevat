package com.github.enesusta.edevat.util;

public class Stopwatch {

    private static long start;
    private static long end;
    private static Stopwatch instance;

    public static Stopwatch start() {
        instance = new Stopwatch();
        start = System.currentTimeMillis();
        return instance;
    }

    public long stop() {
        end = System.currentTimeMillis();
        return end - start;
    }
}
