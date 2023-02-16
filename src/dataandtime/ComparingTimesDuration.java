package dataandtime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ComparingTimesDuration {
	
	public static void main(String[] args) {
		
		LocalTime localTime = LocalTime.of(7, 50);
		LocalTime localTime1 = LocalTime.of(8, 50);
		
		long diff = localTime.until(localTime1, ChronoUnit.MINUTES);
		System.out.println("Diff : " + diff);
		
		Duration duration = Duration.between(localTime, localTime1);
		System.out.println("Duration between : " + duration.toMinutes());
		
		Duration duration1 = Duration.ofHours(3);
		System.out.println("Duration ofHours : " + duration1.toMinutes());
		
		LocalDate localDate = LocalDate.now();
		LocalDate localDate1 = LocalDate.now().plusDays(5);
		
//		Duration duration2 = Duration.between(localDate, localDate1);
//		System.out.println("LocalDate : " + duration.toMinutes());
	}

}
