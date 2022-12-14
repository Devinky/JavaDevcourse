package org.study.basicPackage;

import java.util.Calendar;

public class CalendarEX {
	
	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance(); //싱글톤?
		//객체 생성 불가능해서(new X) static메서드로 접근한다
		System.out.println(now.getTime()); //현재시간
		
		System.out.println(now.get(Calendar.YEAR)); //년
		System.out.println(now.get(Calendar.MONTH)+1); //월
		System.out.println(now.get(Calendar.DATE)); //일
		System.out.println(now.get(Calendar.HOUR)); //시
		System.out.println(now.get(Calendar.HOUR_OF_DAY)); //시
		System.out.println(now.get(Calendar.MINUTE)); //분
		System.out.println(now.get(Calendar.SECOND)); //초
		System.out.println(now.get(Calendar.MILLISECOND)); //밀리초(1000ms -> 1s)
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;
		int date = now.get(Calendar.DATE);
		int hour = now.get(Calendar.HOUR);
		int hour_of_day = now.get(Calendar.HOUR_OF_DAY); //분
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		int millisecond = now.get(Calendar.MILLISECOND);
		
		
		//현재표시
		System.out.println(year + "년 " + month + "월 " + date + "일 " + hour + "시 " + minute + "분 " + second + "초 " + millisecond + "ms");
		
	}

}
