package com.codex.lab.util.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum CodeLanguages {

    PYTHON(1, "python"),
    JAVA(2, "java"),
    JAVASCRIPT(3, "javascript");


    private final int code;
    private final String value;
}
