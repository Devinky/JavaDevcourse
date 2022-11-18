package org.study.utilEX;

import java.time.LocalTime;

public class LocalTimeEX {
	
	public static void main(String[] args) {
		System.out.println("LocalTime");
		
		LocalTime lTime = LocalTime.now();
		System.out.println(lTime);
		
		System.out.println(lTime.getHour());
		System.out.println(lTime.getMinute());
		System.out.println(lTime.getSecond());
		System.out.println(lTime.getNano());
		System.out.println();
		
		LocalTime lTime2 = LocalTime.of(10, 30, 20);
		System.out.println(lTime2);
		System.out.println(lTime2.getHour());
		System.out.println(lTime2.getMinute());
		System.out.println(lTime2.getSecond());
	}

}
