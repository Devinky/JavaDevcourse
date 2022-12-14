package org.study.utilEX;

import java.time.LocalDate;
import java.util.Date;

public class LocalDateEX {
	
	public static void main(String[] args) {
		System.out.println("LocalDate");
		System.out.println(new Date());
		
		LocalDate lDate = LocalDate.now();
		
		System.out.println(lDate);
		
		System.out.println(lDate.getYear()); //년
		System.out.println(lDate.getMonth()); //월, 객체
		System.out.println(lDate.getMonthValue()); //월숫자(7)
		System.out.println(lDate.getDayOfYear()); //일(년기준)
		System.out.println(lDate.getDayOfMonth()); //일(달기준)
		System.out.println(lDate.getDayOfWeek()); //요일
		System.out.println(lDate.isLeapYear()); //윤년여부
		
		System.out.println("\nLocalDate.of(2022, 11, 17)");
		
		LocalDate ldate2 = LocalDate.of(2022, 11, 17);
		System.out.println(ldate2);
	}

}
