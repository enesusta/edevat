package com.github.enesusta.edevat.io;

public enum FileType {

    JAVA("java"),
    TXT("txt");

    private final String type;

    FileType(final String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
