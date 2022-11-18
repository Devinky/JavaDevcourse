package org.study.utilEX;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1117 {
	
	public static void main(String[] args) {

//		try {
//			//class를 찾는~ Oracle JDBC드라이버
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			System.out.println("Oracle Driver Connect Seccess!");
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//			System.out.println("Oracle Driver Connect Fail!");
//		}
//		
		// 1.날짜
		Date now = new Date();
		// 2.포맷
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//3.포맷한 곳에 날짜를 집어넣음
		String day1 = sdf.format(now);
		
		System.out.println(day1);
		
	}
	

}
