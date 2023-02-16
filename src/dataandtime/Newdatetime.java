package dataandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Newdatetime {
	
	public static void main(String[] args) {
		
		LocalDate localDate = LocalDate.now();
		System.out.println("LocalDate :" +localDate);
		
		
		LocalTime localTime = LocalTime.now();
		System.out.println("LocalTime :" +localTime);
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("LocalDateTime :" +localDateTime);
		
		LocalDate localDate01 = LocalDate.of(2023, 01, 01);
		System.out.println("Converting atTime :" + localDate01.atTime(localTime));
		
		System.out.println("Converting atDate :" + localTime.atDate(localDate));
		
		LocalDateTime localDateTime1 = localTime.atDate(localDate);
		System.out.println("toLocalDate :" + localDateTime1.toLocalDate());
		System.out.println("toLocalTime :" + localDateTime1.toLocalTime());
		
	}

}
