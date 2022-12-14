package org.study.utilEX;

import java.util.Calendar;
import java.util.TimeZone;

public class TimeEX {
	
	public static void main(String[] args) {
		
		//1970.01.01 기준으로 얼마만큼의 시간(밀리초)이 지났는지
		long time = System.currentTimeMillis();
		System.out.println("1970년의 시작부터 지금까지 : " + time);

		long time1 = System.currentTimeMillis();
		long time2 = System.currentTimeMillis();
		
		System.out.println("경과시간(초) 구하기 : " + (time2 - time1)/1000.0);
		System.out.println();
		
		TimeZone us = TimeZone.getTimeZone("US/Samoa");
		TimeZone eu = TimeZone.getTimeZone("Europe/London");
		
		System.out.println(us);
		System.out.println(eu);
		System.out.println();
		
		Calendar ca1 = Calendar.getInstance(us);
		Calendar ca2 = Calendar.getInstance(eu);
		
		System.out.println(ca1.get(Calendar.YEAR));
	}

}
