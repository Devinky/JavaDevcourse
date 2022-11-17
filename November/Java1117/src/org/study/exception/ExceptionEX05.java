package org.study.exception;

import java.util.Scanner;

public class ExceptionEX05 {
	public static void main(String[] args) {
		System.out.println("Exception");
		
		int num1 = 10;
		
		int[] arrint = new int[5];
		
		Scanner input = new Scanner(System.in);
		System.out.println("");
		
		try {
			System.out.print("숫자를 입력: ");
			int num2 = input.nextInt();
			
			System.out.println(num2);
			System.out.println(num1/num2);
			System.out.println(arrint[5]);
			System.out.println("OK");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("기본실행");
		}
		
		System.out.println("프로그램 정상 실행");
		input.close();
				
	}

}
