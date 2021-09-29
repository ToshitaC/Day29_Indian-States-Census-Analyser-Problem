package com.censusanalyser;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.stream.StreamSupport;
import org.junit.rules.ExpectedException;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

public class CensusAnalyser {
        public int loadIndiaCensusData(String csvFilePath) throws CensusAnalyserException {
            try (Reader reader = Files.newBufferedReader(Paths.get(csvFilePath))) {
                CsvToBean<IndiaCensusCSV>csvToBean = new CsvToBeanBuilder<IndiaCensusCSV>(reader)
                        .withType(IndiaCensusCSV.class)
                        .withIgnoreLeadingWhiteSpace(true)
                        .build();
                Iterable<IndiaCensusCSV> csvIterable = () -> iterator;
                int count = (int) StreamSupport.stream(csvIterable.spliterator(), true).count();
                return count;
            } catch (IOException e) {
                throw new CensusAnalyserException(e.getMessage(), CensusAnalyserException.ExceptionType.CENSUS_FILE_INCORRECT);
            }
            return 0;
        }
    }