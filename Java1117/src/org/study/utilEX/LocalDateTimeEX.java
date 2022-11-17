package org.study.utilEX;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalDateTimeEX {
	public static void main(String[] args) {
		System.out.println("LocalDateTime");
		
		LocalDate lDate = LocalDate.now(); //날짜
		LocalTime lTime = LocalTime.now(); //시간
		
		int year = lDate.getYear();
		System.out.println(lDate.getMonth());
		System.out.println(lDate.getMonthValue());
		
		int month = lDate.getMonthValue();
		int day = lDate.getDayOfMonth();
		
		int hour = lTime.getHour();
		int minute = lTime.getMinute();
		int second = lTime.getSecond();
		
		System.out.println(year + "년 " + month + "월 " + day + "일 " + hour + "시 " + minute + "분 " + second + "초");
	}
}
