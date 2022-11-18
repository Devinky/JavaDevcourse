package org.study.OperatorEx;

import java.util.Scanner;

public class operator03 {
	
	public static void main(String[] args) {
		
		System.out.println("대입연산자");
		
		Scanner scn = new Scanner(System.in);
		System.out.println("숫자1 : ");
		int num1 = scn.nextInt();
		
		System.out.println("숫자2 : ");
		int num2 = scn.nextInt();
		
		System.out.println(num1 > num2);
		System.out.println(num1 >= num2);
		System.out.println(num1 < num2);
		System.out.println(num1 <= num2);
		System.out.println(num1 == num2);
		System.out.println(num1 != num2);
		
		if(num1 > 10) {
			System.out.println(num1 + "은 10보다 큰 수입니다.");
		}
		else System.out.println(num1 + "은 10보다 작은 수입니다.");
		
		if(num2 > 10) System.out.println(num2 + "은 10보다 큰 수입니다.");
		else System.out.println(num2 + "은 10보다 작은 수입니다.");
		
		
		int age = 11;
		String strAge = "10";
		
		System.out.println(strAge.equals("12"));
	
		scn.close();
	}

}
