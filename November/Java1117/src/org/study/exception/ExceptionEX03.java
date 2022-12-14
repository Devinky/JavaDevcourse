package org.study.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEX03 {
	public static void main(String[] args) {
		System.out.println("Exception");
		
		//InputMismatchException -> 입력값과 변수의 타입이 맞지않다
		
		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		
		try {
			int num1 = input.nextInt();
			System.out.println(num1);
			System.out.println("정상실행");			
		}catch(InputMismatchException e) {
			e.printStackTrace();
		}finally {
			System.out.println("기본실행");
		}
		
		input.close();
	}

}
