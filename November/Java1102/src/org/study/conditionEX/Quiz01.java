package org.study.conditionEX;

import java.util.Scanner;

public class Quiz01 {
	
	public static void main(String[] args) {
		//int형 두 수를 Scanner클래스에 입력해서 변수에 저장하고
		//산술연산자(+*/-)를 Scanner 클래스를 이용해 입력 받아(if)
		//연산에 따라 계산하여 결과값 콘솔에 표시하는 프로그램 만들기
		
		//조건문(if~else if)
		//변수 입력값(2개) -> int num1, int num2
		//변수 연산자(+-*/) -> String op;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("연산할 첫번째 수를 입력하세요 : ");
		int num1 = input.nextInt();
		
		System.out.print("연산할 두번째 수를 입력하세요 : ");
		int num2 = input.nextInt();
		
		System.out.print("어떤 연산을 하시겠습니까? (+-*/) : ");
		String op = input.next();
		
		String rs = ""; //이런 방법도 있음
		
		if(op.equals("+")) {
			//System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
			rs = num1 + " + " + num2 + " = " + (num1+num2);
		}else if(op.equals("-")) {
			//System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
			rs = num1 + " - " + num2 + " = " + (num1-num2);
		}else if(op.equals("*")) {
			//System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
			rs = num1 + " * " + num2 + " = " + (num1*num2);
		}else if(op.equals("/")) {
			//System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
			rs = num1 + " / " + num2 + " = " + (num1/num2);
		}else {
			rs = "연산자 입력 오류. 다시 입력해주세요.";
		}
		
		System.out.println(rs); //이런 방법도 있음
		input.close();
		
	}
	
}
