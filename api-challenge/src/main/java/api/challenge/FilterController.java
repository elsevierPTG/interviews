package api.challenge;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class FilterController {

  private static final String template = "Hello, %s!";
  private final AtomicLong counter = new AtomicLong();

  @RequestMapping(value="/filter", method=(RequestMethod.POST))
  public PatientDTO filter(@RequestBody Patient patient) throws ParseException{
    patient.setAge(getAge(patient.getBirthDate()));
    patient.setBirthDate(null);
    patient.setZipCode(resetZipCode(patient.getZipCode()));
    return patient;
  }
  // in a more complex system, this would probably move to a business logic class
  private String getAge(String birthDate) throws ParseException {
    Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(birthDate);
    LocalDate today = LocalDate.now();                          //Today's date
    LocalDate birthday = LocalDate.of(1960, Month.JANUARY, 1);  //Birth date
    Period period = Period.between(birthday, today);
    return period.getYears()>90?"90+":Integer.toString(period.getYears());
  }
  // in a more complex system, this would probably move to a business logic class
  private String resetZipCode(String zipCode) {
    Double MAX_POPULATION = 20000d;
    ZipCodeCache cache = new ZipCodeCache();
    Map<String, Double> zips = cache.getZipCodes();
    if (zips.get(zipCode) > MAX_POPULATION){
      return zipCode.substring(0,2);
    }
    // run out of time, but basically I'd try and collect
    // the stream and/or reduce the stream based on substring
    return zipCode;
  }
}
