package com.practo.movies.utils;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class DateUtil {
	
   public static Date addDays(Date date, int days) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, days); //minus number would decrement the days
        return cal.getTime();
    }

public static DateTime convertUTCToTZ(DateTime paymentsDate) {
	DateTime dtIST = paymentsDate.withZone(DateTimeZone.forTimeZone(TimeZone.getTimeZone("IST")));
	return dtIST;
}

public static DateTime getTimeDifference(DateTime paymentsDate, DateTime endTime) {
	// TODO Auto-generated method stub
	return null;
}

public static DateTime timezoneToUTC(DateTime date) {
	DateTime dtUTC = date.withZone(DateTimeZone.forTimeZone(TimeZone.getTimeZone("IST")));
	return dtUTC;
}

public static String getDateString(DateTime date) {
	DateTimeFormatter fmt = DateTimeFormat.forPattern("yyyy/MM/dd HH:mm");
	String str = fmt.print(date);
	return str;
}	
}
