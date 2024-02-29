package com.codex.lab.util.constants;

public class ApplicationConstants {

    private ApplicationConstants(){
        throw new IllegalStateException(String.format("%s class can't be instantiated","ApplicationConstants" ));
    }

    public static final String JYTHON_LIB_PATH = "src/main/resources/lib/jython-standalone-2.7.3.jar/Lib";

    public static  final String INVALID_PYTHON_SYNTAX = "Invalid python syntax";
}
