package dataandtime;

import java.time.LocalDate;
import java.time.Period;



public class ComparingDatesPeriod {
	
	public static void main(String[] args) {
		
		LocalDate localDate = LocalDate.of(2021, 01, 01);
		LocalDate localDate1 = LocalDate.of(2023, 12, 31);
		
		Period period = localDate.until(localDate1);
		System.out.println("getDays :" +period.getDays());
		System.out.println("getMonths :" +period.getMonths());
		System.out.println("getYears :" +period.getYears());
		
		Period period1 = Period.ofDays(10);
		System.out.println("Period of Days :" +period1.getDays());
		
		Period period2 = Period.ofYears(10);
		System.out.println("Period of Days :" +period2.getYears());
		
		System.out.println("Total Months : " + period2.toTotalMonths());
		
		Period period4 = Period.between(localDate, localDate1);
		System.out.println("Between :" +period4.getDays() + " : " + period4.getMonths() + " : " + period4.getYears());
		
		
	}

}
