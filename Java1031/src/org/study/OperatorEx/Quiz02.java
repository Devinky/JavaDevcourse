package org.study.OperatorEx;

import java.util.Scanner;

public class Quiz02 {
	
	public static void main(String[] args) {
		
		/*
		 Scanner를 이용하여 두 정수(int num1, int num2)와 연산자 하나를 입력 받아
		 연산자가 "+"면 num1 + num2
		 연산자가 "-"면 num1 - num2
		 연산자가 "*"면 num1 * num2
		 연산자가 "/'면 num1 / num2
		 연산자가 "%"면 num1 % num2를 콘솔에 출력하시오
		 */
		
		Scanner scn = new Scanner(System.in);
		System.out.print("계산할 첫번째 수를 입력하세요 : ");
		int num1 = scn.nextInt();
		System.out.print("연산자를 입력하세요 : ");
		String oper = scn.next();
		System.out.print("계산할 두번째 수를 입력하세요 : ");
		int num2 = scn.nextInt();
		
		if(oper.equals("+")) {
			System.out.println("결과 : " + (num1 + num2));
		}else if(oper.equals("-")) {
			System.out.println("결과 : " + (num1 - num2));
		}else if(oper.equals("*")) {
			System.out.println("결과 : " + (num1 * num2));
		}else if(oper.contentEquals("/")) {
			System.out.println("결과 : " + (num1 / num2));
		}else {
			System.out.println("결과 : " + (num1 % num2));
		}
			
		scn.close();
	}

}
