package org.study.exception;

public class ExceptionEX08 {
	public static void main(String[] args) {
		
		try {
			System.out.println(1);
			//고의로 예외 발생
			throw new Exception();
//			System.out.println(2); -> 오류 발생(고의로 예외를 발생시켰으니까)
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(3);
		}
		System.out.println(4);
		System.out.println("프로그램 정상 종료");
	}
}
