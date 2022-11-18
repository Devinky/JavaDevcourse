package org.study.operatorEX;

import java.util.Scanner;

public class operator11 {
	
	public static void main(String[] args) {
		
		System.out.println("삼항연산자");
		
		System.out.println("숫자 입력 : ");
		
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		
		int result = num>10?1:0;
		System.out.println("결과: " + result);
		
		boolean boo1 = num>10?true:false;
		System.out.println("결과 : " + boo1);
		
		String str1 = num>10?"10보다 크다.":"10보다 크지 않다.";
		System.out.println("결과 : " + str1);
		
		if(num>10) {
			System.out.println("10보다 크다.");
		} else {
			System.out.println("10보다 크지 않다.");
		}
		
		}

	}

