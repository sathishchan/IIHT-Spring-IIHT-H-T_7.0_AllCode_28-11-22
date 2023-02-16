package dataandtime;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Localdate {
	
	public static void main(String[] args) {
		
		LocalDate localDate = LocalDate.now();
		System.out.println("LocalDate :" +localDate);
		
		/**
		 * of method
		 */
		
		LocalDate localDate1 = LocalDate.of(2023, 02, 14);
		System.out.println("LocalDateOf :" +localDate1);
		
		LocalDate localDate2 = LocalDate.ofYearDay(2023, 365);
		System.out.println("LocalDateOf :" +localDate2);
		
		/**
		 * get values from localDate
		 */
		
		System.out.println("Get method getDayOfYear :" + localDate.getDayOfYear());
		System.out.println("Get method ChronoField.DAY_OF_MONTH :" + localDate.get(ChronoField.DAY_OF_MONTH));
		
		/**
		 * Modifying localDate
		 */
		
		System.out.println("Modify LocalDate plusDate :" +localDate.plusDays(2));
		System.out.println("Modify LocalDate minusDays :" +localDate.minusDays(2));
		System.out.println("Modify LocalDate withDayOfYear :" + localDate.withDayOfYear(2));
		System.out.println("Modify LocalDate ChronoField.DAY_OF_MONTH :" + localDate.with(ChronoField.DAY_OF_MONTH, 2));
		System.out.println("Modify LocalDate TemporalAdjusters.firstDayOfMonth :" + localDate.with(TemporalAdjusters.firstDayOfMonth()));
		System.out.println("Modify LocalDate localDate.minus(1,ChronoUnit.YEARS) :" + localDate.minus(1,ChronoUnit.YEARS));
		
		/**
		 * Additional support methods
		 */
		
		System.out.println("Leap Year :" + localDate.ofYearDay(2020, 1).isLeapYear());
		System.out.println("isEqual :" + localDate.isEqual(localDate1));
		System.out.println("isBefore :" + localDate.isBefore(localDate1));
		System.out.println("isAfter :" + localDate1.isAfter(localDate));
		System.out.println("isSupported :" + localDate.isSupported(ChronoUnit.MINUTES));
		System.out.println("isSupported :" + localDate.isSupported(ChronoUnit.YEARS));
	}

}
