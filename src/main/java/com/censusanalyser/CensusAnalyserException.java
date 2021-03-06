package com.censusanalyser;

public class CensusAnalyserException extends Exception {
    private static final long serialVersionUID = 1L;

    public enum ExceptionType {
        CENSUS_FILE_INCORRECT, CENSUS_INCORRECT_FILE_FORMAT;
    }

    public ExceptionType type;

    public CensusAnalyserException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }
}
