package org.study.utilEX;

import java.time.LocalDateTime;

public class LocalDateTimeEX02 {
	public static void main(String[] args) {
		System.out.println("LocalDateTime");
		
		//현재 날짜, 시간
		LocalDateTime datetime = LocalDateTime.now();
		System.out.println(datetime);
		
		System.out.println(datetime.getYear());
		System.out.println(datetime.getMonthValue());
		System.out.println(datetime.getDayOfMonth());
		System.out.println(datetime.getDayOfWeek());
		System.out.println(datetime.getHour());
		System.out.println(datetime.getMinute());
		System.out.println(datetime.getSecond());
		System.out.println();
		
		LocalDateTime dateTime2 = LocalDateTime.of(2022, 11, 17, 11, 24, 30);
		
		System.out.println(dateTime2.getYear());
		System.out.println(dateTime2.getMonthValue());
		System.out.println(dateTime2.getDayOfMonth());
		System.out.println(dateTime2.getDayOfWeek());
		System.out.println(dateTime2.getHour());
		System.out.println(dateTime2.getMinute());
		System.out.println(dateTime2.getSecond());
	}
}
