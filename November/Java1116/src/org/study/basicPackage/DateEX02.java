package org.study.basicPackage;

import java.util.Date;

public class DateEX02 {
	public static void main(String[] args) {
		System.out.println("Date");
		
		Date now = new Date();
		System.out.println(now);
		
		//일요일은 0, 월요일은 1, 화요일은 2, 수요일은 3, 목요일은 4, 금요일은 5, 토요일은 6
		//나머지 요일 선택시 오류
		//switch문 이용, 오늘 날짜를 Date의 getDay() 메서드를 이용해서 콘솔에 요일 출력
		
		int weekday = now.getDay();
		
		switch(weekday) {
		case 0:
			System.out.println("일요일");
			break;
		case 1:
			System.out.println("월요일");
			break;
		case 2:
			System.out.println("화요일");
			break;
		case 3:
			System.out.println("수요일");
			break;
		case 4:
			System.out.println("목요일");
			break;
		case 5:
			System.out.println("금요일");
			break;
		case 6:
			System.out.println("토요일");
			break;
		default:
			System.out.println("요일 오류");
		}
	}

}
