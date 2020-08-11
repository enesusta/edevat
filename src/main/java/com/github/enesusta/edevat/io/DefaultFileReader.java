package com.github.enesusta.edevat.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public final class DefaultFileReader implements FileReader {

    @Override
    public final Queue<String> readFile(final File file) {

        final Queue<String> stringQueue = new LinkedList<>();

        try (InputStream inputStream =
                 new FileInputStream(file)) {

            final Scanner scanner = new Scanner(inputStream);
            scanner.useDelimiter("\n");

            while (scanner.hasNext()) stringQueue.offer(scanner.next());

        } catch (IOException e) {
            e.printStackTrace();
        }

        return stringQueue;
    }
}
