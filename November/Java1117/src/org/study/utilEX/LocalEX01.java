package org.study.utilEX;

import java.time.LocalDateTime;

public class LocalEX01 {
	
	public static void main(String[] args) {
		//날짜조절메서드
		//.plus~면 더하기 ,.min~면 빼기
		//LocalTime, LocalDateTime, ZonedDateTime
		//클래스는 각각 시간, 분, 초, 나노초를 더하거나 뺄 수 있다
		
		LocalDateTime curDateTime = LocalDateTime.now();
		LocalDateTime tarDateTime = curDateTime.plusYears(11); //년도 더하기

		System.out.println("현재 날짜와 시간 : " + curDateTime);
		System.out.println(tarDateTime);
	
		tarDateTime = curDateTime.plusMonths(5); //월 더하기
		System.out.println(tarDateTime);

		tarDateTime = curDateTime.minusMonths(5); //월 빼기
		System.out.println(tarDateTime);

		tarDateTime = curDateTime.plusDays(5); //일 더하기
		System.out.println(tarDateTime);
		
		tarDateTime = curDateTime.minusDays(5); //일 빼기
		System.out.println(tarDateTime);
		
		tarDateTime = curDateTime.plusWeeks(5); //주 더하기
		System.out.println(tarDateTime);
		
		tarDateTime = curDateTime.minusWeeks(5); //주 빼기
		System.out.println(tarDateTime);
	
	
	}
	
}
