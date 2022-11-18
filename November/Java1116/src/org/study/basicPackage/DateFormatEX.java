package org.study.basicPackage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatEX {
	
	public static void main(String[] args) {
		System.out.println("SimpleDateFormat");
		
		//1.날짜생성
		Date now = new Date();
		
		//2. 날짜 포맷 설정
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		
		//3. 날짜 포맷에 날짜를 설정
		String day1 = format.format(now);	
		System.out.println(day1);
		
		SimpleDateFormat format2 = new SimpleDateFormat("yyyy년MM월dd일 hh시mm분ss초");
		
		String day2 = format2.format(now);
		System.out.println(day2);
		
		Date day3 = new Date(2022-1900, 10, 16, 16, 8, 12);
		//월은 0~11(하나 적게 넣어야함)
		System.out.println(day3);
		System.out.println(format.format(day3));
		System.out.println(format2.format(day3));
	}

}
