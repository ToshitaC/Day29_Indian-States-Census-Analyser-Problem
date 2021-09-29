package com.censusanalyser;

import org.junit.Assert;
import org.junit.Test;
import com.censusanalyser.CensusAnalyser;

import java.io.IOException;

public class CensusAnalyserTest {

    private String INIDAN_CENSUS_CSV_FILE_PATH = "./src/main/resources/IndiaStateCensusData.csv";

    @Test
    public void givenIndianCensusCSVFile_WhenLoad_ShouldReturnCorrectRecords() {
        CensusAnalyser censusAnalyser = new com.censusanalyser.CensusAnalyser();
        int count = censusAnalyser.loadIndiaCensusData(INIDAN_CENSUS_CSV_FILE_PATH);
        Assert.assertEquals(29, count);
    }

    @Test
    public void givenIndianCensusCSVFile_WhenLoad_ShouldReturnCorrectRecords() {
        CensusAnalyser censusAnalyser = new CensusAnalyser();
        int count = censusAnalyser.loadIndiaCensusData(INIDAN_CENSUS_CSV_FILE_PATH);
        Assert.assertEquals(29, count);
    }
}



