package org.study.basicPackage;

import java.util.Date;

public class DateEX01 {
	public static void main(String[] args) {
		System.out.println("Date");
		
		Date now = new Date();
		System.out.println(now);
		//요일 달 날짜 시:분:초 
		
//		System.out.println(now.getYear()+ 1900); //연도출력(1900부터 시작함)
//		System.out.println(now.getMonth()+1); //월출력(0부터 시작함)
//		System.out.println(now.getDate()); //일
//		System.out.println(now.getHours()); //시
//		System.out.println(now.getSeconds()); //분
//		System.out.println(now.getMinutes()); //초
//		System.out.println(now.getDay()); //요일 -> 일요일은 0
		
		int year = now.getYear()+1900;
		int month = now.getMonth()+1;
		int date = now.getDate();
		int hour = now.getHours();
		int seconds = now.getSeconds();
		int minutes = now.getMinutes();
		int day = now.getDay();
		
		
		System.out.println(year + "년 " + month + "월 " + date + "일 " + hour + "시 " + minutes + "분 " + seconds + "초 ");
	}

}
