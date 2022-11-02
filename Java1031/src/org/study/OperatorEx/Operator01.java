package org.study.OperatorEx;

import java.util.Scanner;

public class Operator01 {
	public static void main(String[] args) {
		System.out.println("산술연산자");
		
		//int num1 = 10;
		//int num2 = 20;

		Scanner scn = new Scanner(System.in);
		
		System.out.println("두 숫자(정수)를 입력 받아 산술연산을 하시오");
		
		System.out.print("첫번째 숫자 : ");
		int num1 = scn.nextInt();
		
		System.out.print("두번째 숫자 : ");
		int num2 = scn.nextInt();
		
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
		System.out.println(num1 + " / " + num2 + " = " + (num1 / (double)num2));
		//값이 정답인 0.5가 아닌 0이 나오는 이유 : 숫자끼리 연산하면 int가 되기 때문. 피연산자 하나를 double로 바꿔주자
		System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
	}

}
