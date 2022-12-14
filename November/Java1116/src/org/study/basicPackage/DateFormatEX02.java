package org.study.basicPackage;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatEX02 {
	
	public static void main(String[] args) {
		System.out.println("DateFormat");
		
		Date now = new Date();
		System.out.println(now);
		
		//날짜(시간제외), (타입, 국가)
		DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, Locale.KOREA);
//		DateFormat df2 = DateFormat.getDateInstance(DateFormat.LONG, Locale.KOREA);
//		DateFormat df3 = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.KOREA);
//		DateFormat df4 = DateFormat.getDateInstance(DateFormat.SHORT, Locale.KOREA);
//		DateFormat df5 = DateFormat.getDateInstance(DateFormat.DEFAULT, Locale.KOREA);
		
		System.out.println(df1.format(now));
		
		DateFormat df2 = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.KOREA);
														//날짜			//시간			//지역
		System.out.println(df2.format(now));

	}

}
