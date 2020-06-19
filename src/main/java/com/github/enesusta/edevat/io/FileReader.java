package com.github.enesusta.edevat.io;

import java.io.File;
import java.util.Queue;

public interface FileReader {
    Queue<String> readFile(File file);
}
