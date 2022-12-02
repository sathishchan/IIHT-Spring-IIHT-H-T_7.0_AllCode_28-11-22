package com.basics.dateandtime;

import java.text.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class DateTime {

	public static void main(String[] args) {
		//Date today = new Date();
		//we dont need new because we dont to create a new object
		LocalDate today = LocalDate.of(2022,Month.AUGUST,15);
		System.out.println(today);
		
		LocalDateTime rightnow = LocalDateTime.now();
		System.out.println(rightnow);
		
		LocalTime time1 = LocalTime.now(ZoneId.of("CET"));
		System.out.println(time1);

	}

}
