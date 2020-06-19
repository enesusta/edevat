package com.github.enesusta.edevat.io;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.util.Arrays;
import java.util.Collection;

public final class DefaultFileTraverser implements FileTraverser {

    @Override
    public final Collection<File> traverseFiles(final FileType... fileTypes) {
        final String[] extensions = Arrays.stream(fileTypes).map(FileType::getType).toArray(String[]::new);
        return FileUtils.listFiles(new File("."), extensions, true);
    }
}
