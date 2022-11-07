package org.study.oop;

import java.util.Scanner;

public class CalculatorEXMain {
	
	public static void main(String[] args) {
		//Caculator 생성 후에 필드 num1, num2, op를 초기화
		//op에 따라서 +-*/% -> if~else문 이용
		//method sum(+), sub(-), mult(*), div(/), rem(%)
		//호출하는 프로그램을 작성
		
		CalculatorEX c1 = new CalculatorEX();
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("연산할 첫번째 수 : ");
		c1.num1 = input.nextInt();
		
		System.out.print("연산자 : ");
		c1.op = input.next();
		
		System.out.print("연산할 두번째 수 : ");
		c1.num2 = input.nextInt();
		
		if(c1.op.equals("+")) {
			c1.sum();
		}else if(c1.op.equals("-")) {
			c1.sub();
		}else if(c1.op.equals("*")) {
			c1.mult();
		}else if(c1.op.equals("/")) {
			c1.div();
		}else if(c1.op.equals("%")) {
			c1.rem();
		}else {
			System.out.println("연산자 입력 오류");
		}
		
		input.close();
	}
	
}
