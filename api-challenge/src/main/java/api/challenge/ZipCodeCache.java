package api.challenge;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.*;

@Component
public class ZipCodeCache {

  private static Map<String, Double> zipCodesByPopulation;

  ZipCodeCache() {
    try {
      this.zipCodesByPopulation = readZipCodes();
    } catch (IOException ie) {
      // should never ignore this.!!!
      ie.printStackTrace();
    }
  }

  public Map<String, Double> getZipCodes() {
    return zipCodesByPopulation;
  }

  public Map<String, Double> readZipCodes() throws IOException {
    Map<String, Double> map = new HashMap();

    Reader reader = new BufferedReader(new InputStreamReader(
        getClass().getClassLoader().getResourceAsStream("population_by_zcta_2010.csv")));
    CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);

    for (CSVRecord csvRecord : csvParser) {
      map.put(csvRecord.get(0), Double.valueOf(csvRecord.get(1)));
    }
    return map;
  }
}
