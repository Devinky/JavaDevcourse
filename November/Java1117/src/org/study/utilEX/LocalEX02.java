package org.study.utilEX;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class LocalEX02 {
	
	public static void main(String[] args) {
		
		//날짜를 비교할 수 있다
		LocalDateTime startDateTime = LocalDateTime.now();
		LocalDateTime endDateTime = LocalDateTime.of(2023, 8, 1, 23, 59, 59);
		
		System.out.println("기준 날짜 : " + startDateTime);
		System.out.println("비교 날짜 : " + endDateTime);
		
		//기준날짜가 비교날짜보다 이전인지?
		boolean bool = startDateTime.isBefore(endDateTime);
		System.out.println(bool);
		
		//같은 날짜인지?
		bool = startDateTime.isEqual(endDateTime);
		System.out.println(bool);
		
		//이후 날짜인지?
		bool = startDateTime.isAfter(endDateTime);
		System.out.println(bool);
		
		if(startDateTime.isAfter(endDateTime)) {
			System.out.println("선택날짜 이후입니다.");
		}else {
			System.out.println("선택날짜 이후가 아닙니다.");
		}
		
		ZonedDateTime utcZone = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println(utcZone);
		
		ZonedDateTime kstZone = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println(kstZone);
		
	}
	
}
