package org.study.exception;

import java.util.Scanner;

public class ExceptionEX01 {
	public static void main(String[] args) {
		System.out.println("Exception");
		
		//Scanner 정수를 입력 받고 num1을 나누어서 결과를 출력하기
		int num1 = 100;
		
		try {
			//예외가 발생할 수 있는 명령문을 입력
			Scanner input = new Scanner(System.in);
			
			System.out.print("숫자를 입력하세요 : ");
			int num2 = input.nextInt();
			
			int result = num1/num2;
			System.out.println(result);
			System.out.println("정상실행");
			//예외가 발생하지 않으면 정상실행
			input.close();
			
		}catch(ArithmeticException e) {
			//발생할 것 같은 예외를 적어두기
			//그 예외가 발생하면 catch가 잡아서 여기에 적인 실행문을 실행함
			e.printStackTrace();
			System.out.println("예외처리문");
	
		}finally {
			System.out.println("예외와 상관없이 실행");
		}
		
		System.out.println("프로그램 정상 실행");
	
	}

}
