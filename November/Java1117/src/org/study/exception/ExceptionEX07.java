package org.study.exception;

public class ExceptionEX07 {
	public static void main(String[] args) {
		System.out.println("Exception");
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Oracle Driver OK");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Oracle Driver Null");
		}
		
		System.out.println("프로그램 정상 실행");
		
				
	}

}
