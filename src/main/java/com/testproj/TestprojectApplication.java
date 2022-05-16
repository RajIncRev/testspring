package com.testproj;

import java.awt.List;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.joda.time.DateTime;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestprojectApplication 
{
	   public enum Months {NONE,JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC}
	public static void main(String[] args) {
		SpringApplication.run(TestprojectApplication.class, args);
		
		System.out.println(LocalDateTime.now());
		double input = 0.4358;
		
		Date dt = addDaysToDate("2020-01-06 00:00",7);
	
		@SuppressWarnings("deprecation")
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2020);
		cal.set(Calendar.MONTH, Calendar.FEBRUARY);
		cal.set(Calendar.DAY_OF_MONTH, 3);
		cal.set(Calendar.HOUR, 15);
		cal.set(Calendar.MINUTE,46);
		cal.set(Calendar.SECOND,21);
		//cal.set(Calendar.MILLISECOND,793);
		
		 Long abc = dt.getTime();
		 Calendar t = cal.getInstance();
		 Date c =  cal.getTime();
		 Long def = cal.getTimeInMillis();
		double a = Math.round(input);
		 System.out.println(a);
		String s = "2019-10-01";
        String e = "2020-02-25";
        String s1[] = s.split("-");
       
        String e1[] = e.split("-");
        int syear = Integer.parseInt(s1[0]);
        int smonth = Integer.parseInt(s1[1]);
        System.out.println(smonth);
        int sday = Integer.parseInt(s1[2]);
        int fyear = Integer.parseInt(e1[0]);
        int fmonth = Integer.parseInt(e1[1]);
        int fday = Integer.parseInt(e1[0]);

        if (syear == fyear) {
            for (int i = smonth; i < fmonth; i++) {
                System.out.println(Months.values()[i] + "-" + syear);
            }
        }
        else {
            int i = 0;

            while (syear <= fyear) {
                if (syear < fyear) {
                    for (i = smonth; i <= 12; i++) {
                        System.out.println(Months.values()[i] + "-" + syear);
                    }
                    i = 1;
                    syear++;
                } else {
                    for (; i <= fmonth; i++) {
                        System.out.println(Months.values()[i] + "-" + syear);
                    }
                    break;
                }
            }
        }
	}
	
	public static Date addDaysToDate(Date date, int noOfDays) {
		//String dt="2020-02-05 13:16";
		String convertedDate="";
		if(date.toString().indexOf(" ")>0) {
			convertedDate = date.toString().substring(0, date.toString().indexOf(" "));
		}
		org.joda.time.format.DateTimeFormatter formatter = org.joda.time.format.DateTimeFormat.forPattern("yyyy-MM-dd");
		DateTime dateTime = formatter.parseDateTime(convertedDate);

		DateTime addDays = dateTime.plusDays(noOfDays);
	//	org.joda.time.format.DateTimeFormatter dtfOut = org.joda.time.format.DateTimeFormat.forPattern("yyyy-MM-dd");
		//String oneDayPlusString = addDays.toString(formatter);
		//return formatter.parseDateTime(oneDayPlusString);
		Date javaDate = new java.util.Date(addDays.getMillis());
		return javaDate;
	}
	
	public static Date addDaysToDate(String date, int noOfDays) {
		//String dt="2014-04-25";
		if(date.indexOf(" ")>0) {
			date = date.substring(0, date.indexOf(" "));
		}
		org.joda.time.format.DateTimeFormatter formatter = org.joda.time.format.DateTimeFormat.forPattern("yyyy-MM-dd");
		DateTime dateTime = formatter.parseDateTime(date);

		DateTime addDays = dateTime.plusDays(noOfDays);
	//	org.joda.time.format.DateTimeFormatter dtfOut = org.joda.time.format.DateTimeFormat.forPattern("yyyy-MM-dd");
		//String oneDayPlusString = addDays.toString(formatter);
		//return formatter.parseDateTime(oneDayPlusString);
		Date javaDate = new java.util.Date(addDays.getMillis());
		return javaDate;
	}

}
/*
else {
int i = 0;

while (syear <= fyear) {
    if (syear < fyear) {
        for (i = smonth-1; i < 12; i++) {
            System.out.println(Months.values()[i] + "-" + syear);
        }
        i = 1;
        syear++;
    } else {
        for (; i < fmonth; i++) {
            System.out.println(Months.values()[i] + "-" + syear);
        }
    }
}
}*/