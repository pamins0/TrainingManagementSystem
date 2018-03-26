/**
 * 
 */
package com.yash.tms.util;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;


/**
 * This utility class will perform some utility operations like calculate no. of
 * days and weeks form given two dates.
 * 
 * @author Sawan.parmar
 *
 */
public class CourseUtill {
	/**
	 * variable will be used to store the no. of days.
	 */
	static int days = 0;
	/**
	 * This method will calculate the no. of days form given startDate and endDate excluding SATURDAY and SUNDAY(weekends).
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public static int calculateDays(Date startDate, Date endDate) {
		/**
		 * conversion of startDate(utilDate) to LocalDate.
		 */
		LocalDate dateFirst = startDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		/**
		 * conversion of endDate(utilDate) to LocalDate.
		 */
		LocalDate dateLast = endDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		
		while (dateFirst.isBefore(dateLast) || dateFirst.isEqual(dateLast)) {
			DayOfWeek dayOfWeek = dateFirst.getDayOfWeek();

			if (!(dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY)) {
				days++;
			}
			dateFirst = dateFirst.plusDays(1);
		}
		//System.out.println(days);
		return days;
	}
	
	/**
	 * This method will return total no. of weeks in decimal(weeks.days) from two given dates of total working days(total 5 working days).
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public static double calculateWeeks(Date startDate, Date endDate) {
		/**
		 * This variable contains the mantissa part of week. Eg:-mantissa.characteristic
		 */
		int weeksMantissa= 0;
		/**
		 * This variable contains the characteristic part of week. Eg:-mantissa.characteristic
		 */
		int weeksCharacteristic = 0;
		/**
		 * Used to add mantissa and characteristic in string format.
		 */
		String totalWeeksString=null;
		/**
		 * used to store total weeks in double format.
		 */
		double totalWeeks=0;
		
		System.out.println(days);
		weeksMantissa= days/5;
		weeksCharacteristic= days%5;
		totalWeeksString=weeksMantissa+"."+weeksCharacteristic;
		totalWeeks=Double.parseDouble(totalWeeksString);
		//System.out.println("Total no of weeks-------> "+totalWeeks);
		days=0;
		return totalWeeks;
		
	}
}
