package com.elsevier.javaspringapi.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PatientUtils {


    //This method is created to generate Date based upon Input
    public static Date generateDate(String dateValue) throws ParseException {
        DateFormat df = new SimpleDateFormat("MM-dd-yyyy");
        return df.parse(dateValue);
    }
}
