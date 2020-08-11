package com.github.enesusta.edevat.io;

import java.io.File;
import java.util.Collection;

public interface FileTraverser {
    Collection<File> traverseFiles(FileType... fileTypes);
}
